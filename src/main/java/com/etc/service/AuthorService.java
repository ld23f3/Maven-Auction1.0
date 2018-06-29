package com.etc.service;

import java.util.List;

import com.etc.entity.Author;

public interface AuthorService {
	/**
	 * 查询所有的作者
	 * @return
	 */
	public List<Author> getAuthors() ;
	/**
	 * 增加新的作者
	 * @param au 作者
	 * @return
	 */
	public boolean addAuthor(Author au);
	/**
	 * 根据id删除作者
	 * @param id
	 * @return
	 */
	public boolean delAuthorById(int id);
	/**
	 * 根据文章id修改作者信息
	 * @return 
	 */
	public boolean updAuthorById(Author au);
}
