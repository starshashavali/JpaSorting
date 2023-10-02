package com.org;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.org.domain.Emp;
import com.org.repo.EmpRepo;

@SpringBootApplication
public class EmpRestApiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context 
		= SpringApplication.run(EmpRestApiApplication.class, args);
		EmpRepo repo = context.getBean(EmpRepo.class);
		
/*		List<Emp> list=new ArrayList<>();
		list.add(new Emp(2,"Krishna",699.8));
		list.add(new Emp(3,"Radha",599.5));
		list.add(new Emp(4,"Bhavani",333.9));
		list.add(new Emp(5,"Durga",666.8));
		list.add(new Emp(6,"Hari",888.8));
		list.add(new Emp(7,"Gopal",444.8));
		list.add(new Emp(8,"Ramya",699.8));
		list.add(new Emp(9,"Maruthi",999.8));
		repo.saveAll(list);*/
		//based name printing
		Sort ascending = Sort.by("name").ascending();
		List<Emp> emps = repo.findAll(ascending);
		emps.forEach(System.out::println);
		System.out.println("================");
		 Sort descending = Sort.by("sal").descending();
		 List<Emp> emp = repo.findAll(descending);
		 emp.forEach(System.out::println);
		 System.out.println("****************two");
		 Sort ascending2 = Sort.by("sal","name").ascending();
		 List<Emp> listOfEmps = repo.findAll(ascending2);
		 listOfEmps.forEach(System.out::println);
		
	}

}
