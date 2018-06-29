package com.etc.entity;

public class Author {
	private int authorId;
	private String authorType;
	private String authorName;
	/**
	 * 默认无参构造
	 */
	public Author(){
		
	}
	/**
	 * 新增调用构造
	 */
	public Author(String authorType,String authorName){
		this.authorType = authorType;
		this.authorName = authorName;
	}
	/**
	 * 获取作者ID
	 * @return
	 */
	public int getAuthorId() {
		return authorId;
	}
	/**
	 * 设置作者ID
	 * @param authorId
	 */
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	/**
	 * 获取作者类型
	 * @return
	 */
	public String getAuthorType() {
		return authorType;
	}
	/**
	 * 设置作者类型
	 * @param authorType
	 */
	public void setAuthorType(String authorType) {
		this.authorType = authorType;
	}
	/**
	 * 获取作者名称
	 * @return
	 */
	public String getAuthorName() {
		return authorName;
	}
	/**
	 * 设置作者名称
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
