package com.librarySys.impl;

import java.util.List;

import com.librarySys.Service.AuthorService;
import com.librarySys.dao.AuthorDAO;
import com.sgic.model.Author;


public class AuthorServiceimpl implements AuthorService {
	private AuthorDAO authorDAO;

	public void setAuthorDAO(AuthorDAO authorDAO) {
		this.authorDAO = authorDAO;
	}

	@Override
	public Author addAuthor(Author author) {
		return authorDAO.createAuthor(author);
	}

	@Override
	public Integer deleteAuthor(Integer AuthorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author updateAuthor(Integer AuthorId, Integer author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author getauthorById(Integer authorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Author> fetchAuthorList() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
