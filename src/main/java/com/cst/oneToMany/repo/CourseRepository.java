package com.cst.oneToMany.repo;

import com.cst.oneToMany.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Department, Long> {
}