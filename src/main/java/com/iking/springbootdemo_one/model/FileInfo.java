package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class FileInfo implements Serializable{

	private String fileName;
	
	private String path;
	
	private List<?> files;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<?> getFiles() {
		return files;
	}

	public void setFiles(List<?> files) {
		this.files = files;
	}
	
}
