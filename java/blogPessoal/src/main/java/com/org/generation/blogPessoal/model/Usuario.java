package com.org.generation.blogPessoal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Size(min = 2, max = 100)
	private String nome;

	@ApiModelProperty (example = "email@email.com.br")
	@Email (message = "O atributo Usuário deve ser um email válido!")
	@NotNull(message = "O atributo Usuário é Obrigatório!")
	@Size(min = 5, max = 100)
	private String usuario;

	@NotNull
	@Size(min = 5, max = 100)
	private String senha;
	
	private String foto;
	
	@OneToMany(mappedBy = "criador", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties({"criador"})
	private List<PostagemModel> minhasPostagens = new ArrayList<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public List<PostagemModel> getMinhasPostagens() {
		return minhasPostagens;
	}

	public void setMinhasPostagens(List<PostagemModel> minhasPostagens) {
		this.minhasPostagens = minhasPostagens;
	}

}
