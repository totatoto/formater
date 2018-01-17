# formater
## l'objectif du projet
l'objectif de ce projet est de faire un programme qui formate nos sources java
par exemple cette classe :
```
import javax.swing.*;

public class Demo extends JFrame{
	public void main				(	String[] a)
	{
		if(1==1)
				if(2   >1)
		System.out.println("texte d'example")	;}}
```
deviendrais :
```
import javax.swing.JFrame;

public class Demo extends JFrame
{
	/**
	 * //TODO #javadoc
	 *
	 * @param a //TODO #javadoc
	 */
	public void main(String[] a)
	{
		if(1 == 1)
			if(2 > 1)
				System.out.println("texte d'example");
	}
}
```
Par la suite, ce serais appréciable de pouvoir mettre des options pour ce formatage afin que chacun puisse l'adapter à son style.
