package net.onyxfox.html5creator.files;

import net.onyxfox.html5creator.helper.cli.UserInputHelper;

import java.io.File;
import java.io.IOException;

public class WebFile implements IWebFile
{
	public File file;
	public String pageTitle;

	public WebFile ( String filename )
	{
		this.file = new File( filename );
	}

	public void create ()
	{
		try
		{
			this.file.createNewFile();
			this.setPageTitle( UserInputHelper.promptBasic( "Page Title" ) );
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
	}

	public void setPageTitle ( String title )
	{
		this.pageTitle = title;
	}

	@Override
	public void writeOut ()
	{

	}
}
