package com.etc.entity;

public class Author {
	private int authorId;
	private String authorType;
	private String authorName;
	/**
	 * Ĭ���޲ι���
	 */
	public Author(){
		
	}
	/**
	 * �������ù���
	 */
	public Author(String authorType,String authorName){
		this.authorType = authorType;
		this.authorName = authorName;
	}
	/**
	 * ��ȡ����ID
	 * @return
	 */
	public int getAuthorId() {
		return authorId;
	}
	/**
	 * ��������ID
	 * @param authorId
	 */
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	/**
	 * ��ȡ��������
	 * @return
	 */
	public String getAuthorType() {
		return authorType;
	}
	/**
	 * ������������
	 * @param authorType
	 */
	public void setAuthorType(String authorType) {
		this.authorType = authorType;
	}
	/**
	 * ��ȡ��������
	 * @return
	 */
	public String getAuthorName() {
		return authorName;
	}
	/**
	 * ������������
	 * @param authorName
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorType=" + authorType + ", authorName=" + authorName + "]";
	}
	
}
