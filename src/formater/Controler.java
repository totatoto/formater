package formater;

import formater.ihm.IHM;

import java.io.File;

import java.util.List;
import java.util.ArrayList;

public class Controler
{
	public static String PARAM_RECURSIVE = "r";
	public static String PARAM_JAVADOC = "j";
	public static String PARAM_PATTERN = "p";
	
	
	public static String DEFAULT_PATTERN = ""; //TODO
	
	private static List<File> listFile(File file, boolean isRecursive)
	{
		if ( !file.exists() )
			return new ArrayList<File>();
		
		List<File> fileList = new ArrayList<File>();
		if (file.isDirectory())
		{
			for ( File fTemp : file.listFiles( new FileFilterJava() ) )
				if ( isRecursive || !fTemp.isDirectory() )
					fileList.addAll( listFile(fTemp, isRecursive) );
				
		}
		else
			fileList.add(file);
		
		return fileList;
	}
	
	public static void main(String[] args)
	{
		IHM ihm = IHM.getInstance();
		
		if (args.lenght == 0)
		{
			ihm.showError(IHM.ERR_ARG_MAIN);
			return;
		}
		
		int nbParamMin = 1; // rajouter 1 si il y a au moins 1 param
		
		boolean recursive = false;
		boolean javadoc = false;
		boolean pattern = false;
		String param = args[0];
		if ( param.contains(PARAM_RECURSIVE) )
			recursive = true;
		if ( param.contains(PARAM_JAVADOC) )
		{
			javadoc = true;
			nbParamMin++;
		}
		if ( param.contains(PARAM_PATTERN) )
		{
			pattern = true;
			nbParamMin++;
		}
		
	}
}