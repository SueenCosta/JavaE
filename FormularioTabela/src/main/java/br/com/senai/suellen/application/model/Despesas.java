package br.com.senai.suellen.application.model;

import java.sql.Date;

public class Despesas {
 private String data;
 private String descricao;
 private Double valor;
 private Boolean edit;

 
 
public String getData() {
	return data;
}

public Despesas(String data, String descricao, Double valor) {
	super();
	this.data = data;
	this.descricao = descricao;
	this.valor = valor;
}

public void setData(String data) {
	this.data = data;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public Double getValor() {		//puchar informaçao
	return valor;
}
public void setValor(Double valor) {
	this.valor = valor;
}
public Boolean getEdit() {
	return edit;
}
public void setEdit(Boolean edit) {
	this.edit = edit;
}
 
 
 
 

}
