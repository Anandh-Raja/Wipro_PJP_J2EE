package com.wipro.springsample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MovieMain {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("moviebeans.xml");
	Movie movies = context.getBean(Movie.class);
	movies.display();
	
}
}

