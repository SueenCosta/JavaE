package br.com.senai.rafaelvilela.application.bean;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.senai.rafaelvilela.application.model.Cadastro;




@SuppressWarnings("serial") 
@Named("tabela")
@SessionScoped 
public class PageBean implements Serializable{
	
	private String nome;
	private String senha;
	
	@PostConstruct
	public void onCreate() {
		System.out.println("Bean criado");
	}
	
	@PreDestroy
	public void onDestroy() {
		System.out.println("Bean será destruido");
	}
	
	
	public String doLogin() {		//CHAMAR ICON, FAZER COMPARANDO SE E = 
		if("abc".equals(nome) && "123".equals(senha)) {
			return "sucesso";
		}
		return null;			//RETURN NULL ELE MANTEM A MESMA PAGINA 
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private List<Cadastro> despesas = new ArrayList<>();
	
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
		
		Cadastro d = new Cadastro(data,desc,valor); 
		d.setEdit(true);
		back =true;
		despesas.add(d);
		date = null;
		desc = null;
		valor= null;
		return null;
		
	}
	
	public String excluir(Cadastro despesa) {
		
		despesas.remove(despesa);
		
		return null;
	}
	
	public String editar(Cadastro despesa) {
		despesa.setEdit(true); 
		
		return null;
	}
	
	public String gravar (Cadastro despesa) {
		despesa.setEdit(false);
		
		return null;
	}
	
	public List<Cadastro> getDespesas() {
		return despesas;
	}

	public Boolean getBack() {
		return back;
	}

	public void setBack(Boolean back) {
		this.back = back;
	}

}
