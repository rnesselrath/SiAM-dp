package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.eclipse.swt.dnd.ByteArrayTransfer;
import org.eclipse.swt.dnd.TransferData;


import de.dfki.iui.mmds.core.model.dialogue.ExecutableContent;

public class CustomTransfer extends ByteArrayTransfer {

	private static CustomTransfer instance = new CustomTransfer();
	private static final String TYPE_NAME = "gadget-transfer-format";
	private static final int TYPEID = registerType(TYPE_NAME);

	public CustomTransfer() {
	}

	/**
	 * Returns the singleton gadget transfer instance.
	 */
	public static CustomTransfer getInstance() {
		return instance;
	}

	protected ExecutableContent[] fromByteArray(byte[] bytes) {
		DataInputStream in = new DataInputStream(
				new ByteArrayInputStream(bytes));

		try {
			/* read number of gadgets */
			int n = in.readInt();
			/* read gadgets */
			ExecutableContent[] gadgets = new ExecutableContent[n];
			for (int i = 0; i < n; i++) {
				ExecutableContent gadget = null;// readGadget(null, in);
				if (gadget == null) {
					return null;
				}
				gadgets[i] = gadget;
			}
			return gadgets;
		} catch (IOException e) {
			return null;
		}
	}

	@Override
	protected int[] getTypeIds() {
		// TODO Auto-generated method stub
		return new int[] { TYPEID };
	}

	@Override
	protected String[] getTypeNames() {
		// TODO Auto-generated method stub
		return new String[] { TYPE_NAME };
	}
	
	 /*
	    * Method declared on Transfer.
	    */
	   protected void javaToNative(Object object, TransferData transferData) {
	      byte[] bytes = toByteArray((ExecutableContent[])object);
	      if (bytes != null)
	         super.javaToNative(bytes, transferData);
	   }
	   /*
	    * Method declared on Transfer.
	    */
	   protected Object nativeToJava(TransferData transferData) {
	      byte[] bytes = (byte[])super.nativeToJava(transferData);
	      return fromByteArray(bytes);
	   }
	   
	   /**
	    * Reads and returns a single gadget from the given stream.
	    */
	   private ExecutableContent readExecutableContent(ExecutableContent parent, DataInputStream dataIn) throws IOException {
	      /**
	       * Gadget serialization format is as follows:
	       * (String) name of gadget
	       * (int) number of child gadgets
	       * (Gadget) child 1
	       * ... repeat for each child
	       */
	      String name = dataIn.readUTF();
//	      int n = dataIn.readInt();
//	      Gadget newParent = new Gadget(parent, name);
//	      for (int i = 0; i < n; i++) {
//	         readGadget(newParent, dataIn);
//	      }
//	      return newParent;
	      return null;
	   }
	   
	   protected byte[] toByteArray(ExecutableContent[] ecs) {
		      /**
		       * Transfer data is an array of gadgets.  Serialized version is:
		       * (int) number of gadgets
		       * (Gadget) gadget 1
		       * (Gadget) gadget 2
		       * ... repeat for each subsequent gadget
		       * see writeGadget for the (Gadget) format.
		       */
		      ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		      DataOutputStream out = new DataOutputStream(byteOut);

		      byte[] bytes = null;

		      try {
		         /* write number of markers */
		         out.writeInt(ecs.length);

		         /* write markers */
		         for (int i = 0; i < ecs.length; i++) {
		        	 writeExecutableContent((ExecutableContent)ecs[i], out);
		         }
		         out.close();
		         bytes = byteOut.toByteArray();
		      } catch (IOException e) {
		         //when in doubt send nothing
		      }
		      return bytes;
		   }
	   
	   /**
	    * Writes the given gadget to the stream.
	    */
	   private void writeExecutableContent(ExecutableContent ec, DataOutputStream dataOut) throws IOException {
	      /**
	       * Gadget serialization format is as follows:
	       * (String) name of gadget
	       * (int) number of child gadgets
	       * (Gadget) child 1
	       * ... repeat for each child
	       */
	      dataOut.writeUTF(ec.getClass().getName());
	   }

}
