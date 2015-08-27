package lt.aurimas.repository;

import lt.aurimas.model.Student;

public interface StudentRepository {
	
	Student findByUserName(String userName);
	
	Student saveStudent(Student student);
}
