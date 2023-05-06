package Controllers;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



import Service.ApiService;

@RestController
public class ApiController
{
	@Autowired
	ApiService as;
	@GetMapping("{id}")
	public List<Book> getAllDetails()
	{
		return as.findAll();
	}
}
