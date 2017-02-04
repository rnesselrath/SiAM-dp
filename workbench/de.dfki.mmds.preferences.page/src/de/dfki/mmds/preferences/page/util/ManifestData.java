package de.dfki.mmds.preferences.page.util;

import org.eclipse.core.resources.IFile;

public class ManifestData {
	private IFile mHandle_;
	private String currentVersion_;
	private String newVersion_ = "";
	public ManifestData(IFile handle) {
		mHandle_ = handle;
		currentVersion_ = ManifestFileUtil.getField(handle, ManifestFileUtil.FIELD_BUNDLE_VERSION);
	}
	public String getCurrentVersion() {
		return currentVersion_;
	}
	public void setCurrentVersion(String currentVersion) {
		this.currentVersion_ = currentVersion;
	}
	public String getNewVersion() {
		return newVersion_;
	}
	public void setNewVersion(String newVersion) {
		this.newVersion_ = newVersion;
	}
	public String getProjectName() {
		return mHandle_.getProject().getName();
	}
	public IFile getManifestHandle() {
		return mHandle_;
	}
}
