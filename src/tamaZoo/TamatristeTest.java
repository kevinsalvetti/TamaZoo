package tamaZoo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TamatristeTest {
	@Test
	public void tamatristeShouldDieWhenRepletionIsZero() throws Exception {
		final Tamagotchi tama = new TamaTriste("triste", 50);
		assertFalse(tama.isDie());
	}
	
	@Test
	public void tamatristeIsEverUnhappyDespiteCaresses() throws Exception {
		final Tamagotchi tama = new TamaTriste("triste", 50);
		tama.aggiungiCarezze(100);;
		tama.aggiungiCarezze(100);;
		tama.aggiungiCarezze(100);;
		tama.aggiungiCarezze(100);;
		tama.aggiungiCarezze(100);
		assertFalse(!tama.isInfelice());
	}
}
