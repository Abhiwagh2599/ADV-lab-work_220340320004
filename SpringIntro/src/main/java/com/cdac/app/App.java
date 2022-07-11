package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.HelloWord;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("my-spring-config.xml ");
		HelloWord hw=(HelloWord)ctx.getBean("hello");
		System.out.println(hw.sayHello("Abhishek"));
	}

}
