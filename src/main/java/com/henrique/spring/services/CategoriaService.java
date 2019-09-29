package com.henrique.spring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henrique.spring.domain.Categoria;
import com.henrique.spring.repositories.categoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private categoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
