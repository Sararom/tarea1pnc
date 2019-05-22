package com.uca.capas.service;

import java.math.BigInteger;
import java.util.List;

import com.uca.capas.domain.Book;

public interface BookService {
	
	public List<Book> findAll();
	
	public Book findOne(Integer codigo);
	
	public void save(Book c);

	public BigInteger count();

	public BigInteger countA();

	public BigInteger countS(String s, String t);

	public List<Book> findS(String param, String aut);

}
