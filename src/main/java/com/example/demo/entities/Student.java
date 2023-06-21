package com.example.demo.entities;


import jakarta.persistence.*;

@Entity
public class Student {


  @Id
  @GeneratedValue(generator = "student_seq",strategy = GenerationType.IDENTITY)
  @SequenceGenerator(name = "student_seq",sequenceName = "student_sequence",initialValue = 10,allocationSize = 1)
  private Integer studentId;
  @Column(name = "first_name")
  private String firstName;
  @Column(name = "last_name")
  private String lastName;

  public Student() {
  }

  @Column(name = "email")
  private String email;
  @Column(name = "age")
  private Integer age;

  public Student(Integer studentId, String firstName, String lastName, String email, Integer age) {
    this.studentId = studentId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.age = age;
  }

  public Integer getStudentId() {
    return studentId;
  }

  public void setStudentId(Integer studentId) {
    this.studentId = studentId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;


  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
            "studentId=" + studentId +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", email='" + email + '\'' +
            ", age=" + age +
            '}';
  }
}
