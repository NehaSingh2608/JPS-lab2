package com.cg.ems.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.ems.dto.Author;
import com.cg.ems.dto.Book;

public interface BookAuthorService {
	public Author addAuthorDetails(Author auth);
	public Book addBookDetails(Book book);
	public ArrayList<Book> fetchAllBook();
	public Book fetchbyAuthor(String authName);
	public Book fetchByPriceRange(int min ,int max);
	public Author fetchById(int ISBNCode);
}
