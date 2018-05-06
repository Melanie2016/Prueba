package ar.edu.unlam.tallerweb1.probando.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Direccion{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String calle;
	private String numero;
//	
//	@ManyToOne()
//	private Barrio barrio;
//	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
//	public Barrio getBarrio() {
//		return barrio;
//	}
//	public void setBarrio(Barrio barrio) {
//		this.barrio = barrio;
//	}
//
//	
	

	
}
