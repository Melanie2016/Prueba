package ar.edu.unlam.tallerweb1.probando.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "PUNTO")
public class Punto {
	
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Column(name = "ID")
private Long id;
@Column(name = "LATITUD")
private String latitud;
@Column(name = "LONGITUD")
private String longitud;

public Long getId(){
	return id;
}
public void setId(Long id){
	this.id= id;
}

public String getLatitud(){
	return latitud;
}
public void setLatitud(String latitud){
	this.latitud= latitud;
}

public String getLongitud(){
	return longitud;
}
public void setLongitud(String longitud){
	this.longitud= longitud;
}
}

