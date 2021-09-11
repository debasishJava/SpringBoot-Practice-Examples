package deb.lip.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import deb.lip.model.Student_02;
import deb.lip.repo.StudentRepo;

@Component
public class StudentRunner implements CommandLineRunner{

	@Autowired
	private StudentRepo stdRepo;

	@Override
	public void run(String... args) throws Exception {
		stdRepo.save(new Student_02(101,"mike","java",1500.0));
	}
	
	
}
