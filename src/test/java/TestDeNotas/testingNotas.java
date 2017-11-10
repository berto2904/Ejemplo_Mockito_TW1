package TestDeNotas;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import ar.edu.unlam.tallerweb1.modelo.Nota;
import org.junit.*;

public class testingNotas {

	@Test
	public void testalCrearNotaDeberiaTenerValorMayorAUnoyMenorIgualADiez() throws Exception 	
	{
		Nota n = new Nota(3);		
		// Integer valorNota = n.getNota();	
		Assert.assertTrue(1<=n.getNota()&&10>=n.getNota());
	}
	
	@Test(expected=Exception.class)
	public void testAlCrearNotaConValorNoNuloDeberiaDarError() throws Exception
	{
		Nota n = new Nota(null);	
	}
	
	@Test(expected=Exception.class)
	public void testAlCrearNotaConValorNegativoDeberiaDarError()throws Exception
	{Nota n = new Nota(-4);}
	
	@Test (expected=Exception.class)
	public void testAlCrearNotaConValorMayorDiezDeberiaDarError()throws Exception
	{Nota n = new Nota(12);}
	
	
	@Test
	public void testAlCrearNotaSeMantengaelValor() throws Exception
	{Nota n = new Nota(8);
	Assert.assertTrue(n.getNota()==8);
	}
	
	
//aprobado
	@Test
	public void testAlumnoAprobado()throws Exception
	{
		Nota n = New Nota(4);
		Assert.assertTrue());
		
	}

}
