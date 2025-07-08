package com.example.classmanager.repository;

import com.example.classmanager.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // This interface will automatically provide CRUD operations for Student entities
    // No additional methods are needed unless custom queries are required
}
