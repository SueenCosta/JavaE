package br.com.senai.suellen.application.util;

import java.util.ArrayList;
import java.util.List;

import br.com.senai.suellen.application.model.Estado;
import br.com.senai.suellen.application.model.Interesse;

public class DataProvider {
	
	public static final List<Estado> ESTADOS;
	public static final List<Interesse> INTERESSES;
	
	static {
		ESTADOS = new ArrayList<>();
		ESTADOS.add(new Estado("Acre", "AC"));
		ESTADOS.add(new Estado("Alagoas", "AL"));
		ESTADOS.add(new Estado("Amazonas", "AM"));
		ESTADOS.add(new Estado("Manaus", "AP"));
		ESTADOS.add(new Estado("Bahia", "BA"));
		ESTADOS.add(new Estado("Cear�", "CE"));
		ESTADOS.add(new Estado("Distrito Federal", "DF"));
		ESTADOS.add(new Estado("Maranh�o", "MA"));
		ESTADOS.add(new Estado("Santa Catarina", "SC"));
		ESTADOS.add(new Estado("Rio de Janeiro", "RJ"));
		ESTADOS.add(new Estado("Rio Grande do Norte", "RN"));
		ESTADOS.add(new Estado("Rio Grande do Sul", "RS"));
		ESTADOS.add(new Estado("Rondonia", "RO"));
		ESTADOS.add(new Estado("S�o Paulo", "SP"));
		
		INTERESSES = new ArrayList<>();
		INTERESSES.add(new Interesse(1, "Esporte"));
		INTERESSES.add(new Interesse(2, "M�sica"));
		INTERESSES.add(new Interesse(3, "Artes Marciais"));
		INTERESSES.add(new Interesse(4, "Viagens"));
		INTERESSES.add(new Interesse(5, "Cinema"));
		INTERESSES.add(new Interesse(6, "Dan�a"));
		
	}

}
