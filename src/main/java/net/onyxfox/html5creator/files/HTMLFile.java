package net.onyxfox.html5creator.files;

import java.io.File;

public class HTMLFile extends WebFile
{
	public static File file;
	
	public HTMLFile(String filename)
	{
		file = new File(String.format("%s%s%s", System.getProperty("user.dir"), File.separator, filename));
	}
	
	public void create()
	{
		
	}
}
