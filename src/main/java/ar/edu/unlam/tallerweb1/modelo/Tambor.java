package ar.edu.unlam.tallerweb1.modelo;
import static org.assertj.core.api.Assertions.*;

import java.util.Random;

public class Tambor {
	private Integer valor;
	
	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	public Integer girar() {
		Random r = new Random();
		valor = r.nextInt(7)+1;
		return valor;
		
	}
	
	
	
}
