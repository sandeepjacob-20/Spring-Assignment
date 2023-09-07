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
		do {
			System.out.println("Choose an Option : ");
			System.out.println("1-Add");
			System.out.println("2-Search");
			System.out.println("3-List");
			System.out.println("4-Exit");
			System.out.print("option : ");
			opt = scan.nextInt();
			if(opt==1) {
				books book = context.getBean("library",books.class);
				bookData bookdata = context.getBean("bookdata",bookData.class);
				book.add(lib,bookdata);
			}
			else if(opt==2) {
				books book2 = context.getBean("library",books.class);
				book2.getDetails(lib);
			}
			else if(opt==3) {
				books book3 = context.getBean("library",books.class);
				book3.listBooks(lib);
			}
		}while(opt!=4);
		
	}

}
