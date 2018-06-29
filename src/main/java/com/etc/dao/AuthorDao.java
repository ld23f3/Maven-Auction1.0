package com.etc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.etc.entity.Author;

@Repository("authorDao")
public interface AuthorDao {
	/**
	 * ��ѯ���е�����
	 * @return
	 */
	public List<Author> queryAuthors() ;
	/**
	 * �����µ�����
	 * @param au ����
	 * @return
	 */
	public boolean addAuthor(Author au);
	/**
	 * ����idɾ������
	 * @param id
	 * @return
	 */
	public boolean delAuthorById(int id);
	/**
	 * ��������id�޸�������Ϣ
	 * @return 
	 */
	public boolean updAuthorById(Author au);
}
