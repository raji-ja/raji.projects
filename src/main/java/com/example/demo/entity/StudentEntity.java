
package com.example.demo.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name="STUDENTDETAILS")

public class StudentEntity {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
private  int id;
@Column (name="NAME")
private String name;
@Column(name="DEPARTMENT")
private  String department;
@Column (name="SCHOOLNAME")
private String schoolName;




}
