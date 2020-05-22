package tamaZoo;

import tamaZoo.TamaGordo;
import tamaZoo.TamaTriste;
import tamaZoo.Tamagotchi;
import tamaZoo.TamaZoo;
import mylib.*;


public class TamaMain {

	private final static String MESS_BENVENUTO = "BENVENUTO IN TAMAZOO";
	private final static String INSERT_TAMAGOTCHI = "Inserisci il numero dei Tamagotchi";
	private final static String INSER_NOME_TAMA = "Inserisci il nome del Tamagotchi";
	
	private final static int NUMERO_SPECIE = 3 ;
	private final static int TAMA_BASE = 1;
	private final static int TAMA_TRISTE = 2;
	private final static int TAMA_GORDO = 3;
	
	
	private static TamaZoo Zoo = new TamaZoo();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.out.println(MESS_BENVENUTO +"\n\n");	
	
	int numeroTamagotchi = InputDati.leggiInteroPositivo(INSERT_TAMAGOTCHI);
	
	for(int i = 1 ; i <= numeroTamagotchi; i++) {
		Tamagotchi nuovoTama = creaTamagotchi();
		Zoo.inserisci(nuovoTama);
	}
		
	
	
	public Tamagotchi creaTamagotchi() {
		
		String nome = InputDati.leggiStringaNonVuota(INSER_NOME_TAMA);
		int specie = NumeriCasuali.estraiIntero(1, NUMERO_SPECIE);
		
		Tamagotchi nuovo = null;
		
		int affetto, sazieta;

		switch (specie) {
		case TAMA_BASE:
			affetto = NumeriCasuali.estraiIntero(0, Tamagotchi.MAX_SODDISFAZIONE);
			sazieta = NumeriCasuali.estraiIntero(0, Tamagotchi.MAX_SAZIETA);
			nuovo = new Tamagotchi(nome, affetto, sazieta);
			break;
		case TAMA_TRISTE:
			sazieta = NumeriCasuali.estraiIntero(0, Tamagotchi.MAX_SAZIETA);
			nuovo = new TamaTriste(nome, sazieta);
			break;
		case TAMA_GORDO:
			sazieta = NumeriCasuali.estraiIntero(0, Tamagotchi.MAX_SAZIETA);
			nuovo = new TamaGordo(nome, sazieta);
			break;
		}
		return nuovoTama;
	}
	
	
	}

}
