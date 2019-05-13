package com.librarySys.Service;

import java.util.List;

import com.sgic.model.Author;

public interface AuthorService {

	 public abstract Author addAuthor(Author author);
	 public abstract Integer deleteAuthor(Integer AuthorId);
	 public  abstract Author updateAuthor(Integer AuthorId,Integer author);
	// public abstract Integer deleteAuthor(Integer AuthorId);
	 public abstract Author getauthorById(Integer authorId);
	 public abstract List<Author>fetchAuthorList();
	 
}
