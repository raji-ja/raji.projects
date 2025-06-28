package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;

@Service
public interface StudentService {
StudentEntity createData(StudentEntity entity);
List <StudentEntity> getAllStudentDetails();
StudentEntity  getStudentDetailsByID(int id);
StudentEntity UpdateStudentDetailsById(int id,StudentEntity entity);
void deleteStudentDetailsById(int id);



}
