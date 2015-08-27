package lt.aurimas.repository;

import org.springframework.stereotype.Repository;

import lt.aurimas.model.Student;

@Repository("studentRepository")
public interface StudentRepository {
	
	Student findByUserName(String userName);
	
	Student saveStudent(Student student);
}
