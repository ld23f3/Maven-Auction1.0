package com.etc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.etc.dao.AuthorDao;
import com.etc.entity.Author;
import com.etc.service.AuthorService;

@Service("authorService")
public class AuthorServiceImpl implements AuthorService {
	@Resource(name="authorDao")
	AuthorDao ad;

	public List<Author> getAuthors() {
		return ad.queryAuthors();
	}

	public boolean addAuthor(Author au) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delAuthorById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updAuthorById(Author au) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
