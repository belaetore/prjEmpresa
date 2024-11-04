package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long depCodigo;
	
	@NotNull
	@Size(min=3,message="Minimo de 3 caracteres")
	private String depNome;

	public Long getDepCodigo() {
		return depCodigo;
	}
	
	public void setDepCodigo(Long depCodigo) {
		this.depCodigo = depCodigo;
	}
	
	
	public String getDepNome() {
		return depNome;
	}
	
	public void setDepNome(String depNome) {
		this.depNome = depNome;
	}
}