package br.com.rafaelcosta.jpa.ejbbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.rafaelcosta.jpa.model.Tarefa;

@Stateless			//TIPO DE BEAN
public class TarefaBean {

	@PersistenceContext
	private EntityManager em;		//UMA DAS CLASSES JPA QUE FAZ CONECÇÃO COM A BANCO
	
	public void inserir(Tarefa tarefa) {	//PERSIST ELE INSERE
		em.persist(tarefa);
	}
	
	public void atualizar(Tarefa tarefa) {			//MERGE FAZ UPTADE
		em.merge(tarefa);
	}
	
	public void excluir(Tarefa tarefa) {
		tarefa = carregar(tarefa.getId());
		em.remove(tarefa);
	}
	
	public Tarefa carregar(int id) {			//FIND PELO ID FAZ ..TRAZ UM OBJETO 'CARREGAR'
		return em.find(Tarefa.class, id);
	}
}
