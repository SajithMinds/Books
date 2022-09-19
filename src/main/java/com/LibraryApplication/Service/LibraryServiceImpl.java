package com.LibraryApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.LibraryApplication.Model.Library;
import com.LibraryApplication.Repository.LibraryRepository;
@Component
public class LibraryServiceImpl implements LibraryService {
@Autowired
 LibraryRepository repos;

@Override
public Library savebook(Library books) {
	// TODO Auto-generated method stub
	return repos.save(books);
}

@Override
public List<Library> getAllbooks() {
	// TODO Auto-generated method stub
	return repos.findAll();
}






}
