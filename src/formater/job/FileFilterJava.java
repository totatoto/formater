package formater.job;

import java.io.FileFilter;
import java.io.File;

public class FileFilterJava implements FileFilter
{
	public boolean accept(File pathname)
	{
		String name = pathname.getName();
		
		return name.endsWith(".java");
	}
}