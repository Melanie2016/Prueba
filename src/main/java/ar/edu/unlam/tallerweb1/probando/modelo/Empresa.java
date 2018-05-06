package ar.edu.unlam.tallerweb1.probando.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Empresa{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmpresa;
	private String razonSocial;
	
	
	
	
	public Long getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	
	@Override
	public String toString() {
		return "Empresa = \n ID:  " + idEmpresa + "\n RazonSocial: " + razonSocial;
	}
	
	
	
	
	
}