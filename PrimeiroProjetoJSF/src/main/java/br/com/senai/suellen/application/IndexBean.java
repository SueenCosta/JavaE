package br.com.senai.suellen.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@RequestScoped
public class IndexBean implements Serializable{
	
	public String getMensagem() {
		
		return "texto vindo do Bean";
	}
	
	

}
