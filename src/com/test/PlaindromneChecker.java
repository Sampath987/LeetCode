package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PlaindromneChecker {

	public static void main(String[] args)
	{
		String s = "^v^v^v^v^v>>>>>>";
		List<Node> nodes = new ArrayList<Node>();
		
	//	System.out.println(nodes.get(0) + " " + nodes.get(0).getDown());
		
		char[] charArray = s.toCharArray();
		Node oldNode= new Node();
		nodes.add(new Node(0,0));
		
		System.out.println("printing before After forLoop" + nodes.get(0));
		
		for(int i=0; i<=charArray.length-1;i++) 
		{
			System.out.println("printing before After forLoop");

	// 		^>v<  ^=1, >=1, V=-1, 
			switch (s.charAt(i)) 
			{
			case '^':
				System.out.println("printing from ^^^");
				Node newNodeUp = new Node(oldNode.upAndDown+1, oldNode.rightAdLeft);
				System.out.println("printing new Node " + newNodeUp);

				nodes.add(newNodeUp);
				oldNode = newNodeUp;
				break;
			case 'v':
				System.out.println("printing from vvv");
				Node newNodeDown = new Node(oldNode.upAndDown-1, oldNode.rightAdLeft);
				System.out.println("printing new Node " + newNodeDown);

				nodes.add(newNodeDown);
				oldNode = newNodeDown;
				break;
			case '>':
				System.out.println("printing from >>>");
				Node newNodeRight = new Node(oldNode.upAndDown, oldNode.rightAdLeft+1);
				System.out.println("printing new Node " + newNodeRight);

				nodes.add(newNodeRight);
				oldNode = newNodeRight;
				break;
			case '<':
				System.out.println("printing from <<<");
				Node newNodeLeft = new Node(oldNode.upAndDown, oldNode.rightAdLeft-1);
				System.out.println("printing new Node " + newNodeLeft);

				nodes.add(newNodeLeft);
				oldNode = newNodeLeft;
				break;				//public Node(int up, int down, int right, int left) {

			}
							
		}
		
		nodes.remove(0);
		Map<Node, Integer> map = new HashMap();
		System.out.println("printing before Stream on hashMap");

		nodes.stream().forEach(i -> 
		{
			System.out.println("printing");
			if(map.get(i)!=null)
			{
				System.out.println("printing from IF");
				map.put(i, map.get(i)+1);
			}
			else
			{
				System.out.println("printing from ELSE");
				map.put(i,1);
				
			}
		});
		
		map.entrySet().stream().forEach(i -> System.out.println("the value of "+ i.toString() + " is ::" + 
		i.getValue() ));
	}
}


/*A Walmart truck driver is delivering freight to an infinite number of stores. 
 * The driver begins by delivering freight to the store at the starting location, and then an operator at 
 * the Home Office calls via radio and tells the driver where to move next. 
 * Moves are always exactly one store to the north (^), south (v), east (>), or west (<). 
 * After each move, the driver delivers freight to the store at the destination.
 *

Unfortunately, the operator back at the Home Office is a little confused, and so the directions are a little off, 
and the truck driver ends up visiting some stores more than once. For example:



> delivers freight to 2 stores: one at the starting location and one to the east. 

^>v< delivers freight to 4 stores in a square, including twice to the store at his starting/ending location. 

^v^v^v^v^v delivers a bunch of freight to some very unlucky associates at only 2 stores. 

Write a method that returns the number of stores visited by the truck driver, 
given routing instructions expressed as a single input string consisting of only 'v','<', '^' and '>' characters.*/


/*
class Node
{
	 int upAndDown;
	 int rightAdLeft;
	 
	 public Node()
	 {
		 
	 }

	public Node(int upAndDown, int rightAdLeft) {
		super();
		this.upAndDown = upAndDown;
		this.rightAdLeft = rightAdLeft;
	}

	@Override
	public String toString() {
		return "Node [upAndDown=" + upAndDown + ", rightAdLeft=" + rightAdLeft + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(rightAdLeft, upAndDown);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		return rightAdLeft == other.rightAdLeft && upAndDown == other.upAndDown;
	}
	
	
*/
	

	
}

