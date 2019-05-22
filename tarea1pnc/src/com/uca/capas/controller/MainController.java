package com.uca.capas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.dao.BookDAO;
import com.uca.capas.domain.Book;

@Controller
public class MainController {
	
	@Autowired
	private BookDAO clienteDao;
	
	@RequestMapping("/")
	public String initMain() {
		return "main";
	}
	
}
