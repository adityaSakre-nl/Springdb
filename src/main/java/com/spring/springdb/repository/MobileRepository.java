package com.spring.springdb.repository;

import com.spring.springdb.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileRepository extends JpaRepository<Address,Integer> {
}
