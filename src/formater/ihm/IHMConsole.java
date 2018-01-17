package formater.ihm;

import formater.ihm.IHM;

class IHMConsole extends IHM
{

	public void showError(int numErr)
	{
		switch (numErr)
		{
			case IHM.ERR_ARG_MAIN:
				System.out.println("\u001B[31m" + "No param found. Usage : java formater.Controler [] <fileOrFolderToFormat>");
			break;
		}
	}
}
