package br.com.fatec.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import br.com.fatec.model.Conta;

public class AgenciaBancaria {

	private ArrayList<Conta> contas;
	private Set<String> CPFClientes;
	private Map<String, Conta> CPF_conta;
	
	public AgenciaBancaria() {
		contas = new ArrayList<Conta>();
		CPFClientes = new HashSet<String>();
		CPF_conta = new HashMap<String, Conta>();
	}
	
	public void adicionarConta(Conta conta) {
		System.out.println("\nAgenciaBancaria.adicionarConta(" + conta + ")\n");
		contas.add(conta);
		CPF_conta.put(conta.getTitular().getCPF(), conta);
		CPFClientes.add(conta.getTitular().getCPF());
		System.out.println("Conta adicionada com sucesso!");
	}
	
	public void removerConta(String cpf) {
		System.out.printf("\nAgenciaBancaria.removerConta(%s)\n", cpf);
		Conta conta = CPF_conta.get(cpf);
		
		if (conta != null) {
			CPF_conta.remove(cpf);
			contas.remove(conta);
			CPFClientes.remove(cpf);			
			System.out.println("Conta removida com sucesso!");
		} else {
			System.out.println("Nenhuma conta encontrada com este titular: " + cpf);
		}
	}
	
	public void listarDadosPessoa(String cpf) {
		System.out.printf("\nAgenciaBancaria.listarDadosPessoa(%s)\n", cpf);
		Conta conta = CPF_conta.get(cpf);
		
		if (conta != null) {
			System.out.println(conta.getTitular());
		} else {
			System.out.println("Nenhum dado encontrado com o CPF: " + cpf);
		}
	}
}
