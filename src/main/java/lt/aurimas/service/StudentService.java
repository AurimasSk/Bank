package lt.aurimas.service;

import lt.aurimas.model.Student;

public interface StudentService {
	Student save(Student student);
	boolean findByLogin(String userName, String password);
	boolean findByUserName(String userName);
}
