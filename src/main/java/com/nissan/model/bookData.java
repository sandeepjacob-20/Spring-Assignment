package com.nissan.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("bookdata")
@Scope("prototype")
@Component("bookdata")
public class bookData {
	private String title, author, isbn;
	
	

	public bookData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public bookData(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}
