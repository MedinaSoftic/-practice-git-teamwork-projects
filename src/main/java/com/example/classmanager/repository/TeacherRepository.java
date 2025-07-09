package com.example.classmanager.repository;

import com.example.classmanager.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    // This interface will automatically provide CRUD operations for Teacher entities
    // No additional methods are needed unless custom queries are required
}
