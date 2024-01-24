package com.example.BookShop.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookShop.Entity.BookShop;
import com.example.BookShop.Repository.BookShopRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class BookShopController {
	@Autowired
	BookShopRepo br;
	
	@PostMapping(value="/add")
	public void add(@RequestBody BookShop bs) {
	      br.save(bs);
	}
	@GetMapping(value="/getAll")
	public List<BookShop> getAll() {
		return br.findAll();
	}

}
