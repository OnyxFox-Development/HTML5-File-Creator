package net.onyxfox.html5creator;

import java.util.Scanner;
import net.onyxfox.html5creator.helper.cli.*;

public class HTML5Creator
{
	public static void main(String[] args)
	{
		CLIHelper.print("Current directory: " + System.getProperty("user.dir"));
		String fileBaseName = UserInputHelper.basicPrompt("Filename: ");
		//CLIHelper.print(String.format("You set %s as the filename", filename));
		
		String fileType = UserInputHelper.multipleChoicePrompt("Filetype:", "html", "php");
		//CLIHelper.print(String.format("Filetype: %s", filetype));
		
		String filename = String.format("%s.%s", fileBaseName, fileType);
	}
}
