package com.uca.capas.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Book;

public interface BookDAO {
	
	public List<Book> findAll() throws DataAccessException;
	
	public Book findOne(Integer codigo) throws DataAccessException;
	
	public void save(Book c, Integer newRow) throws DataAccessException;

	public BigInteger count() throws DataAccessException;

	public BigInteger countA() throws DataAccessException;

	public BigInteger countS(String s, String t);

	public List<Book> findS(String param, String aut);

}
