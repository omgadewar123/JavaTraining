package com.yash.training.ArrayProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayCurdOperation {
	
	static Scanner scan = new Scanner(System.in);
    static ArrayList<String> emplist;



   public static void main(final String[] args) {



       showMainMenu();
        scan.close();
    }



   public static void showMainMenu() {
        System.out.println("--- MAIN MENU ---");
        System.out.println("1. Create emp");
        System.out.println("2. Update emp");
        System.out.println("3. Delete emp");
        System.out.println("4. Exit");



       System.out.print("Enter your Choice : ");



       int option = scan.nextInt();



       switch (option) {
        case 1:
            createEmployee();
            break;
        case 2:
            updatEmployee();
            break;
        case 3:
            deleteEmployee();
            break;
        case 4:
            System.exit(0);
            break;
        default:
            System.out.println("Invalid option!");
            showMainMenu();
        }



   }
   public static void createEmployee() {
       Scanner myObj = new Scanner(System.in);



      System.out.print("Enter emp Name: ");
       String newemp = myObj.nextLine();



      String newempArray[] = newemp.split(" ");
       emplist = new ArrayList<>();



      // use for READ
       for (int i = 0; i < newempArray.length; i++) {
           emplist.add(newempArray[i]);
       }
       System.out.println("Employee in list are " + emplist);
       showMainMenu();
   }



  public static void updatEmployee() {



      System.out.println("Enter the name of the emp to be updated");
       String name = scan.next();
       System.out.println("Enter the updated name");
       String newName = scan.next();
       for (int i = 0; i < emplist.size(); i++) {
           if (emplist.get(i).equals(name)) {
               emplist.set(i, newName);
               break;
           }
       }
       System.out.println("empl in list after updating the empname  " + emplist);
       showMainMenu();
   }



  public static void deleteEmployee() {
       System.out.println("Enter the name of the emp to be deleted");
       String name = scan.next();
       for (int i = 0; i < emplist.size(); i++) {
           if (emplist.get(i).equals(name)) {
               emplist.remove(i);
               break;
           }
       }
       System.out.println("empl in list after deleting the specific emp " + emplist);
       showMainMenu();
   }
}


