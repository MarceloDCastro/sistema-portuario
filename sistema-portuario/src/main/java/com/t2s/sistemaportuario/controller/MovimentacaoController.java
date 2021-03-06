package com.t2s.sistemaportuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.t2s.sistemaportuario.model.Movimentacao;
import com.t2s.sistemaportuario.service.MovimentacaoService;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController implements ControllerInterface<Movimentacao>{
	
	@Autowired
	private MovimentacaoService service;

	@Override
	@GetMapping
	public ResponseEntity<List<Movimentacao>> getAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@Override
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> get(@PathVariable("id") Long id) {
		Movimentacao _movimentacao = service.findById(id);
		if (_movimentacao != null) 
			return ResponseEntity.ok(_movimentacao);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@Override
	@PostMapping
	public ResponseEntity<Movimentacao> post(@RequestBody Movimentacao movimentacao) {
		service.create(movimentacao);
		return ResponseEntity.ok(movimentacao);
	}

	@Override
	@PutMapping
	public ResponseEntity<?> put(@RequestBody Movimentacao movimentacao) {
		if (service.update(movimentacao))
			return ResponseEntity.ok(movimentacao);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@Override
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		if (service.delete(id))
			return ResponseEntity.ok().build();
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
}