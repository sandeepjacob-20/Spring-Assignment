package com.nissan.model;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.nissan.interfaces.books;

@Component("library")
public class Library implements books {
	//@Autowired
	//@Qualifier("bookdata")
	//public bookData bookdata = new bookData();
	//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext2.xml");
	//bookData bookdata = context.getBean("library",bookData.class);
	 //@Autowired
	 //private bookData bookdata;
	
	/*public bookData bookdata;
	@Autowired
	public Library(bookData bookdata) {
		super();
		this.bookdata = bookdata;
	}*/

	Scanner scan = new Scanner(System.in);
	
	
	@Override
	public boolean add(ArrayList<bookData> lib,bookData bookdata ) {
	
		//bookData bookdata = new bookData();
		// TODO Auto-generated method stub
		System.out.println("Enter the title of the book : ");
		bookdata.setTitle(scan.nextLine());
		System.out.println("Enter the author of the book : ");
		bookdata.setAuthor(scan.nextLine());
		System.out.println("Enter the ISBN : ");
		bookdata.setIsbn(scan.nextLine());
		lib.add(bookdata);
		return true;
	}

	@Override
	public boolean getDetails(ArrayList<bookData> lib) {
		// TODO Auto-generated method stub
		System.out.println("Enter the ISBN number for the book : ");
		String isbn = scan.next();
		for(bookData l :lib) {
			if(l.getIsbn().equals(isbn)) {
				System.out.println("Book Title : "+l.getTitle());
				System.out.println("Book Author : "+l.getAuthor());
				System.out.println("Book ISBN : "+l.getIsbn());
				return true;
			}
		}
		return false;
	}

	@Override
	public void listBooks(ArrayList<bookData> lib) {
		// TODO Auto-generated method stub
		for(bookData l :lib) {
			System.out.println("Book Title : "+l.getTitle());
			System.out.println("Book Author : "+l.getAuthor());
			System.out.println("Book ISBN : "+l.getIsbn());
		}
	}

}
