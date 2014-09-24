package net.onyxfox.html5creator.helper.cli;

import net.onyxfox.html5creator.helper.ArrayHelper;

import java.util.Scanner;

public class UserInputHelper
{
	public static String promptBasic ( String text )
	{
		Scanner s = new Scanner( System.in );
		CLIHelper.print( text + ": ", false );
		return s.next();
	}

	public static String promptMultipleChoice ( String text, String... choices )
	{
		CLIHelper.print( text + ": " );
		for ( int x = 0; x < choices.length; x++ )
		{
			CLIHelper.print( String.format( "%d) %s", x + 1, choices[ x ] ) );
		}
		int choice = Integer.parseInt( promptBasic( "Choice #" ) );
		return choices[ choice - 1 ];
	}

	public static boolean promptYesNo ( String text, boolean defaultYes )
	{
		ArrayHelper yesPos = new ArrayHelper( "yes", "y" );
		ArrayHelper noPos = new ArrayHelper( "no", "n" );

		if ( defaultYes )
		{
			String uInput = promptBasic( text + "[Y/n]" ).trim().toLowerCase();
			return yesPos.contains( uInput ) || uInput.isEmpty() || ! noPos.contains( uInput ) && promptYesNo( text, true );
		}
		else
		{
			String uInput = promptBasic( text + "[y/N]" ).trim().toLowerCase();
			return yesPos.contains( uInput ) || ! ( noPos.contains( uInput ) || uInput.isEmpty() ) && promptYesNo( text, false );
		}
	}
}
