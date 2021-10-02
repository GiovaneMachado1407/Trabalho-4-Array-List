package com.giovanemachado.agenda.model;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	// Atributos
	private List<Contato> lista;
	
	//Cria uma ISTÂNCIA ÚNICA da lista (Padrão de projetos: Singleton)
	public static List<Contato> getInstance(){
		// Se ainda NÃO existir a instância, cria uma
		if (lista == null) {
			lista = new ArrayList();
		}
		
		// Se JÁ existir, retorna a instância
		return lista; 
	}
}
