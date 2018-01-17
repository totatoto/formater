# formater
## l'objectif du projet
l'objectif de ce projet est de faire un programme qui formate nos sources java
par exemple cette classe :
```
package tri;
import javax.swing.*;
public class Trieur extends JFrame{
	Integer[] tabInt; int min;
	
	public Trieur(Integer[] tabInt,int min ){
		this.tabInt=tabInt;
		this.min = min; }
	
	public boolean 			trier ()
{
	for (int i=0;i < this.tabInt.length;i++)
			if (this.tabInt[i] < this.min)
		this.tabInt[i] =null;
}
}
```
deviendrais :
```
package tri;

import javax.swing.JFrame;

/**
 * //TODO
 * @version //TODO
 * @author //TODO
 */
public class Trieur extends JFrame
{
	/**
	 * //TODO
	 */
	Integer[] tabInt;
	
	/**
	 * //TODO
	 */
	int min;
	
	/**
	 * //TODO
	 * 
	 * @param tabInt //TODO
	 * @param min //TODO
	 */
	public Trieur (Integer[] tabInt, int min)
	{
		this.tabInt = tabInt;
		this.min = min;
	}
	
	/**
	 * //TODO
	 * 
	 * @return //TODO
	 */
	public boolean trier ()
	{
		for (int i = 0; i < this.tabInt.length; i++)
			if (this.tabInt[i] < this.min)
				this.tabInt[i] = null;
	}
}
```
Par la suite, ce serais appréciable de pouvoir mettre des options pour ce formatage afin que chacun puisse l'adapter à son style.
