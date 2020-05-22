package tamaZoo;

public class TamaTriste extends Tamagotchi {

	public TamaTriste(String nome, int sazieta) {
		super(nome, 0, sazieta);
		super.nomeTipo = "triste";
	}

	public void riceviCarezze(int numCarezze) {
		setSazieta(Math.max(0, (getSazieta() - numCarezze) / FATTORE_CAREZZE));
	}

	public void riceviBiscotti(int numBiscotti) {
		for (int i = 1; i <= numBiscotti; i++) {
		setSazieta(Math.min(getSazieta() * INCREMENTA_BISCOTTI , MAX_SAZIETA));
		}
	}

	public boolean isDie() {
		return getSazieta() == 0 || getSazieta() == MAX_SAZIETA;
	}

	public boolean isInfelice() {
		return true;
	}
}