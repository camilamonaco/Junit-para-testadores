package exercicio5;

import org.junit.*;

public class PreEPosCondicoesDaClasse {

	@BeforeClass
	public static void preCondicao_AntesClasse() {
		System.out.println("Executou antes de todos os testes");
	}
	
	@Before
	public void preCondicao_AntesTeste() {
		System.out.println("Executou antes do teste");
	}
	
	@Test
	public void exibicaoPrePosCondicao_Teste1() {
		System.out.println("Executou o Teste 1");
	}
	
	@Test
	public void exibicaoPrePosCondicao_Teste2() {
		System.out.println("Executou o Teste 2");
	}
	
	@After
	public void posCondicao_AposTeste() {
		System.out.println("Executou após o teste");
	}
	
	@AfterClass
	public static void posCondicao_AposClasse() {
		System.out.println("Executou após todos os testes");
	}
}
