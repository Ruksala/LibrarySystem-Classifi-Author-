package com.librarySys;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.librarySys.Service.AuthorService;
import com.librarySys.impl.AuthorServiceimpl;
import com.sgic.model.Author;
import com.sgic.model.Classification;

public class AuthorTest {
	public static void main(String arg[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		AuthorService authorService =context.getBean("authorService",AuthorServiceimpl.class);
		
		Author author = new Author();
		author.setAuthorId(6);
		author.setAuthorName("agdhb");
		
		authorService.addAuthor(author);
		
		
	

	for(Author authorList:authorService.fetchAuthorList()) {
		System.out.println(authorList.getAuthorId()+ " " + authorList.getAuthorName());
	}
	}}


