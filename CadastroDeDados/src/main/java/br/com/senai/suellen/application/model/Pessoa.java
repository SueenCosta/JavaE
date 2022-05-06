package br.com.senai.suellen.application.model;

import java.util.Date;

public class Pessoa {
 
	private String nome;
	private String email;
	private Date dataNacismento;
	private Endereco enderecoResidencial;
	private Telefone telefoneResidecial;
	private Telefone celularResidencial;
	private String nomeEmpresa;
	private Endereco enderecoComercial;
	private Telefone telefoneComercial;
	private String cargo;
	private Double salario;
	private Integer interesses;
	
	private Integer[] interreses;

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

	public Date getDataNacismento() {
		return dataNacismento;
	}

	public void setDataNacismento(Date dataNacismento) {
		this.dataNacismento = dataNacismento;
	}

	public Endereco getEnderecoResidencial() {
		return enderecoResidencial;
	}

	public void setEnderecoResidencial(Endereco enderecoResidencial) {
		this.enderecoResidencial = enderecoResidencial;
	}

	public Telefone getTelefoneResidecial() {
		return telefoneResidecial;
	}

	public void setTelefoneResidecial(Telefone telefoneResidecial) {
		this.telefoneResidecial = telefoneResidecial;
	}

	public Telefone getCelularResidencial() {
		return celularResidencial;
	}

	public void setCelularResidencial(Telefone celularResidencial) {
		this.celularResidencial = celularResidencial;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public Endereco getEnderecoComercial() {
		return enderecoComercial;
	}

	public void setEnderecoComercial(Endereco enderecoComercial) {
		this.enderecoComercial = enderecoComercial;
	}

	public Telefone getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(Telefone telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getInteresses() {
		return interesses;
	}

	public void setInteresses(Integer interesses) {
		this.interesses = interesses;
	}

	public Integer[] getInterreses() {
		return interreses;
	}

	public void setInterreses(Integer[] interreses) {
		this.interreses = interreses;
	}
	
	
	
	
	
}
