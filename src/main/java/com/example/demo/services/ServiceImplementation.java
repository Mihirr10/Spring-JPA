package com.example.demo.services;

import com.example.demo.entities.Student;
import com.example.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ServiceImplementation implements Services{


  @Autowired
 private StudentRepository studentRepository;
  @Override
  public Student addStudent(Student student) {


    studentRepository.save(student);
    return student;
  }

  @Override
  public void updateStudent(Student student) {

  }

  @Override
  public void deleteStudent(int studentId) {
      studentRepository.deleteById(studentId);
  }

  @Override
  public List<Student> getById(int studentId) {

    return null;
  }

  @Override
  public List<Student> getByfirstName(String firstName) {
    return null;
  }

  @Override
  public List<Student> getByLastName(String lastName) {
    return null;
  }

  @Override
  public List<Student> getByEmail(String email) {
    return null;
  }
}
