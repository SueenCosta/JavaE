package br.com.senai.suellen.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.senai.suellen.model.Linguagem;


@SuppressWarnings("serial")
@Named("cadastro")
@RequestScoped
public class CadastroBean implements Serializable {
	private String nome;
	private String email;
	private String senha1;
	private String senha2;
	private String sexo;
	private Boolean receberEmails;
	private String observacoes;
	private Integer[] linguagens;          //gerar get, set para saber onde esta vindo as informaçãos
	
	
	public Linguagem[] getListaLinguagens() { 				//constantis sao em letra maiuscula
		return Linguagem.LINGUAGENS;                             
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha1() {
		return senha1;
	}
	public void setSenha1(String senha1) {
		this.senha1 = senha1;
	}
	public String getSenha2() {
		return senha2;
	}
	public void setSenha2(String senha2) {
		this.senha2 = senha2;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Boolean getReceberEmails() {
		return receberEmails;
	}
	public void setReceberEmails(Boolean receberEmails) {
		this.receberEmails = receberEmails;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public Integer[] getLinguagens() {
		return linguagens;
	}
	public void setLinguagens(Integer[] linguagens) {
		this.linguagens = linguagens;
	}
	
	public String getLinguagensAsString() {
		String str ="";
		boolean first = true; 						//pega a virgula coloca o valor e coloco
		for(Integer linguagem : linguagens) {
			if(!first) {
				str += ",";
			}
			str += Linguagem.LINGUAGENS[linguagem].getNome();
			first = false;
		}
		
		return str;
	}
	
	
	
	
	

}