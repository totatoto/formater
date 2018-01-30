package formater.job;

import java.io.File;
import java.util.Scanner;

public class Formater
{
	
	public static String onOneLine(File f)
	{
		String sRet = "";
		
		try
		{
			Scanner sc = new Scanner(f,"UTF-8");
			while (sc.hasNextLine())
			{
				String line = sc.nextLine();
				
				if ( line.matches("[\t ]*") )
					continue;
				
				if (line.matches("^[\t ]*[/][/].*$"))
					line = "/*" + line.replaceFirst("[/][/][ ]*"," ") + " */" ;
				else
					if (line.matches("((\"[^\"]*\")|([^\"]))*[/][/].*$"))
					{
						String sTemp = line;
						int ind = 0;
						while (sTemp.matches("((\"[^\"]*\")|([^\"]))*[/][/].*$"))
						{
							ind = sTemp.lastIndexOf("//");
							sTemp = sTemp.substring(0,ind);
						}
						
						line = sTemp.replaceAll("\\t"," ").replaceAll("[ ]+"," ") + " /* " + line.substring(ind + 2) + " */";
					}
					else
						line = line.replaceAll("\\t"," ").replaceAll("[ ]+"," ");
				
				sRet += line + "\n";
			}
			
			sc.close();
		}
		catch(Exception e) {}
		
		return sRet;
	}
}