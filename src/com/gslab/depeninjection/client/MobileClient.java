package com.gslab.depeninjection.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.gslab.depeninjection.model.Message;
import com.gslab.depeninjection.model.Mobile;
import com.gslab.depeninjection.model.Student;

public class MobileClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationFileContext = new FileSystemXmlApplicationContext("resources//xml//mobile.xml");
		Student redmi = applicationFileContext.getBean("studentBean",Student.class);
		System.out.println(redmi);
		((FileSystemXmlApplicationContext)applicationFileContext).close();
	}

}
