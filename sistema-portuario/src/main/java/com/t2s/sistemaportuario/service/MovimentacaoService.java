package com.t2s.sistemaportuario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t2s.sistemaportuario.model.Movimentacao;
import com.t2s.sistemaportuario.repositories.MovimentacaoRepository;

@Service
public class MovimentacaoService implements ServiceInterface<Movimentacao>{

	@Autowired
	private MovimentacaoRepository repository;
	
	@Override
	public Movimentacao create(Movimentacao obj) {
		repository.save(obj);
		return obj;
	}

	@Override
	public Movimentacao findById(Long id) {
		Optional<Movimentacao> _movimentacao = repository.findById(id);
		return _movimentacao.orElse(null);
	}

	@Override
	public List<Movimentacao> findAll() {
		return repository.findAll();
	}

	@Override
	public boolean update(Movimentacao obj) {
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
