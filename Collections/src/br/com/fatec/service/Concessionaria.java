 package br.com.fatec.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import br.com.fatec.model.Carro;

public class Concessionaria {

	private ArrayList<Carro> carros;
	private Map<String, Double> tabela_placaCar_preco;
	private Map<String, Carro> tabela_placaCar_carro;
	
	public Concessionaria() {
		carros = new ArrayList<Carro>();
		tabela_placaCar_preco = new HashMap<String, Double>();
		tabela_placaCar_carro = new HashMap<String, Carro>();
	}
	
	public void adicionarCarro(Carro carro) {
		carros.add(carro);
		tabela_placaCar_preco.put(carro.getPlaca(), carro.getPreco());
		tabela_placaCar_carro.put(carro.getPlaca(), carro);
	}
	
	public void listarCarros() {
		System.out.println("\nConcessionaria.listarCarros()");
		carros.forEach(carro -> {
			System.out.println(carro);
		});
	}
	
	public void imprimirTabelapreco() {
		System.out.println("\nConcessionaria.imprimirTabelapreco()");
		tabela_placaCar_preco.forEach((placa, valor) -> {
			System.out.printf("Placa: %s | Preço: %.2f\n", placa, valor);
		});
	}
	
	public void listarDadosCarro(String placa) {
		System.out.printf("\nConcessionaria.listarDadosCarro(%s)\n", placa);
		
		Carro carro = tabela_placaCar_carro.get(placa);
		System.out.println(carro != null ? carro : "Nenhum veículo encontrado com a placa informada!");
	}
}
