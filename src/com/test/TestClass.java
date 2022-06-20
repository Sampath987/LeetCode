package com.test;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Stream of characters from java
		
		
		String string = "Stream of characters from java";
		
		System.out.println("Print the minimum value " + '\u0000' +"printing again");

		char[] charArray = string.toCharArray();
		int length =charArray.length-1;
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=charArray.length-1;i>=0;i--)
		{
			
		if(charArray[i]==' ' || i==0)
		{
			if(i==0)
			{
				stringBuilder.append(charArray[i]);
				System.out.print( stringBuilder.reverse());

			}
			else
			{
			System.out.print( stringBuilder.reverse().append(charArray[i]));
			}
			stringBuilder.delete(0, stringBuilder.length());
	//		stringBuilder.append();
			
//			System.out.println("Printing something after " + stringBuilder.reverse());

		}
		else
			if(i!=0)
			{
				stringBuilder.append(charArray[i]);

			}
		}
	}

}
