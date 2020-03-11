package ss;

import java.util.Scanner;

public class StringPalindromeScanner 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		StringBuffer br = new StringBuffer(name);
	
		
		if(name.equals(br.reverse().toString()))
		{
		System.out.println("Palindome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		// TODO Auto-generated method stub
	}
}

	
