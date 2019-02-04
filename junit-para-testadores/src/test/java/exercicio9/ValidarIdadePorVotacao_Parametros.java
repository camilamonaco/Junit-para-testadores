package exercicio9;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import votacao.Votacao;

@RunWith(Parameterized.class)
public class ValidarIdadePorVotacao_Parametros {

	@Parameter(0) public String nome;
	@Parameter(1) public int anoDeNascimento;
	@Parameter(2) public String resultado;	
	
	@Test
	public void validarObrigatoriedadeDeVoto() {
		assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
	}
	
	@Parameters(name = "{0} | {1} | {2}" )
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"Maria",	2004, "Maria voce nao pode votar"},
			{"Rodrigo", 2003, "Rodrigo seu voto e facultativo"},
			{"Jo�o",	2002, "Jo�o seu voto e facultativo"},
			{"Carla",	2001, "Carla seu voto e obrigatorio"},
			{"Jose",	1994, "Jose seu voto e obrigatorio"},
			{"Ana",		1949, "Ana seu voto e obrigatorio"},
			{"Pedro",	1948, "Pedro seu voto e facultativo"}
		});
	}
	
}
