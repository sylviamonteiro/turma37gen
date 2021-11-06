package com.org.generation.blogPessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table (name="tb_tema")
@Entity
public class TemaModel {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size (min=100, max=1000)
	private String descricao;

	@OneToMany(mappedBy="temaPostagem",cascade=CascadeType.REMOVE)
	@JsonIgnoreProperties("temaPostagem")
	private List<PostagemModel> postagens;
	
	
	public List<PostagemModel> getPostagens() {
		return postagens;
	}

	public void setPostagens(List<PostagemModel> postagens) {
		this.postagens = postagens;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	} 
	
	
}
