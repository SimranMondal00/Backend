package com.example.Spring_data_jpa;

import com.example.Spring_data_jpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

//		s1.setRollNo(101);
//		s1.setName("Simran");
//		s1.setMarks(98);
//
//		s2.setRollNo(102);
//		s2.setName("Sran");
//		s2.setMarks(97);
//
//		s3.setRollNo(103);
//		s3.setName("Sim");
//		s3.setMarks(95);
//
//		repo.save(s1);
//		System.out.println(repo.findAll());
		System.out.println(repo.findByName("Simran"));
	}

}
