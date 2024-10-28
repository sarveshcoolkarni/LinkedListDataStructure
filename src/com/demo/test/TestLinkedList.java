package com.demo.test;
import java.util.*;
public class TestLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		int choice=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your choice: ");
			System.out.println("1. Add elements at start. \n2. Add elements at end. \n3. Search any value in linkedlist");
			System.out.println("4. Delete by value \n5. delete by position \n6. Display all list \n7. Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1-> {
				System.out.println("Enter element: ");
				int value = sc.nextInt();
				sll.addByValue(value);
			}
			case 2-> {
				System.out.println("Enter elements you want to add: and \nAdd position where you want to add");
				int value = sc.nextInt();
				System.out.println("Enter position");
				int pos = sc.nextInt();
				sll.addByPosition(value, pos);
				
			}
			case 3-> {
				System.out.println("Enter value you want to search: ");
				int value = sc.nextInt();
				int search = sll.searchByValue(value);
				System.out.println(search);
			}
			case 4-> {
				System.out.println("enter which value you want to deleted");
				int val = sc.nextInt();
				sll.deleteByValue(val);
			}
			case 5-> {
				System.out.println("enter position which you want to delete");
				int pos = sc.nextInt();
				sll.deleteByPosition(pos);
			}
			case 6-> {
				sll.displayData();
			}
			case 7-> {
				System.out.println("Thank you...");
			}
			default -> {
				System.out.println("Wrong choice...");
			}
			}
		}while(choice!=7);

	}

}
