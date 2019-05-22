package com.uca.capas.dao;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uca.capas.domain.Book;

@Repository
public class BookDAOImpl implements BookDAO {
	
	@PersistenceContext(unitName = "capas")
	private EntityManager entityManager;

	@Override
	public List<Book> findAll() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.books");
		Query query = entityManager.createNativeQuery(sb.toString(), Book.class);
		List<Book> res = query.getResultList();
		return res;
	}
	
	@Override
	public BigInteger count() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("select sum(existencia)from public.books;");
		Query query = entityManager.createNativeQuery(sb.toString());
		BigInteger res = (BigInteger) query.getSingleResult();
		return res;
	}
	
	@Override
	public BigInteger countA() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("select count(autor) from public.books;");
		Query query = entityManager.createNativeQuery(sb.toString());
		BigInteger res = (BigInteger) query.getSingleResult();
		return res;
	}

	@Override
	public Book findOne(Integer codigo) throws DataAccessException {
		Book c = entityManager.find(Book.class, codigo);
		return c;
	}
	
	public void save(Book c, Integer newRow) throws DataAccessException {
		try{
			if(newRow == 1)	entityManager.persist(c);
			else c = entityManager.merge(c);
			entityManager.flush();
		}catch(Exception e){
			throw e;
		}
	}

	@Override
	public BigInteger countS(String s,String t) {
		StringBuffer sb = new StringBuffer();
		sb.append("select count("+t+") from public.books where "+t+"= '"+s+"' ;");
		Query query = entityManager.createNativeQuery(sb.toString());
		BigInteger res = (BigInteger) query.getSingleResult();
		return res;
	}

	@Override
	public List<Book> findS(String param, String aut) {
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.books where "+aut+"= '"+param+"';");
		Query query = entityManager.createNativeQuery(sb.toString(), Book.class);
		List<Book> res = query.getResultList();
		return res;
	}

}
