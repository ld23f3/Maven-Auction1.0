package com.etc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.etc.entity.Author;

@Repository("authorDao")
public interface AuthorDao {
	/**
	 * 查询所有的作者
	 * @return
	 */
	public List<Author> queryAuthors() ;
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
	 * 根据作者id修改作者信息
	 * @return 
	 */
	public boolean updAuthorById(Author au);
}
