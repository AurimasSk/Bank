package lt.aurimas.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lt.aurimas.model.Student;

@Repository("studentRepository")
@Transactional
public class StudentRepositoryImpl implements StudentRepository {

	@Override
	public Student findByUserName(String userName) {
		return null;
	}

	@Override
	public Student saveStudent(Student student) {
		return student;	
	}
}
