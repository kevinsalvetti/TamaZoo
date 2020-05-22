package tamazoo;

import java.util.Scanner;

public class Tamagotchi {

	static final int MAX_SAZIETA = 100;
	static final int MAX_SODDISFAZIONE = 100;

	static final int SOGLIA_MIN_SAZIETA = 30;
	static final int SOGLIA_MAX_SAZIETA = 90;

	static final int SOGLIA_MIN_SODDISF = 30;
	static final int SOGLIA_MAX_SODDISF = 80;

	static final int MAX_BISCOTTI_PER_VOLTA = 20;
	static final int MAX_CAREZZE_PER_VOLTA = 20;

	static final double INCREMENTA_BISCOTTI = 1.1;
	
	static final double FATTORE_CAREZZE = 2; 
	static final double FATTORE_BISCOTTI = 4;
	
	
	private final static String DESCRIZIONE = "Sono %s e il mio tipo %s%nIl mio grado di sazietà  è: %1.2f%nIl mio grado di soddisfazione è: %1.2f";
	private final static String MESS_DEAD = "\nAttenzione sono morto :_ -(";
	private final static String MESS_SAD = "\nAttenzione sono infelice!";

	private String nome;
	private double soddisfazione;
	private double sazieta;
	protected String nomeTipo;
	
	Scanner sc = new Scanner(System.in);

	public Tamagotchi(String _nome, int _soddisfazione, int _sazieta) {

		this.nome = _nome;
		this.soddisfazione = _soddisfazione;
		this.sazieta = _sazieta;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSoddisfazione() {
		return soddisfazione;
	}

	public void setSoddisfazione(int soddisfazione) {
		this.soddisfazione = soddisfazione;
	}

	public double getSazieta() {
		return sazieta;
	}

	public void setSazieta(double d) {
		this.sazieta = d;
	}

	public boolean isInfelice() {
		
		return soddisfazione < SOGLIA_MIN_SODDISF || sazieta < SOGLIA_MIN_SAZIETA || sazieta > SOGLIA_MAX_SAZIETA;
		
	}

	public void aggiungiCarezze(int numCarezze) {
		soddisfazione = Math.min(soddisfazione + numCarezze, MAX_SODDISFAZIONE);
		sazieta = Math.max(0, sazieta - numCarezze / FATTORE_CAREZZE);
		
	}

	
	public void daiBiscotti(int numBiscotti) {
		
		for (int i = 1 ; i<= numBiscotti; i++) {
			sazieta = Math.min(sazieta * INCREMENTA_BISCOTTI , MAX_SODDISFAZIONE);
		}
		soddisfazione = Math.max(0, soddisfazione - numBiscotti / FATTORE_BISCOTTI); 
		
	}
	
	public boolean isDie() {
		return  soddisfazione == 0 || sazieta == 0 || sazieta == MAX_SAZIETA;
	}

	@Override
	public String toString() {
		
		StringBuffer result = new StringBuffer();
		result.append(String.format(DESCRIZIONE, nome, nomeTipo, sazieta, soddisfazione));
		if (isDie())
			result.append(MESS_DEAD);
		else if (isInfelice())
			result.append(MESS_SAD);

		return result.toString();
	}

	

}
