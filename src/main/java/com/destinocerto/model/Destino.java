package com.destinocerto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Destino {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private float valor;
	private String descricao;
	private String imagem;
	
//	@ManyToOne
//	@JoinColumn(name="cliente_id", nullable = false)
//	private Cliente cliente;

	public Destino(long id, String nome, float valor, String descricao, String imagem) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.descricao = descricao;
		this.imagem = imagem;
	}

	public Destino() {
		super();
	}

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

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
}
