package com.spring.springdb.repository;

import com.spring.springdb.entity.Address;
import com.spring.springdb.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
