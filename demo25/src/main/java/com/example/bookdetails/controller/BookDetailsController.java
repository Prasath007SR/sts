package com.example.bookdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookdetails.model.BookDetailsModel;
import com.example.bookdetails.repository.BookDetailsRepository;

@RestController
public class BookDetailsController
{
	@Autowired
	BookDetailsRepository bdr;
	@GetMapping("/app")
	public List<BookDetailsModel> getDetailsById()
	{
		return bdr.findAll();
	}
	@GetMapping("/app/{id}")
	public BookDetailsModel getDetailsById(@PathVariable int id)
	{
		return bdr.findById(id).orElse(null);
	}
	@PostMapping("/save")
	public BookDetailsModel getDetailsById1(@RequestBody BookDetailsModel id)
	{
		return bdr.save(id);
	}
	@PutMapping("save/{id}")
	public BookDetailsModel getDetailsById2(@RequestBody BookDetailsModel id)
	{
		return bdr.save(id);
	}
	@DeleteMapping("/lo/{id}")
	public String getDetailsById4(@PathVariable int id)
	{
		bdr.deleteById(id);
		return "Details Deleted";
	}
	@GetMapping("/lo/{od}")
	public List<BookDetailsModel> getDetailById10(@PathVariable String id)
	{
		return bdr.getDetailById10(id);
	}
}
