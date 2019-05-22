package com.uca.capas.controller;

import java.math.BigInteger;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Book;
import com.uca.capas.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	public BookService bookService;
	
	@RequestMapping("/vertodos")
	public ModelAndView verTodos() {
		ModelAndView mav = new ModelAndView();
		List<Book> books = bookService.findAll();
		BigInteger total = bookService.count();
		BigInteger numAuto = bookService.countA();
		mav.addObject("total",total);
		mav.addObject("books", books);
		mav.addObject("numAuto", numAuto);
		mav.setViewName("allBooks");
		return mav;
	}
	
	@RequestMapping(value="/vertodos", params="buscar", method = RequestMethod.POST)
	public ModelAndView buscar(@RequestParam(value="select") String value,
			@RequestParam(value="param") String parame) {
		ModelAndView mav = new ModelAndView();
		List<Book> books=null;
		BigInteger total=null;
		books = bookService.findS(parame,value);
		total = bookService.countS(parame,value);
		mav.addObject("total",total);
		mav.addObject("parame", parame);
		mav.addObject("value", value);
		mav.addObject("books", books);
		mav.setViewName("paramBooks");
		return mav;
	}
	
	

}
