package com.etc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.etc.entity.Author;
import com.etc.service.AuthorService;
@Controller
@RequestMapping("/api")
public class AuthorController {
	@Resource(name="authorService")
	private AuthorService authorService;
	
	
	@RequestMapping(value="/author",method=RequestMethod.GET)
	public String getAuthor(Model model) {
		List<Author> list = authorService.getAuthors();
		model.addAttribute("list",list);
		return "list";
	}
}
