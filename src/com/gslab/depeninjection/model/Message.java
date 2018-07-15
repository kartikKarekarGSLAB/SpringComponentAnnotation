package com.gslab.depeninjection.model;

public class Message {
	private int id;
	private String message;
	public Message() {
		System.out.println("inside default constuctor : Message");
	}
	public Message(int id, String message) {
		System.out.println("inside param constructor : Message");
		this.id = id;
		this.message = message;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("inside setter of id:message");
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		System.out.println("inside setter of message:message");
		this.message = message;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + "]";
	}
	
}
