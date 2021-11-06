package com.org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.generation.blogPessoal.model.TemaModel;

@RestController
@RequestMapping("/tema")
@CrossOrigin("*")

public class TemaController {

	@Autowired
	private TemaRepository repository;

	@GetMapping
	public ResponseEntity<List<TemaModel>> findAllTema() {
		return ResponseEntity.ok(repository.findAll());

	}

}
