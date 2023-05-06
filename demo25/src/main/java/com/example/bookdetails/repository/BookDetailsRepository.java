package com.example.bookdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookdetails.model.BookDetailsModel;

@Repository
public interface BookDetailsRepository extends JpaRepository<BookDetailsModel,Integer>
{
	
}
