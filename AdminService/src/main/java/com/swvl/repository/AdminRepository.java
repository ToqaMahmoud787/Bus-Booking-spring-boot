package com.swvl.repository;

import com.swvl.model.Admin;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	List<Admin> findByEmail(String email);
    
}
