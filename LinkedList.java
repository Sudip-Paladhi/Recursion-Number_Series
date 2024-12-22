package com.Recursion;

public class LinkedList {
	 Node first=null;
	 int count=0;
	 
	 
	 public void add(Object ele){
		 if(first == null) {
			 first= new Node(ele);
			 count++;
			 return;
		 }
		 
		 Node curr= first;
		 while(curr.next!=null) {
			 curr= curr.next;
		 }
		 curr.next= new Node(ele);
		 count++;
	 }
	 
	 public void add(int index, Object e) {
		if(index<0 || index>=size()) throw new IndexOutOfBoundsException();
		
		if(index==0) {
			first= new Node(e, first);
			count++;
			return;
		}
		
		Node curr= first;
		for (int i = 1; i <index; i++) {
			curr= curr.next;
		}
		curr.next=new Node(e, curr.next);
		count++;
	}
	 
	 public void remove(int index) {
		 if(index==0) {
			 first = first.next;
			 count--;
			 return;
		 }
		Node curr= first;
		for(int i=1; i<index; i++) {
			curr=curr.next;
		}
		curr.next= curr.next.next;
		count--;
	}
	 
	 public void reverse() {
		Node curr=first, prev=null, next=null;
		while(curr!=null) {
			next= curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		first=prev;
	}
	 
	 public int size() {
		return count;
	}
	 
	 public Object  get(int index) {
		if(index <0 || index>= size()) throw new IndexOutOfBoundsException();
		Node curr= first;
		for (int i = 1; i <= index; i++) {
			curr= curr.next;
		}
		return curr.ele;
	}
  }
