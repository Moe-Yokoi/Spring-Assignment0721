package com.a0521.pma;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.a0521.pma.dao.EmployeeRepository;
import com.a0521.pma.dao.ProjectRepository;
import com.a0521.pma.entity.Employee;
import com.a0521.pma.entity.Project;

@SpringBootApplication
//public class ProjectManagementApplication implements CommandLineRunner{
public class ProjectManagementApplication {
	
	@Autowired
	EmployeeRepository empRepo;
	
	@Autowired
	ProjectRepository proRepo;

	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		
//		Employee emp1 = new Employee("Hoge1", "Hoge1", "hogehoge1@hoge.com");
//		Employee emp2 = new Employee("Hoge2", "Hoge2", "hogehoge2@hoge.com");
//		Employee emp3 = new Employee("Hoge3", "Hoge3", "hogehoge3@hoge.com");
//		
//		Project proj1 = new Project("Project hoge hoge 1", "NOTSTARTED", "description 1");
//		Project proj2 = new Project("Project hoge hoge 2", "COMPLETED", "description 2");
//		Project proj3 = new Project("Project hoge hoge 3", "INPROGRESS", "description 3");
//		
//		//set both sides of the relationship manually
//		proj1.addEmployee(emp1);
//		proj1.addEmployee(emp2);
//		proj2.addEmployee(emp1);
//		proj2.addEmployee(emp3);
//		proj3.addEmployee(emp2);
//		proj3.addEmployee(emp3);
//		
//		emp1.setProjectRels(Arrays.asList(proj1, proj2, proj3));
//		emp2.setProjectRels(Arrays.asList(proj1, proj3));
//		emp3.setProjectRels(Arrays.asList(proj3));
//		
//		//save to database
//		empRepo.save(emp1);
//		empRepo.save(emp2);
//		empRepo.save(emp3);
//		
//		proRepo.save(proj1);
//		proRepo.save(proj2);
//		proRepo.save(proj3);
//	}

}
