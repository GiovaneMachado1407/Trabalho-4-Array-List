package com.giovanemachado.agenda.model;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	// Atributos
	private List<Contato> lista;
	
	//Cria uma IST�NCIA �NICA da lista (Padr�o de projetos: Singleton)
	public static List<Contato> getInstance(){
		// Se ainda N�O existir a inst�ncia, cria uma
		if (lista == null) {
			lista = new ArrayList();
		}
		
		// Se J� existir, retorna a inst�ncia
		return lista; 
	}
}
