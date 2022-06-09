package br.com.rafaelcosta.jpa.jsfbean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.rafaelcosta.jpa.ejbbean.TarefaBean;
import br.com.rafaelcosta.jpa.model.Tarefa;

@Named("form") 			//FAZER O BAINER CHAMANDO O FORM,
@RequestScoped
public class FormBean implements Serializable {
	
	@EJB
	private TarefaBean tarefaBean;			

	@Inject
	private FacesContext context;			//CLASSE DO JB 'FACESCONTEXT' CAPTURA A INFORMAÇÃO QUE ESTA ACONTECENDO, E GUARDA NELE
	
	private UIComponent searchInputText;
	
	private Integer tarefaId;
	
	private Tarefa tarefa;
	
	public void gravar(AjaxBehaviorEvent event) {		//METODO 
		if(tarefa.getId()==null) {
			tarefaBean.inserir(tarefa);
		}else {
			tarefaBean.atualizar(tarefa);
		}		
	}
	
	public void pesquisar(AjaxBehaviorEvent event) {			//AJAX PARA FAZER A CHAMADA
		tarefa = tarefaBean.carregar(tarefaId);
		
		if(tarefa == null) {
			context.addMessage(searchInputText.getClientId(context),
					new FacesMessage("Tarefa n�o encontrada"));
		}
		tarefaId = null;		
	}
	
	public void excluir(AjaxBehaviorEvent event) {
		tarefaBean.excluir(tarefa);
		tarefa = null;
	}
	public Tarefa getTarefa() {			//BEAN SO REPASSA AS INFORMAÕES
		if(tarefa==null) {
			tarefa = new Tarefa();
		}
		return tarefa;
	}

	public UIComponent getSearchInputText() {
		return searchInputText;
	}

	public void setSearchInputText(UIComponent searchInputText) {
		this.searchInputText = searchInputText;
	}

	public Integer getTarefaId() {
		return tarefaId;
	}

	public void setTarefaId(Integer tarefaId) {
		this.tarefaId = tarefaId;
	}
	
	
	
}
