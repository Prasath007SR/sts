package com.example.form.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.form.model.SignupModel;

@Repository
public interface SignupRepository extends JpaRepository<SignupModel,String>
{
	
}
