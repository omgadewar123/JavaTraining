package com.yash.main;

import java.util.Scanner;

import com.yash.entity.Student;
import com.yash.impl.StudentDao;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("Welcome student management app");
		System.out.println();
		
		Scanner sc = new Scanner (System.in);
		while(true) {
			System.out.println("Enter 1 : Add the student");
			System.out.println("Enter 2 : Delete the student");
			System.out.println("Enter 3 : Display the student ");
			System.out.println("Enter 4 : Update the student");
			System.out.println("Enter 5 : Exit the app");
			
			int i = sc.nextInt();
			
			if(i==1) {
				//add method
				System.out.println("Enter user name :");
				
				String name =sc.next();
				
				System.out.println("Enter user phone :");
				String phone =sc.next();
				
				System.out.println("Enter user city :");
				String city =sc.next();
				
				Student st = new Student(name,phone,city);
				boolean ans = StudentDao.indsertStudentToDB(st);
				if(ans) {
					System.out.println("Student data added successfully...");
				}else {
					System.out.println("something went wrong please try again..");
				}
				System.out.println(st);
				
				
			}else if (i==2) {
				
				// Delete method
				System.out.println("Enter student id ");
				int d = sc.nextInt();
				boolean b =StudentDao.deleteStudent(d);
				if(b) {
					System.out.println("Deleted record successfully...");
				}else {
					System.out.println("something went wrong please try again....");
				}
				
			}else if(i==3) {
				//Display
				StudentDao.showAllStudent();
				
			}else if(i==4) {
				// update 
				StudentDao.updateRecord();
			
			}else if (i==5){
				
				break;
			}else {
				System.out.println("Something went wrong please try again..");
		
		}	
		}
		System.out.println("Thank you for using my app");
		System.out.println("byee byee........");
	}
		
	}


