package net.onyxfox.html5creator.helper.cli;

import java.util.Scanner;

public class CLIHelper
{
	public static void print(String text, boolean newline)
	{
		if (newline)
		{
			System.out.println(text);
		}
		else
		{
			System.out.print(text);
		}
	}
	
	public static void print(String text)
	{
		print(text, true);
	}
}
