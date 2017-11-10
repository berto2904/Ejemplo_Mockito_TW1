package ar.edu.unlam.tallerweb1.modelo;

public class Tragamoneda {
	private Tambor t1;
	private Tambor t2;
	private Tambor t3;
	
	public Tragamoneda(Tambor t1, Tambor t2, Tambor t3) {
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}
	
	public Tambor getT1() {
		return t1;
	}

	public void setT1(Tambor t1) {
		this.t1 = t1;
	}

	public Tambor getT2() {
		return t2;
	}

	public void setT2(Tambor t2) {
		this.t2 = t2;
	}

	public Tambor getT3() {
		return t3;
	}

	public void setT3(Tambor t3) {
		this.t3 = t3;
	}

	public void activar() {
		t1.girar();
		t2.girar();
		t3.girar();
	}


	public Boolean entregarPremio() {
		if (t1.getValor().equals(t2.getValor()) && t2.getValor().equals(t3.getValor())) {
			return true;
		}
		return false;
	}
	
	
}
