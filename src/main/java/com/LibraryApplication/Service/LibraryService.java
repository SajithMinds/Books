package com.LibraryApplication.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.LibraryApplication.Model.Library;

@Component
public interface LibraryService {
Library savebook(Library books);

List<Library> getAllbooks();
}
