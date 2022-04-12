package br.com.senai.suellen.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@SuppressWarnings("serial")
@RequestScoped
@Named
public class PageBean implements Serializable{
	
	private String page;

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	
	public String goTo() {          //CONDIÇÃO
		if("a".equals(page)) {
			return "page_a";
			
		}else if("b".equals(page)) {
			return "page_b";
		}else {
			return null;
		}
		         										
	}
	
}
