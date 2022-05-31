package com.example.cursoMc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cursoMc.domain.Categoria;
import com.example.cursoMc.repositories.CategoriaRepository;
import com.example.cursoMc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) { 
		 Optional<Categoria> obj = repo.findById(id);
		 //return obj.orElse(null);
		 return obj.orElseThrow(() -> new ObjectNotFoundException(
			 "Objeto nao encontrado Id: " + id + ", Tipo: " + Categoria.class.getName()));
		 }
	
	}


