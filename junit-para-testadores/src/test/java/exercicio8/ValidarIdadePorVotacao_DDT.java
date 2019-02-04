package exercicio8;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import votacao.Votacao;

@RunWith(Parameterized.class)
public class ValidarIdadePorVotacao_DDT {
	
	String nome;
	int anoDeNascimento;
	String resultadoEsperado;
	
	public ValidarIdadePorVotacao_DDT(String nome, int anoDeNascimento, String resultadoEsperado) {
		this.nome = nome;
		this.anoDeNascimento = anoDeNascimento;
		this.resultadoEsperado = resultadoEsperado;
	}
	
	@Parameters(name = "{0} | {1} | {2}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"Maria",	2004, "Maria voce nao pode votar"},
			{"Rodrigo", 2003, "Rodrigo seu voto e facultativo"},
			{"João",	2002, "João seu voto e facultativo"},
			{"Carla",	2001, "Carla seu voto e obrigatorio"},
			{"Jose",	1994, "Jose seu voto e obrigatorio"},
			{"Ana",		1949, "Ana seu voto e obrigatorio"},
			{"Pedro",	1948, "Pedro seu voto e facultativo"}
		});
	}
	
	@Test
	public void validarObrigatoriedadeDeVoto() {
		assertEquals(resultadoEsperado,Votacao.podeVotar(nome, anoDeNascimento));
	}
	
}
