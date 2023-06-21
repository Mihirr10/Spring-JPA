package com.example.demo;



import com.example.demo.entities.Student;
import com.example.demo.services.Services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

  @Autowired
	Services services;
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(DemoApplication.class);
		logger.info("starting the application");
		SpringApplication.run(DemoApplication.class, args);



	}

	@Override
	public void run(String... args) throws Exception {

		 Student student1=new Student(101,"mihir","parmar","mihirparmar031@gmail.com",23);
		 services.addStudent(student1);



		System.out.println("mihir");

	}



}
