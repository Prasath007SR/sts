package com.example.form.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.form.model.LoginModel;

@Repository
public interface LoginRepository extends JpaRepository<LoginModel,String>
{
	
}
