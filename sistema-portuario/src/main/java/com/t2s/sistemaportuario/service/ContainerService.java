package com.t2s.sistemaportuario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t2s.sistemaportuario.model.Container;
import com.t2s.sistemaportuario.repositories.ContainerRepository;

@Service
public class ContainerService implements ServiceInterface<Container> {

	@Autowired
	private ContainerRepository repository;
	
	@Override
	public Container create(Container obj) {
		repository.save(obj);
		return obj;
	}

	@Override
	public Container findById(Long id) {
		Optional<Container> _container = repository.findById(id);
		return _container.orElse(null);
	}

	@Override
	public List<Container> findAll() {
		return repository.findAll();
	}

	@Override
	public boolean update(Container obj) {
		if (repository.existsById(obj.getId())) {
			repository.save(obj);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Long id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}
		return false;
	}

}