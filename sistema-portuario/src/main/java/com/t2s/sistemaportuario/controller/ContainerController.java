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

import com.t2s.sistemaportuario.model.Container;
import com.t2s.sistemaportuario.service.ContainerService;

@RestController
@RequestMapping("/containers")
public class ContainerController implements ControllerInterface<Container>{
	
	@Autowired
	private ContainerService service;
	
	@Override
	@GetMapping
	public ResponseEntity<List<Container>> getAll (){
		return ResponseEntity.ok(service.findAll());
	}
	
	@Override
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> get (@PathVariable("id") Long id){
		Container _container = service.findById(id);
		if (_container != null) 
			return ResponseEntity.ok(_container);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	@Override
	@PostMapping
	public ResponseEntity<Container> post (@RequestBody Container container){
		service.create(container);
		return ResponseEntity.ok(container);
	}
	
	@Override
	@PutMapping
	public ResponseEntity<?> put (@RequestBody Container container){
		if (service.update(container))
			return ResponseEntity.ok(container);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	@Override
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> delete (@PathVariable("id") Long id){
		if (service.delete(id))
			return ResponseEntity.ok().build();
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

}
