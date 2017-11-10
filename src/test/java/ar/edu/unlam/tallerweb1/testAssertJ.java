package ar.edu.unlam.tallerweb1;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.controladores.ControladorLogin;
import ar.edu.unlam.tallerweb1.modelo.Tambor;
import ar.edu.unlam.tallerweb1.modelo.Tragamoneda;
import org.mockito.*;
import static org.assertj.core.api.Assertions.*;

public class testAssertJ {

	@Test
	public void test() {
		Tambor tambor = new Tambor();
		tambor.girar();
		assertThat(tambor.getValor()).isBetween(1, 8);
	}
	
	@Test
	public void tresTamboresConValoresIguales() {
		Tambor t1 = new Tambor();
		Tambor t2 = new Tambor();
		Tambor t3 = new Tambor();

		Tragamoneda traga1 = new Tragamoneda(t1, t2, t3);
		assertThat(t1.getValor()).isBetween(1, 8);
		assertThat(t2.getValor()).isBetween(1, 8);
		assertThat(t3.getValor()).isBetween(1, 8);
	}
	@Test
	public void alPasarUsuarioYPassInvalidoDeberiaLlevarALogin() {
		
	 ControladorLogin cont  = new ControladorLogin();
	 ModelAndView mav = cont.validarLogin("hola", request);
	 assertThat(mav.getView()).isEqualTo("login");
	 assertThat(mav.getModel().get("error")).isEqualTo("usuario-invalido");
	}
	
	@Test
	public void sarasa() {
		Tambor t1 = mock(Tambor.class);
		Tambor t2 = mock(Tambor.class);
		Tambor t3 = mock(Tambor.class);
		
		
		Tragamoneda t = new Tragamoneda(t1, t2, t3);
		t.activar();
		when(t1.getValor()).thenReturn(5);
		when(t2.getValor()).thenReturn(5);
		when(t3.getValor()).thenReturn(5);
		
		assertThat(t.entregarPremio()).isTrue();
		verify(t1,times(1)).girar();
		verify(t2,times(1)).girar();
		verify(t3,times(1)).girar();
	}

}
