package com.test;

public class TestingClassforInterview {
	
	Node headNode;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestingClassforInterview testingClassforInterview = new TestingClassforInterview();
		testingClassforInterview.insertingInOneDirection(10);
		testingClassforInterview.insertingInOneDirection(300);
		testingClassforInterview.insertingInOneDirection(650);
		testingClassforInterview.insertingInOneDirection(10);
		testingClassforInterview.insertingInOneDirection(30);
		
		System.out.println("before");

		testingClassforInterview.retrievingInOneDirection();



	}
	
	public void insertingInOneDirection(int headData)
	{
		if(headNode==null)
		{
			headNode = new Node(headData);
		}
		else
		{
			Node temp =headNode;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new Node(headData);
		}
	}
	
	public void retrievingInOneDirection()
	{
		Node temp =headNode;
		while(temp!=null)
		{
			System.out.println(temp);
			temp=temp.next;
		}
	}

	

}

class Node{
	int data ;
	Node next;
	
	public Node()
	{
		
	}
	
	public Node(int data){
		this.data=data;
		this.next=null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
}
