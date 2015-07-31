package exemplos.funcoes_e_procedimentos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteFuncaoContaDigitos {
	@Test
	public void umDigitoParaValoresMenoresQue10() {
		assertEquals(1, FuncaoContaDigitos.contaDigitos(0));
		assertEquals(1, FuncaoContaDigitos.contaDigitos(1));
		assertEquals(1, FuncaoContaDigitos.contaDigitos(5));
		assertEquals(1, FuncaoContaDigitos.contaDigitos(8));
		assertEquals(1, FuncaoContaDigitos.contaDigitos(9));
	}
	
	@Test
	public void doisDigitosParaValoresMaioresEntre10E99() {
		assertEquals(2, FuncaoContaDigitos.contaDigitos(10));
		assertEquals(2, FuncaoContaDigitos.contaDigitos(11));
		assertEquals(2, FuncaoContaDigitos.contaDigitos(22));
		assertEquals(2, FuncaoContaDigitos.contaDigitos(33));
		assertEquals(2, FuncaoContaDigitos.contaDigitos(98));
		assertEquals(2, FuncaoContaDigitos.contaDigitos(99));
	}
	
	@Test
	public void tresDigitosParaValoresMaioresEntre100E990() {
		assertEquals(3, FuncaoContaDigitos.contaDigitos(100));
		assertEquals(3, FuncaoContaDigitos.contaDigitos(101));
		assertEquals(3, FuncaoContaDigitos.contaDigitos(223));
		assertEquals(3, FuncaoContaDigitos.contaDigitos(578));
		assertEquals(3, FuncaoContaDigitos.contaDigitos(990));		
		assertEquals(3, FuncaoContaDigitos.contaDigitos(998));
		assertEquals(3, FuncaoContaDigitos.contaDigitos(999));
	}

}
