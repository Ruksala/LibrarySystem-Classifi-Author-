package com.librarySys.dao;

import java.util.List;

import com.sgic.model.Author;

public interface AuthorDAO {
	public abstract Author createAuthor(Author author);
	 public abstract Integer deleteAuthor(Integer AuthorId);
	 public  abstract Author updateAuthor(Integer AuthorId,Integer author);
	// public abstract Integer deleteAuthor(Integer AuthorId);
	 public abstract Author getauthorById(Integer authorId);
	 public abstract List<Author>getAuthorList();
	 
}
