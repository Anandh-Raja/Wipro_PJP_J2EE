package com.wipro.springsample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Messagemain {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("messagebeans.xml");
	Message message = context.getBean(Message.class);
	message.display();
}
}
