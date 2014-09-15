package net.onyxfox.html5creator;

import java.util.Scanner;

public class HTML5Creator
{
	public static void main(String[] args)
	{
		Scanner uInput = new Scanner(System.in);
		
		System.out.print("Filename: ");
		String filename = uInput.next();
		System.out.println(String.format("You set %s as the filename", filename));
	}
}
