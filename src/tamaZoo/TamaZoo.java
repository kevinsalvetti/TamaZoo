package tamaZoo;

import java.util.*;



public class TamaZoo {

	private ArrayList <Tamagotchi> specie;
	
	
	public TamaZoo() {
		
		specie = new ArrayList <Tamagotchi> ();
	}
	
	/**
	 * meotodo per inserire i tamagotchies
	 * @param Inserire
	 */
	public void inserisci (Tamagotchi Inserire)
	{
		specie.add(Inserire);
	}
	
	/**
	 * metodo per controllare se il tamagotchi è vivo
	 * @return
	 */
	public boolean controlloVivi() {
		
		for(Tamagotchi elemento : specie)
		{
			if (! elemento.isDie())
				return true;
		}
		return false;
	}
	
	/**
	 * metodo per dare la stessa quantità di biscotti a tutti i tamgotchies
	 * @param quantiBiscotti
	 */
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
	  
	/**
	 * metodo per dare la stessa quantità di carezze a tutti i tamagotchies
	 * @param quanteCarezze
	 */
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
