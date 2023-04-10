package com.cst.oneToMany.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Laptop {
    @Id
    @Column(name = "laptop_id", nullable = false)
    @GeneratedValue(generator = "laptop_gen",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "laptop_gen", sequenceName = "laptop_seq", initialValue =100, allocationSize = 1)
    private int laptopId;
    private String brand;

}
