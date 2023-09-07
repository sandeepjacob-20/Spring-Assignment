package com.nissan.app;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nissan.interfaces.Vehicle;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ClassPathXmlApplicationContext contextPath = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Vehicle vehicle1 = contextPath.getBean("honda",Vehicle.class);
		Vehicle vehicle2 = contextPath.getBean("tata",Vehicle.class);
		int opt;
		do {
			System.out.println("Choose an option : ");
			System.out.println("1-Honda");
			System.out.println("2-Tata");
			System.out.println("3-Exit");
			System.out.print("option : ");
			opt = scan.nextInt();
			if(opt==1) {
				System.out.println(vehicle1.getBrandName());
				System.out.println(vehicle1.getVehicleName());
			}
			else if(opt==2) {
				System.out.println(vehicle2.getBrandName());
				System.out.println(vehicle2.getVehicleName());
			}
		}while(opt!=3);
				
	}

}
