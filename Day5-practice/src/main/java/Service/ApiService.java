package Service;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.BookRepo;

@Service
public class ApiService
{
	@Autowired
	BookRepo br;
	public List<Book> findAll()
	{
		return br.findAll();
	}
}
