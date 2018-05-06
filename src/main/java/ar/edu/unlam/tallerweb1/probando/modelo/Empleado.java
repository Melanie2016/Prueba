package ar.edu.unlam.tallerweb1.probando.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Empleado{
	
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idEmpleado;
	private Integer dni;
	private String nombre;
	
	@ManyToOne
	private Sector sector;
	
	
	
	public Long getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Sector getSector() {
		return sector;
	}
	public void setSector(Sector sector) {
		this.sector = sector;
	}
	
	
	@Override  // como testear sin system.
	public String toString() {
		return "Empleado = \n ID:  " + idEmpleado + "\n DNI: "+ dni +"\n Nombre: " + nombre + "\n"+sector;
	}
	
}