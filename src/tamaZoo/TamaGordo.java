package tamaZoo;

//tipo tamaGordo, ha sempre fame ma non muore anche se non gli vengono date carezze
public class TamaGordo extends Tamagotchi {

	private final static int MOLTIPLICATORE_CAREZZE = 2;

	/**
	 * costruttore tamaGordo 
	 * @param nome
	 * @param sazieta
	 */
	public TamaGordo(String nome, int sazieta) {
		super(nome, MAX_SODDISFAZIONE, sazieta);
		super.nomeTipo = "gordo";
}

	/**
	 * metodo per dare carezze
	 * @param numCarezze
	 */
	public void riceviCarezze(int numCarezze) {
		setSazieta(Math.max(0, getSazieta() - (numCarezze * MOLTIPLICATORE_CAREZZE / FATTORE_CAREZZE)));
	}

	/**
	 * metodo per dare biscotti
	 * @param numBiscotti
	 */
	public void riceviBiscotti(int numBiscotti) {
		for (int i = 1; i <= numBiscotti; i++) {
		setSazieta(Math.min(getSazieta() * INCREMENTA_BISCOTTI , MAX_SAZIETA));
		}
	}
	
	/**
	 * metodo che decreta la morte del Tamagotchi
	 */
	public boolean isDie() {
		return getSazieta() == 0;
	}

	/**
	 * metodo che decreta se il tamagotchi è triste 
	 */
	public boolean isInfelice() {
		return getSazieta() < SOGLIA_MIN_SAZIETA;
	}
}