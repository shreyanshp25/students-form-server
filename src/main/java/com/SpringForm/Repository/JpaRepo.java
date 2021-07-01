package com.SpringForm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringForm.Models.Students;

@Repository
public interface JpaRepo extends JpaRepository<Students, Integer> {
	Students findByName(String Name);

}
