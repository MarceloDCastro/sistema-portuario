package com.t2s.sistemaportuario.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.t2s.sistemaportuario.model.Container;

@Service
public class ContainerService {

	//Métodos: insert, findAll, find, update, delete
	
	public void create (Container container) {
	}
	
	public List<Container> findAll(){
		
	}
	
	public Container find(Container container){
	}
	
	public Container find(Long id) {
	}
	
	public boolean update(Container container) {
		Container _container = find(container);
	}
	
	public boolean delete (Long id) {
		Container _container  = find(id);
	}
	
	
}