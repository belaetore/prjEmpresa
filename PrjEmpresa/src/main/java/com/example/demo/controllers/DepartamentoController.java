package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Departamento;
import com.example.demo.services.DepartamentoService;

@RestController
@RequestMapping("/Departamento")
public class DepartamentoController{
	
	private final DepartamentoService departamentoService;
	
	@Autowired
	public DepartamentoController(DepartamentoService departamentoService) {
		this.departamentoService = departamentoService;
	}
	
	@PostMapping("/criar")
	public ResponseEntity<Departamento> criarDepartamento(@RequestBody Departamento departamento) {
		Departamento departamentoSalvo = departamentoService.salvarDepartamento(departamento);
		if(departamentoSalvo != null) {
			return ResponseEntity.ok(departamentoSalvo);
		}else {
			return ResponseEntity.badRequest().build();
		}
	}
	
	@GetMapping("/{id}")
	public Departamento buscarPorId(@PathVariable Long id) {
		return departamentoService.buscarDepartamentoPorId(id);
	}
	
	@GetMapping
	public List<Departamento> buscarTodos(){
		return departamentoService.buscarTodosDepartamento();
	}	
}