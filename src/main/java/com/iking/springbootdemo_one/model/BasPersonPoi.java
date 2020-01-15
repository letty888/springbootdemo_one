package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class BasPersonPoi implements Serializable{
	private String excelHarder;
	
	private List<ExPerson> exPerson;

	public String getExcelHarder() {
		return excelHarder;
	}

	public void setExcelHarder(String excelHarder) {
		this.excelHarder = excelHarder;
	}

	public List<ExPerson> getExPerson() {
		return exPerson;
	}

	public void setExPerson(List<ExPerson> exPerson) {
		this.exPerson = exPerson;
	}
	
	
}
