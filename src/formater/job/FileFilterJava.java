package formater.job;

import java.io.FileFilter;

public class FileFilterJava implements FileFilter
{
	public boolean accept(File pathname)
	{
		String name = pathname.getName();
		
		return name.endsWith(".java");
	}
}