package com.cst.oneToMany.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "department_tbl")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String departmentName;
    private String description;
    @ToString.Exclude
    @Getter(AccessLevel.NONE)
    @ManyToOne
    @JoinColumn(name = "studentId")
    Student student;
}
