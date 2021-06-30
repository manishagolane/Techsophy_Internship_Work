package com.example.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.model.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

	public List<Book> findBybookName(String name);

}
