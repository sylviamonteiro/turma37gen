package com.org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.generation.blogPessoal.model.PostagemModel;

@RestController
@RequestMapping("/postagem")
@CrossOrigin("*")

public class PostagemController {

	@Autowired
	private PostagemRepository repository;

	@GetMapping
	public ResponseEntity<List<PostagemModel>> findAllPostagens() {
		return ResponseEntity.ok(repository.findAll());

	}

}
