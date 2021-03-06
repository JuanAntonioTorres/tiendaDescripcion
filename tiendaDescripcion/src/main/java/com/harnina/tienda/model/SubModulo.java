package com.harnina.tienda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SubModulo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idSubModulo;

	@OneToOne()
	private Modulo modulo;
	
	@OneToOne()
	private NombreSubModulo nombreSubModulo;
	
	public SubModulo() {}
	
	public SubModulo(Modulo modulo, NombreSubModulo nombreSubModulo) {
		this.modulo = modulo;
		this.nombreSubModulo = nombreSubModulo;
	}

	public SubModulo(NombreSubModulo nombreSubModulo,Modulo modulo) {
		this.nombreSubModulo = nombreSubModulo;
		this.modulo = modulo;
	}

	public long getIdSubModulo() {
		return idSubModulo;
	}

	public NombreSubModulo getNombreSubModulo() {
		return nombreSubModulo;
	}

	public void setNombreSubModulo(NombreSubModulo nombreSubModulo) {
		this.nombreSubModulo = nombreSubModulo;
	}

	public void setIdSubModulo(long idSubModulo) {
		this.idSubModulo = idSubModulo;
	}
	public Modulo getModulo() {
		return modulo;
	}

	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}

	
}
