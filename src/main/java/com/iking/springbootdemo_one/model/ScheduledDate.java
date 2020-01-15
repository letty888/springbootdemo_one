package com.iking.springbootdemo_one.model;

import java.io.Serializable;

public class ScheduledDate implements Serializable {
	
	private String hour;
	
	private String minute;
	
	private String second;
	
	public String getCron(){
		if(second == null || "".equals(second)){
			second = "*";
		}
		if(minute == null || "".equals(minute)){
			minute = "*";
		}
		if(hour == null || "".equals(hour)){
			hour = "*";
		}
		// *代表任意值    ?
		return second + " " + minute + " " + hour +" * * ?"; //秒     分     时     任意天     任意月     不考虑星期
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getMinute() {
		return minute;
	}

	public void setMinute(String minute) {
		this.minute = minute;
	}

	public String getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second = second;
	}

}
