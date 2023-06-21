package com.example.demo.services;

import com.example.demo.entities.Student;

import java.util.List;



public interface Services {

  Student addStudent(Student student);
  void updateStudent(Student student);
  void deleteStudent(int studentId);

  List<Student> getById(int studentId) ;
  List<Student> getByfirstName(String firstName);
  List<Student> getByLastName(String lastName);

  List<Student> getByEmail(String email);

}
