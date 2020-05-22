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
	
	
	private final static int MIN_BISCOTTI = 1;
	private final static int MAX_BISCOTTI = 8;

	private final static int MIN_CAREZZE = 1;
	private final static int MAX_CAREZZE = 10;
	
	
	private static TamaZoo Zoo = new TamaZoo();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.out.println(MESS_BENVENUTO +"\n\n");	
	
	int numeroTamagotchi = InputDati.leggiInteroPositivo(INSERT_TAMAGOTCHI);
	
	for(int i = 1 ; i <= numeroTamagotchi; i++) {
		
		Tamagotchi nuovoTama = creaTamagotchi();
		
		Zoo.inserisci(nuovoTama);
	
	}
		
	MyMenu principale = new MyMenu(MAIN_QUESTION, MAIN_MENU_ITEMS);

	boolean fine = false;

	do {
		int voceSelezionata = principale.scegli();

		switch (voceSelezionata) {
		case 1:
			int numBiscotti = NumeriCasuali.estraiIntero(MIN_BISCOTTI, MAX_BISCOTTI);
			System.out.printf(MSG_BISCOTTI, numBiscotti);
			Zoo.daiBiscotti(numBiscotti);
			break;
		case 2:
			int numCarezze = NumeriCasuali.estraiIntero(MIN_CAREZZE, MAX_CAREZZE);
			System.out.printf(MSG_CAREZZE, numCarezze);
			Zoo.daiCarezze(numCarezze);
			break;
		case 0:
			fine = true;
			System.out.println(MSG_SALUTI);
			break;
		default:
			System.out.println(MSG_NO_OP);
			break;
		}// switch

		if (!mioZoo.ciSonoVivi()) {
			fine = true;
			System.out.println(MSG_ESTINTI);
		}

	} while (!fine);
	
	}

	private static Tamagotchi creaTamagotchi() {
		
		String nome = InputDati.leggiStringaNonVuota(INSER_NOME_TAMA);
		int specie = NumeriCasuali.estraiIntero(1, NUMERO_SPECIE);
		
		Tamagotchi nuovoTama = null;
		
		int affetto, sazieta;

		switch (specie) {
		case TAMA_BASE:
			affetto = NumeriCasuali.estraiIntero(0, Tamagotchi.MAX_SODDISFAZIONE);
			sazieta = NumeriCasuali.estraiIntero(0, Tamagotchi.MAX_SAZIETA);
			nuovoTama = new Tamagotchi(nome, affetto, sazieta);
			break;
		case TAMA_TRISTE:
			sazieta = NumeriCasuali.estraiIntero(0, Tamagotchi.MAX_SAZIETA);
			nuovoTama = new TamaTriste(nome, sazieta);
			break;
		case TAMA_GORDO:
			sazieta = NumeriCasuali.estraiIntero(0, Tamagotchi.MAX_SAZIETA);
			nuovoTama = new TamaGordo(nome, sazieta);
			break;
		}
		return nuovoTama;
		
	}

}
