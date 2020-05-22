package tamaZoo;

public class TamaGordo extends Tamagotchi {

	private final static int MOLTIPLICATORE_CAREZZE = 2;

	public TamaGordo(String nome, int sazieta) {
		super(nome, MAX_SODDISFAZIONE, sazieta);
		super.nomeTipo = "gordo";
}

	public void riceviCarezze(int numCarezze) {
		setSazieta(Math.max(0, getSazieta() - (numCarezze * MOLTIPLICATORE_CAREZZE / FATTORE_CAREZZE)));
	}

	public void riceviBiscotti(int numBiscotti) {
		for (int i = 1; i <= numBiscotti; i++) {
		setSazieta(Math.min(getSazieta() * INCREMENTA_BISCOTTI , MAX_SAZIETA));
		}
	}
	
	public boolean isDie() {
		return getSazieta() == 0;
	}

	public boolean isInfelice() {
		return getSazieta() < SOGLIA_MIN_SAZIETA;
	}
}