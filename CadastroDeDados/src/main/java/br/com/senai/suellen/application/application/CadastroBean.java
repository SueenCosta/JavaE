package br.com.senai.suellen.application.application;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.senai.suellen.application.model.Endereco;
import br.com.senai.suellen.application.model.Estado;
import br.com.senai.suellen.application.model.Interesse;
import br.com.senai.suellen.application.model.Pessoa;
import br.com.senai.suellen.application.model.Telefone;
import br.com.senai.suellen.application.util.DataProvider;

@SuppressWarnings("serial")
@Named("cadastro")
@SessionScoped
public class CadastroBean implements Serializable {

	 private Pessoa pessoa;
	 
	 public Pessoa getPessoa1() {
		 if (pessoa == null) {
			 pessoa = new Pessoa();
			 pessoa.setEnderecoResidencial(new Endereco());
			 pessoa.getEnderecoResidencial().setEstado(new Estado());
			 pessoa.setEnderecoComercial(new Endereco());
			 pessoa.getEnderecoComercial().setEstado(new Estado());
			 pessoa.setTelefoneResidecial(new Telefone());
			 pessoa.setCelularResidencial(new Telefone());
			 pessoa.setTelefoneComercial(new Telefone()); 
		 }
		 
		 return pessoa; 
	 }

	 
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	public List<Estado> getEstados(){
		return DataProvider.ESTADOS;
	}
	
	public List<Interesse> getInteresses() {
		return DataProvider.INTERESSES;
	}
}
