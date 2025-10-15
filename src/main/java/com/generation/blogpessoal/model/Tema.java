package com.generation.blogpessoal.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name= "tb_temas") // CREATE TABLE tb_tema (
public class Tema {
	
	@Id // PRIMARY KEY (id)
	@GeneratedValue(strategy= GenerationType.IDENTITY) // AUTO_INCREMENT
	private Long id;
	@Column(length = 200)
	@NotBlank(message = "O atributo descrição é obrigatório!")
	@Size(min = 100, max = 200, message = "O atributo descrição deve conter no mínimo 100 e no máximo 200 caracters")
	private String descricao;
	
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}

	