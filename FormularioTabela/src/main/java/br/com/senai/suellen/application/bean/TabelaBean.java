package br.com.senai.suellen.application.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.senai.suellen.application.model.Despesas;

@SuppressWarnings("serial")  //tira anuncios de advertência
@SessionScoped  	//tempo de vida da página, o "session" mantém os dados enquanto o navegador estiver aberto
@Named("tabela")
public class TabelaBean implements Serializable{  			//manipular

	private List<Despesas> despesas = new ArrayList<>(); 		//liga as classes


	
	String date;
	String desc;
	Double valor;
	Boolean back = false; 
	
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor1) {
		valor = valor1;
	}
	
	
	
	public String inserir(String data,String desc,Double valor) {
		
		Despesas d = new Despesas(data,desc,valor); 
		d.setEdit(true);
		back =true;
		despesas.add(d);
		date = null;
		desc = null;
		valor= null;
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
	
	public Boolean getBack() {
		return back;
	}

	public void setBack(Boolean back) {
		this.back = back;
	}

}


	

