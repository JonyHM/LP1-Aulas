package br.com.fatec;

import java.util.UUID;

import br.com.fatec.enums.Cor;
import br.com.fatec.enums.TipoConta;
import br.com.fatec.model.Carro;
import br.com.fatec.model.Conta;
import br.com.fatec.model.Lugar;
import br.com.fatec.model.Pessoa;
import br.com.fatec.service.AgenciaBancaria;
import br.com.fatec.service.AgenciaViagens;
import br.com.fatec.service.Concessionaria;

public class Home {

	public static void main(String[] args) {
		
		System.out.println("\nExercício 1");
		Carro carro1 = new Carro("123sdf", "Corsa Classic", Cor.CINZA, Double.valueOf(522000));
		Carro carro2 = new Carro("341fsm", "Gol", Cor.BRANCO, Double.valueOf(22000));
		
		Concessionaria concess = new Concessionaria();
		concess.adicionarCarro(carro1);
		concess.adicionarCarro(carro2);
		
		concess.listarCarros();
		concess.imprimirTabelapreco();
		concess.listarDadosCarro("341fsm");
		concess.listarDadosCarro("adsasdas");
		
		System.out.println("\nExercício 2");
		AgenciaBancaria agencia = new AgenciaBancaria();
		
		Pessoa pessoa = new Pessoa("336.214.957-01", "José", 32);
		Pessoa pessoa2 = new Pessoa("433.196.744-27", "Maria", 23);
		Conta conta = new Conta(UUID.randomUUID().toString(), pessoa, TipoConta.GOLD, Double.valueOf(5370d));
		Conta conta2 = new Conta(UUID.randomUUID().toString(), pessoa2, TipoConta.ESTUDANTE, Double.valueOf(514d));
		
		agencia.adicionarConta(conta);
		agencia.adicionarConta(conta2);
		agencia.listarDadosPessoa("336.214.957-01");
		agencia.listarDadosPessoa("336.214.957-44");
		agencia.listarDadosPessoa("433.196.744-27");
		agencia.removerConta("336.214.957-44");
		agencia.removerConta("433.196.744-27");
		agencia.listarDadosPessoa("433.196.744-27");
		
		System.out.println("\nExercício 3");
		Lugar lugar = new Lugar("Banff National Park", "Hawk Ave", "Alberta", "Canadá");
		Lugar lugar2 = new Lugar("Tulum", "Carretera Federal", "Cancun", "México");
		
		AgenciaViagens viagens = new AgenciaViagens();
		
		viagens.adicionarViagem(pessoa, lugar2);
		viagens.adicionarViagem(pessoa2, lugar);
		viagens.listarDadosDestino("433.196.744-27");
		viagens.listarDadosDestino("433.ads96.74sd-777");
		viagens.listarDadosPessoa("336.214.957-0adsasd");
		viagens.listarDadosPessoa("336.214.957-01");
	}

}
