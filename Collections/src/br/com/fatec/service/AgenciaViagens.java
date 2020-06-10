package br.com.fatec.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.fatec.model.Lugar;
import br.com.fatec.model.Pessoa;

public class AgenciaViagens {

	private List<Lugar> destinos;
	private Set<String> CPFClientes;
	private Map<String, Pessoa> clientes;
	private Map<String, Lugar> lugares;
	
	public AgenciaViagens() {
		destinos = new ArrayList<Lugar>();
		CPFClientes = new HashSet<String>();
		clientes = new HashMap<String, Pessoa>();
		lugares = new HashMap<String, Lugar>();
	}
	
	public void adicionarViagem(Pessoa cliente, Lugar destino) {
		System.out.println("\nAgenciaViagens.adicionarViagem(" + cliente + ", \n" + destino + ")\n");
		destinos.add(destino);
		CPFClientes.add(cliente.getCPF());
		clientes.put(cliente.getCPF(), cliente);
		lugares.put(cliente.getCPF(), destino);
	}
	
	public void listarDadosDestino(String cpf) {
		System.out.printf("\nAgenciaViagens.listarDadosDestino(%s)\n", cpf);
		Lugar destino = lugares.get(cpf);
		
		if (destino != null) {
			System.out.println(destino);
		} else {
			System.out.println("Nenhum destino encontrado para o CPF: " + cpf);
		}
	}
	
	public void listarDadosPessoa(String cpf) {
		System.out.printf("\nAgenciaViagens.listarDadosPessoa(%s)\n", cpf);
		Pessoa cliente = clientes.get(cpf);
		
		if (cliente != null) {
			System.out.println(cliente);
		} else {
			System.out.println("Nenhum cliente encontrado com o CPF: " + cpf);
		}
	}
}
