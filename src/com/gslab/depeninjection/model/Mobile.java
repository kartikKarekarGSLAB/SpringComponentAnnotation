package com.gslab.depeninjection.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	@Value("1002")
	private int mobileNumber;
	@Value("kartik karekar")
	private String holderName;
	@Value("Pune")
	private String city;
	@Autowired
	private Message message;	
	public Mobile(int mobileNumber, String holderName, String city, Message message) {
		System.out.println("inside param cons : Mobile");
		this.mobileNumber = mobileNumber;
		this.holderName = holderName;
		this.city = city;
		this.message = message;
	}
	public Mobile() {
		System.out.println("inside default cons : Mobile");
	}
	
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		System.out.println("inside setter mobileNumber");
		this.mobileNumber = mobileNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Mobile [mobileNumber=" + mobileNumber + ", holderName=" + holderName + ", city=" + city + ", message="+message+" ]";
	}
	
}	
