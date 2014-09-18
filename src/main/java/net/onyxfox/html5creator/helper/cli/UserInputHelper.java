package net.onyxfox.html5creator.helper.cli;

import java.util.Scanner;

public class UserInputHelper
{
	public static String basicPrompt(String text)
	{
		Scanner s = new Scanner(System.in);
		CLIHelper.print(text, false);
		return s.next();
	}
	
	public static String multipleChoicePrompt(String text, String... choices)
	{
		CLIHelper.print(text);
		for (int x = 0; x < choices.length; x++)
		{
			CLIHelper.print(String.format("%d) %s", x+1, choices[x]));
		}
		int choice = Integer.parseInt(basicPrompt("Choice #: "));
		return choices[choice - 1];
	}
}
