package br.com.senai.suellen.application.bean;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

import br.com.senai.suellen.application.model.Despesas;
@SuppressWarnings("serial")
@SessionScoped
@Named("tabela")
public class TabelaBean implements Serializable{  			//manipular

	private List<Despesas> despesas = new ArrayList<>(); 		//liga as classes

	
	public String Lista() {
		Despesas l = new Despesas();
		l.setList(true);
		despesas.add(l);
		return null;
	}
	
	
	
	
	
	public String inserir() {  						//criar um objeto e guarda na lista
		Despesas d = new Despesas();
		d.setEdit(true);
		despesas.add(d);
		return null;
	}
	
	public String excluir(Despesas despesa) { 		//atraves do paramentro dentro dos parentes excluir
		despesas.remove(despesa);
		return null;
	}
	
	public String editar(Despesas despesa) {
		despesa.setEdit(true);					//set receber verdadeiro ou falso
		return null;
	}
	
	public String gravar(Despesas despesa) {  		
		despesa.setEdit(false);
		return null;
	}
	
	
	
	public List<Despesas> getDespesas() {    //toda lista pro jsf, depois do get ta igual para chamar
		return despesas;
	}
	

	
}
