package ar.edu.unlam.tallerweb1.probando.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sector{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idSector;
	private String nombre;
	
	@ManyToOne
	private Empresa empresa;

	
	
	
	public Long getIdSector() {
		return idSector;
	}

	public void setIdSector(Long idSector) {
		this.idSector = idSector;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	} 
	
	
	@Override
	public String toString() {
		return "Sector = \n ID:  " + idSector + "\n Nombre: " + nombre + "\n"+empresa;
	}
	
}