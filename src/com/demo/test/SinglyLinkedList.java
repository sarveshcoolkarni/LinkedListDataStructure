package com.demo.test;

public class SinglyLinkedList {
	class Node {
		Node next;
		int data;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	Node head;
	public SinglyLinkedList() {
		head = null;
	}
	public void addByValue(int val) {
		Node nnode = new Node(val);
		if(head==null) {
			head = nnode;
		}
		else {
			Node temp = head;
			while(temp!=null) {
				temp = temp.next;
			}
			temp.next = nnode;
		}
	}
	public int searchByValue(int val) {
		Node temp = head;
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			int pos = 0;
			while(temp!=null && temp.data!=val) {
				temp = temp.next;
				pos++;
			}
			if(temp!=null) {
				return pos;
			}
		}
		return -1;
	}
	
	public void addByPosition(int val, int pos) {
		Node temp = head, prev=null;
		if(head==null && pos>1) {
			System.out.println("List is empty");
		}
		else {
			Node newnode = new Node(val);
			if(pos==1) {
				newnode.next = head;
				head = newnode;
			}else {
				for(int i=1; temp!=null && i<=pos-2; i++) {
					temp = temp.next;
				}
				if(temp!=null) {
					newnode.next = temp.next;
					temp.next = newnode;
				}
				else {
					System.out.println("position not found...");
				}
			}
		}
		
	}
	
	
	public void deleteByValue(int val) {
		Node temp = head, prev=null;
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			if(head.data==val) {
				head = temp.next;
				temp.next = null;
				temp = null;
			}
			while(temp!=null && temp.data!=val) {
				temp = temp.next;
				prev = temp;
			}
			if(temp!=null) {
				prev.next=temp.next;
				temp.next = null;
				temp = null;
			}else {
				System.out.println("Value not found");
			}
		}
	}
	
	public void deleteByPosition(int pos) {
		if(head==null) {
			System.out.println("List is empty");
		}
		Node temp = head, prev = null;
		if(pos==1) {
			head.next = temp.next;
			temp.next = null;
			temp = null;
		}
		else {
			for(int i=0; temp!=null && i<pos-1; i++) {
				prev = temp;
				temp = temp.next;
			}
			if(temp!=null) {
				prev.next = temp.next;
				temp.next = null;
				temp = null;
			}else {
				System.out.println("List is beyond limit");
			}
		}
		
	}
	public void displayData() {
		if(head==null) {
			System.out.println("List is empty...");
		}
		else {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
		System.out.println("------------------");
	}
	

}
