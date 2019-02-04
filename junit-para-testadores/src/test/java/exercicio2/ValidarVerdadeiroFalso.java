package exercicio2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidarVerdadeiroFalso {

	@Test
	public void validacaoVerdadeiro_Sucesso() {
		boolean campoEstaPresente = true;
		assertTrue(campoEstaPresente);
	}
	
	@Test
	public void validacaoVerdadeir_Falha() {
		boolean campoEstaPresente = true;
		assertFalse("Campo não está presente", campoEstaPresente);
	}
}
