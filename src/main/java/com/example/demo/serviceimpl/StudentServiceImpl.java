package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Component
public class StudentServiceImpl implements StudentService {
@Autowired
	StudentRepository student;

@Override
	public StudentEntity createData(StudentEntity entity) {
		StudentEntity save=student.save(entity);
		return save;
	}

@Override
public List<StudentEntity> getAllStudentDetails() {
	List<StudentEntity> all =student.findAll();
	return all;
}

@Override
public StudentEntity getStudentDetailsByID(int id) {
	StudentEntity studentEntity=null;
	Optional<StudentEntity>byId=student.findById(id);
		if( byId.isPresent()) {
		studentEntity= byId.get();
	}	
		
		return studentEntity;
}

@Override
public StudentEntity UpdateStudentDetailsById(int id, StudentEntity entity) {
	StudentEntity studentEntity=null;
	Optional<StudentEntity>byId=student.findById(id);
	if (byId.isPresent()) {
		studentEntity=byId.get();
	
String name=entity.getName();	

studentEntity.setName(name);

StudentEntity save=student.save(studentEntity);
	return save;
	}
	return studentEntity;
}

@Override
public void deleteStudentDetailsById(int id) {
	
student.deleteById(id);

}

}
