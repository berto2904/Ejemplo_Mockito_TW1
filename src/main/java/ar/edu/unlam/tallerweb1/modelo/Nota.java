package ar.edu.unlam.tallerweb1.modelo;

public class Nota {
	private Integer nota;
	private Double notaRecuperatorio;

	public Nota(Integer nota) throws Exception {
		if (nota != null && nota > 0 && nota < 11) {
			this.nota = nota;
		} else {
			throw new Exception();
		}
	}

	public Integer getNota() {
		return nota;
	}

	public Integer recuperar(Integer nota, Integer notaRecuperatorio) {

		if (nota < 7) {
			return nota = notaRecuperatorio;
		} else {
			return nota;
		}
	}

	public Boolean alumnoAprobado(Double n) {
        if (n >4&&n<=10)
		{return true;}
	}

	public Boolean alumnoNoAprobado(Double n) {

		return false;
	}

}
	
}
