package com.giovanemachado.agenda.model;

import java.util.ArrayList;
import java.util.List;

import com.giovanemachado.agenda.view.Tela;

public class Agenda {
	//Atributos
	List<Contato> lista = new ArrayList();
	//Métodos
	public void iniciarAgenda() {
		//Cria o objeto da classe Tela
		Tela tela = new Tela();
		
		// Monta o Menu
		String menu = "Agenda de Contatos ::\n\n" +
		"1. Cadastrar\n" +
		"2. Buscar\n" +
		"3. Editar\n" +
		"4. Excluir\n\n";
		
		//Mantém o Menu ativo
		boolean isAtivo = true;
		
		//Loop principal do Sistema
		while (isAtivo) {
			String opcao = tela.informar(menu, "Informe uma opçao do Menu", -1);
			
			switch(opcao) {
			case "1":
				//cadastrar
				break;
			case "2":
				//buscar
				break;
			case "3":
				//editar
				break;
			case "4":
				//excluir
				break;
				
			default:
				int sair = tela.confirmar("Deseja sair?", "Encerrar", 2);
				
				if (sair == 0) {
					isAtivo = false;
					tela.mostrar("Encerrando o sistema...", "Encerrando", 1);
				}
			}
		}
		
		// CRUD
        // Create    - Inserir registro no DB    (INSERT)
        // Read        - Buscar registro(s) no DB    (SELECT)
        // Update    - Atualizar/Editar registro    (UPDATE)
        // Delete    - Excluir registro do DB    (DELETE)
		
	}//fecha o método iniciarAgenda
	
	private void cadastrarContato(Tela tela) {
		//Usuário informa os dados
		String nome = tela.informar("Informe o Nome", "Nome", 1);
		String email = tela.informar("Informe o E-mail", "E-mail", 1);
		String fone = tela.informar("Informe o telefone", "Telefone", 1);
		
		// Cria o objeto da classe Contato
		Contato contato = new Contato(nome, email, fone);
		
		//Adiciona o Contato (preenchido) na Lista de contatos da Agenda
		Lista.getInstance().add(contato);
	}// fecha o método cadastrarContato()
	
	private void buscarContato(Tela tela) {
		// Guarda o número de registros na Lista
		int numeroRegistros = Lista.getInstance().size();
		
		if (numeroRegistros > 0) {
				String listaContatos = "";
				
				for (int i = 0; i < numeroRegistros; i++) {
					listaContatos += 
							"ID: " + (i + 1) +
							"\nNome: " + Lista.getInstance().get(i).getNome() +	
							"\nE-mail: " +	Lista.getInstance().get(i).getEmail()	+	
							"\nFone: " + Lista.getInstance().get(i).getFone() +
							"\n\n"
							;
				}
			// Mostra o resultado da busca
				tela.mostrar(listaContatos, "Contatos", 1);
		} else {
			tela.mostrar("Nenum contato registrado", "Contatos", 1);
		}
	}// fecha o método buscarContato()
	
	private void editarContato(Tela tela) {
		int numeroRegistros = Lista.getInstance().size();
		
		if (numeroRegistros > 0) {
			String id = "Novo id";
			Lista.getInstance().get(0).setNome(id);
			Lista.getInstance().get(0).setFone(id);
			Lista.getInstance().get(0).setEmail(id);
			
		}
		
	}
	
	private void excluirContato(Tela tela) {
			int numeroRegistros = Lista.getInstance().size();
			
			if (numeroRegistros > 0) {
				String id = "Excluir id";
				Lista.getInstance().remove(id);
				
			}
	}
}
