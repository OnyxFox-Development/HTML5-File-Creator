package net.onyxfox.html5creator.files;

public class WebFile implements IWebFile
{
    public File file;
    public WebFile(String filename)
    {
	this.file = new File(filename);
    }
    
    public void create()
    {
	this.file.createNewFile();
	

    }
}
