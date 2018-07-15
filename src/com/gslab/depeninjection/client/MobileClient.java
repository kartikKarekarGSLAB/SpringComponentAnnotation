package com.gslab.depeninjection.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.gslab.depeninjection.model.Message;
import com.gslab.depeninjection.model.Mobile;

public class MobileClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationFileContext = new FileSystemXmlApplicationContext("resources//xml//mobile.xml");
		Mobile redmi = (Mobile)applicationFileContext.getBean("mobile");
		System.out.println(redmi);
		((FileSystemXmlApplicationContext)applicationFileContext).close();
	}

}
