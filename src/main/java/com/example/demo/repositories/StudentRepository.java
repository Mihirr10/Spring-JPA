package com.example.demo.repositories;

import com.example.demo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

  @Query("select s FROM Student s WHERE s.firstName=?1")
  public List<Student> findByFirstName(String firstName);
}
