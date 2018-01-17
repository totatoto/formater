package formater.ihm;

/**
 * classe mère de toute les IHM du programme
 * elle sert également de classe abstraite qui permet d'intéragir avec l'instance d'IHM
 * l'IHM sera un singleton
 * @author Totatoto and jonatjano
 */
public abstract class IHM
{
	/**
	 * constante utilisée par {@link #getInstance(String)} pour savoir que la nouvelle instance doit etre une instance d'{@link IHMConsole}
	 */
	public static final String CONSOLE = "CONSOLE";

	/**
	 * instance unique d'{@link IHM}
	 * son unicité est assurée par {@link #getInstance()}
	 */
	private static IHM instance = null;
	
	public static int ERR_ARG_MAIN = 0;
	
	
	
	
	/**
	 * méthode utilisée pour obtenir l'instance de l'{@link IHM}
	 * si l'instance est nulle une nouvelle est crée selon le type demandé
	 * @return {@link #instance} ou une nouvelle {@link IHMConsole} si {@link #instance} est nulle
	 */
	public static IHM getInstance()
	{
		return getInstance(CONSOLE);
	}

	/**
	 * [getInstance description]
	 * @param  String type          [description]
	 * @return        [description]
	 */
	public static IHM getInstance(String type)
	{
		if (instance == null)
		{
			switch (type)
			{
				case CONSOLE:
				default:
					instance = new IHMConsole();
			}
		}
		return instance;
	}
	
	public abstract void showError(int numErr);
}
