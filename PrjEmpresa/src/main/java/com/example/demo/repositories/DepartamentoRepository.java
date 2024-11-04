package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long>{
	
}