package com.org.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.domain.Emp;

public interface  EmpRepo  extends JpaRepository<Emp, Integer>{

}
