package br.com.rafaelcosta.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity		//ESSA CLASSE E QUE VAI GRAVAR NO BANCO DE DADOS NA TABELA
public class Tarefa {

	@Id		//PK QUE VAI CHAMAR, QUE VAI GERAR AUTOMÁTICO
	@GeneratedValue
	private Integer id;
	
	private String descricao;
	
	private Integer prioridade;
	
	private Boolean concluida;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getConcluida() {
		return concluida;
	}

	public void setConcluida(Boolean concluida) {
		this.concluida = concluida;
	}

	public Integer getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}	
	
	
	
}
