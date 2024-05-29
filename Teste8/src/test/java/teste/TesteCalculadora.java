package teste;

import org.junit.*;
import aplicacao.Calculadora;

public class TesteCalculadora {

	@Test
	public void testeSoma() {
		double result;
		
		Calculadora calc = new Calculadora();
		result = calc.somar(22.0, 17.0);
		
		Assert.assertEquals(39.0, result, 0);
	}
	
}
