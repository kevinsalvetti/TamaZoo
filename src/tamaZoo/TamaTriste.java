package tamaZoo;

// tipo tamaTriste, è sempre triste muore solo se non mangia o mangia troppo
public class TamaTriste extends Tamagotchi {

	/**
	 * costruttore TamaTriste
	 * @param nome
	 * @param sazieta
	 */
	public TamaTriste(String nome, int sazieta) {
		super(nome, 0, sazieta);
		super.nomeTipo = "triste";
	}

	/**
	 * meotodo per dare carezze
	 * @param numCarezze
	 */
	public void riceviCarezze(int numCarezze) {
		setSazieta(Math.max(0, (getSazieta() - numCarezze) / FATTORE_CAREZZE));
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
		return getSazieta() == 0 || getSazieta() == MAX_SAZIETA;
	}

	/**
	 * metodo che decreta se il tamagotchi è triste 
	 */
	public boolean isInfelice() {
		return true;
	}
}