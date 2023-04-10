package com.cst.oneToMany.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "student_tbl")
public class Student {
    @Id
    @Column(name = "student_id", nullable = false)
    @GeneratedValue(generator = "student_gen",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "student_gen", sequenceName = "student_seq", initialValue =100, allocationSize = 1)
    private Long studentId;
    private String rollNumber;
    private String name;
    @ElementCollection( fetch = FetchType.EAGER)
    @CollectionTable(name = "student_email")
    private Set<String> email;
    private LocalDateTime dateOfJoining;
    private LocalDateTime dateOfBirth;

    /*
     Uni-direction One to one Mapping without Repository
     */
    @OneToOne(cascade = CascadeType.ALL)
    private Laptop laptop;

    /*
     Uni-direction One to Many Mapping
     */
    @OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL)
    @JoinColumn(name ="stuAdr_fk", referencedColumnName ="student_id"  )
    private Set<Address> address;

    /*
     bi-direction One to Many Mapping
     */
    @OneToMany(mappedBy = "student", targetEntity = Department.class, cascade = CascadeType.ALL)
    private List<Department> departments;
}
