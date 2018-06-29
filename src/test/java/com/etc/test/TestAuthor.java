package com.etc.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.etc.entity.Author;
import com.etc.service.AuthorService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:mybatis-config.xml"})

public class TestAuthor {
	@Resource(name="authorService")
	AuthorService as;
	@Test
	public void test() {
		List<Author>list = as.getAuthors();
		list.forEach(System.out::println);
	}
}
