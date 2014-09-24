package net.onyxfox.html5creator;

import net.onyxfox.html5creator.files.HTMLFile;
import net.onyxfox.html5creator.files.IWebFile;
import net.onyxfox.html5creator.files.PHPFile;
import net.onyxfox.html5creator.helper.cli.UserInputHelper;

public class HTML5Creator
{
	public static void main ( String[] args )
	{
		//CLIHelper.print("Current directory: " + System.getProperty("user.dir"));
		String fileBaseName = UserInputHelper.promptBasic( "Filename" );
		//CLIHelper.print(String.format("You set %s as the filename", filename));

		String fileType = UserInputHelper.promptMultipleChoice( "Filetype", "html", "php" );
		//CLIHelper.print(String.format("Filetype: %s", filetype));

		String filename = String.format( "%s.%s", fileBaseName, fileType );

		if ( fileType.equals( "html" ) )
		{
			IWebFile file = new HTMLFile( filename );
			file.create();
		}
		else if ( fileType.equals( "php" ) )
		{
			IWebFile file = new PHPFile( filename );
			file.create();
		}
	}
}
