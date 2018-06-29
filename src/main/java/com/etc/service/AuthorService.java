package com.etc.service;

import java.util.List;

import com.etc.entity.Author;

public interface AuthorService {
	/**
	 * ��ѯ���е�����
	 * @return
	 */
	public List<Author> getAuthors() ;
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
