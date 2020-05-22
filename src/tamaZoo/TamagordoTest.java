package tamaZoo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TamagordoTest {
	@Test
	public void tamagordoShouldNotDieDueToTooManyCookies() throws Exception {
		Tamagotchi tama = new TamaGordo("gordo", 90);
		tama.daiBiscotti(100);
		tama.daiBiscotti(100);
		assertTrue(!tama.isInfelice());
		assertTrue(!tama.isInfelice());
	}

	@Test
	public void tamagordoDiesDueToHunger() throws Exception {
		Tamagotchi tama = new TamaGordo("gordo", 0);
		assertTrue(tama.isDie());
	}
}
