package com.LibraryApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LibraryApplication.Model.Library;
import com.LibraryApplication.Service.LibraryServiceImpl;

@RestController
@RequestMapping("/api")
public class LibraryController {
	@Autowired
	 private LibraryServiceImpl service;
	
	@PostMapping("/save")
	public Library savebooks(@RequestBody Library books) {
		return service.savebook(books);
	}
	
	@GetMapping("/list")
	public List<Library> getAlList(){
	return service.getAllbooks();
	}
}
