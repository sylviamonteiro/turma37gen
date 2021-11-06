package org.generation.blogPessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.generation.blogPessoal.model.TemaModel;

public interface TemaRepository extends JpaRepository<TemaModel, Long> {

	public List<TemaModel> findAllByDescricaoContaningIgnoreCase(String descricao);

}
