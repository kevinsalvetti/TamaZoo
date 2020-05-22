package tamazoo;

public class TamaTriste extends Tamagotchi {

	public TamaTriste(String nome, int sazieta) {
		super(nome, 0, sazieta);
		super.nomeTipo = "triste";
	}

	public void riceviCarezze(int, numCarezze) {
		sazieta (Math.max(0, (sazieta() - numCarezze) / FATTORE_CAREZZE));
	}

	public void riceviBiscotti(int, numBiscotti) {
		for (int i = 1; i <= numBiscotti; i++) {
		sazieta (Math.min(sazieta() * INCREMENTA_BISCOTTI , MAX_SAZIETA));
		}
	}

	public boolean isDie() {
		return getGradoSazieta() == 0 || getGradoSazieta() == MAX_SAZIETA;
	}

	public boolean isInfelice() {
		return true;
	}
}