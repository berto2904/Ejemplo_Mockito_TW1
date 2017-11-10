package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Libro {
	@Id
	private Long idLibro;
	private String titulo;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAutor")
	private Autor autor;

	public Libro(Long idLibro, String titulo, Autor autor) {
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.autor = autor;
	}

	public Long getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Long idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
	
}
