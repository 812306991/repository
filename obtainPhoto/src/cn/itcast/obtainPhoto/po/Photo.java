package cn.itcast.obtainPhoto.po;

import java.io.Serializable;

public class Photo implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private String fileId;
	private byte[] photo;
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	
	

}
