package com.LibraryApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LibraryApplication.Model.Library;

public interface LibraryRepository extends JpaRepository<Library, Integer> {

}
