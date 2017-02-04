package de.dfki.mmds.preferences.page.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.logging.Logger;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

public class ManifestFileUtil {
	private static final String MANIFEST_FOLDER = "META-INF";
	private static final String MANIFEST_FILE = "MANIFEST.MF";
	
	private static final String PLUGIN_PROJECT_NATURE = "org.eclipse.pde.PluginNature";
	
	public static final String FIELD_BUNDLE_VERSION = "Bundle-Version";
	
	public static List<ManifestData> listManifestFiles() {
		ArrayList<ManifestData> manifestFiles = new ArrayList<>();
		try {
			IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
			for(IProject cProj : projects) {
				if(!cProj.isOpen())
					continue;
				
				if(!cProj.hasNature(PLUGIN_PROJECT_NATURE))
					continue;
				
				getLogger().info("Reading manifest in project "+ cProj.getName());
				IFolder mFolder = cProj.getFolder(MANIFEST_FOLDER);
				if(mFolder != null) {
					IFile mFile = mFolder.getFile(MANIFEST_FILE);
					if(mFile != null) {
						getLogger().info("Found manifest file in "+cProj.getName());
						mFile.refreshLocal(IResource.DEPTH_ZERO, null);
						manifestFiles.add(new ManifestData(mFile));
						getLogger().info("MF field: "+getField(mFile, FIELD_BUNDLE_VERSION));
					} else 
						getLogger().info("Couldn't find manifest file in "+cProj.getName());
				} else 
					getLogger().info("Couldn't find manifest folder in "+cProj.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return manifestFiles;
	}
	/**
	 * 
	 * @return
	 */
	private static Logger getLogger() {
		return Logger.getLogger(ManifestFileUtil.class.getName());
	}
	/**
	 * 
	 * @param file
	 * @param fieldName
	 * @return
	 */
	public static String getField(IFile file, String fieldName) {
		try {
			if(file.getContents() == null)
				getLogger().info("IFile descriptor is not valid for file "+file.getFullPath().toOSString());
			
			Manifest mf = new Manifest(file.getContents());
			Attributes mainAttrs = mf.getMainAttributes(); 
			for (Object entryName : mainAttrs.keySet()) { 
				String values = ""; 
				String header = ""; 
	
				//Get the values safely 
				if(entryName instanceof String) { 
					header = (String) entryName; 
					values = mainAttrs.getValue(header); 
				} else if(entryName instanceof Attributes.Name) { 
					header = (String) ((Attributes.Name) entryName).toString(); 
					values = mainAttrs.getValue((Attributes.Name) entryName); 
				} 
				
				if(!fieldName.equals(header))
					continue;
				return values;
			}
			getLogger().info("Field "+fieldName+" was not found in"+file.getFullPath().toOSString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	/**
	 * 
	 * @param filePath
	 * @param versionId
	 * @return
	 */
	public static boolean setField(IFile file, String fieldName, String value) {
		try {
			if(file.getContents() == null) {
				getLogger().info("IFile descriptor is not valid for file "+file.getFullPath().toOSString());
				return false;
			}
			if(fieldName == null || fieldName.isEmpty()) {
				getLogger().info("Trying to set empty field name in"+file.getFullPath().toOSString());
				return false;
			}
			
			if(value == null || value.isEmpty()) {
				getLogger().info("Trying to set empty value in"+file.getFullPath().toOSString()+" field "+fieldName);
				return false;
			}
			
			Manifest mf = new Manifest(file.getContents());
			Attributes mainAttrs = mf.getMainAttributes(); 
			if(mainAttrs.containsKey(fieldName)) {
				getLogger().info("Updating field "+fieldName+":"+mainAttrs.getValue(fieldName)+" in "+file.getFullPath().toOSString()+" to "+value);
				mainAttrs.putValue(fieldName, value);
			} else {
				getLogger().info("Setting field "+fieldName+" in "+file.getFullPath().toOSString()+" to "+value);
				mainAttrs.putValue(fieldName, value);
			}
			File updatedManifest = new File(file.getRawLocation().makeAbsolute().toOSString());
			getLogger().info("Writing to "+updatedManifest.getPath());
			BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream(updatedManifest));
			mf.write(bf);
			file.refreshLocal(IResource.DEPTH_ZERO, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return true;
	}
}
