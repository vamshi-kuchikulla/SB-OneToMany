package com.cst.oneToMany.repo;

import com.cst.oneToMany.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}