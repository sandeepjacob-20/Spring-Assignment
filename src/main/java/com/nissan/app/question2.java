package com.nissan.app;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nissan.interfaces.books;
import com.nissan.model.bookData;


public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int opt;
		
		ArrayList<bookData> lib = new ArrayList<bookData>();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext2.xml");
		books book = context.getBean("library",books.class);
		do {
			System.out.println("Choose an Option : ");
			System.out.println("1-Add");
			System.out.println("2-Search");
			System.out.println("3-List");
			System.out.println("4-Exit");
			System.out.print("option : ");
			opt = scan.nextInt();
			if(opt==1) {
				bookData bookdata = context.getBean("bookdata",bookData.class);
				book.add(lib,bookdata);
			}
			else if(opt==2) {
				book.getDetails(lib);
			}
			else if(opt==3) {
				book.listBooks(lib);
			}
		}while(opt!=4);
		
	}

}
