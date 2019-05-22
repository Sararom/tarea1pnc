package com.uca.capas.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uca.capas.dao.BookDAO;
import com.uca.capas.domain.Book;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookDAO bookDao;
	
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return bookDao.findAll();
	}

	public Book findOne(Integer codigo) {
		// TODO Auto-generated method stub
		return bookDao.findOne(codigo);
	}

	@Transactional
	public void save(Book b) { 
		int newRow = b.getIdlibro() != null ? 0 : 1;
		bookDao.save(b, newRow);
	}

	@Override
	public BigInteger count() {
		return bookDao.count();
	}
	@Override
	public BigInteger countA() {
		return bookDao.countA();
	}

	@Override
	public BigInteger countS(String s,String t) {
		return bookDao.countS(s,t);
	}

	@Override
	public List<Book> findS(String param, String aut) {
		return bookDao.findS(param,aut);
	}


}
