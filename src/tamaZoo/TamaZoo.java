package tamaZoo;

import java.util.*;



public class TamaZoo {

	private ArrayList <Tamagotchi> specie;
	
	
	public TamaZoo() {
		
		specie = new ArrayList <Tamagotchi> ();
	}
	
	public void inserisci (Tamagotchi Inserire)
	{
		specie.add(Inserire);
	}
	
	public boolean controlloVivi() {
		
		for(Tamagotchi elemento : specie)
		{
			if (! elemento.isDie())
				return true;
		}
		return false;
	}
	
	public void daiBiscotti (int quantiBiscotti)
	  {
		  for (Tamagotchi elemento : specie)
		  {
			  if (! elemento.isDie())
			  {
			   elemento.daiBiscotti(quantiBiscotti);
			   System.out.println(elemento.toString());
			   System.out.println();
			  }
			  
		  }
	  }
	  
	  public void daiCarezze (int quanteCarezze)
	  {
		  for (Tamagotchi elemento : specie)
		  {
			  if (! elemento.isDie())
		  	  {
			   elemento.aggiungiCarezze(quanteCarezze);
			   System.out.println(elemento.toString());
			   System.out.println();
		  	  }
			  
		  }
	  }
	
}
