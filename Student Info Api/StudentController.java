package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.serviceimpl.StudentServiceImpl;

@RestController
@RequestMapping(value="/Studentdetails"
		)

public class StudentController {
@Autowired
StudentServiceImpl ServiceImpl;
@PostMapping
public StudentEntity createStudentDetails(@RequestBody StudentEntity entity) {
StudentEntity data=ServiceImpl.createData(entity);
return data;
}
@GetMapping
public List<StudentEntity> getAllDetails()
{
List<StudentEntity>allstudentdetails=ServiceImpl.getAllStudentDetails();
return allstudentdetails;	
}
@GetMapping(value= "{id}")
public StudentEntity getDetailsById(@PathVariable int id)	{
StudentEntity studentDetailsById=ServiceImpl.getStudentDetailsByID(id);
return studentDetailsById;
}
@PatchMapping(value="/{id}")
public StudentEntity UpdateDetailsById(@PathVariable int id,@RequestBody StudentEntity entity){ {
StudentEntity updateStudentDetailsById=ServiceImpl.UpdateStudentDetailsById(id, entity);
return updateStudentDetailsById;
}
}
@DeleteMapping(value="/{id}")
public void deleteDetailsById(@PathVariable int id) {

ServiceImpl.deleteStudentDetailsById(id);

}


}
