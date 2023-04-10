package com.cst.oneToMany.repo;

import com.cst.oneToMany.entity.Student;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    public Optional<Student> findByEmail(String email, Sort sort);
}