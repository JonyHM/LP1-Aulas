package test;

import java.util.ArrayList;
import java.util.List;

import helpers.GENERO;
import main.AlunoFatecSJC;
import main.Calcado;
import main.InstrumentoMusical;
import main.Lugar;
import main.Pessoa;
import main.Profissional;

public class Teste {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("José", 27, 79, GENERO.MASCULINO));
		pessoas.add(new Pessoa("Fernanda", 7, 29, GENERO.FEMININO));
		pessoas.add(new Pessoa("Marcelo", 17, 69, GENERO.MASCULINO));
		pessoas.add(new Pessoa("Felipe", 24, 139, GENERO.MASCULINO));
		pessoas.add(new Pessoa("Mariana", 34, 51, GENERO.FEMININO));
		
		List<AlunoFatecSJC> alunos = new ArrayList<AlunoFatecSJC>();
		alunos.add(new AlunoFatecSJC("Edgar", -1, 33, GENERO.MASCULINO));
		alunos.add(new AlunoFatecSJC("Alan", 3, 21, GENERO.MASCULINO));
		alunos.add(new AlunoFatecSJC("Adriana", 1, 31, GENERO.FEMININO));
		alunos.add(new AlunoFatecSJC("Eduarda", 5, 27, GENERO.FEMININO));
		alunos.add(new AlunoFatecSJC("Fernando", 6, 22, GENERO.MASCULINO));
		
		List<Lugar> lugares = new ArrayList<Lugar>();
		lugares.add(new Lugar("Praça central", "Centro", "Taubaté", "Brasil"));
		lugares.add(new Lugar("Cristo Redentor", "Alto da Boa Vista", "Rio de Janeiro", "Brasil"));
		lugares.add(new Lugar("Banff National Park", "Hawk Ave", "Alberta", "Canadá"));
		lugares.add(new Lugar("Alhambra", "Calle Real de la Alhambra", "Granada", "Espanha"));
		lugares.add(new Lugar("Tulum", "Carretera Federal", "Cancun", "México"));
		
		List<Calcado> calcados = new ArrayList<Calcado>();
		calcados.add(new Calcado("Tênis", "Nike", 42));
		calcados.add(new Calcado("Sapatilha", "Valentino", 32));
		calcados.add(new Calcado("Sandália", "Versace", 35));
		calcados.add(new Calcado("chinelo", "Havaianas", 44));
		calcados.add(new Calcado("Tamanco", "Moleca", 38));
		
		List<InstrumentoMusical> instrumentos = new ArrayList<InstrumentoMusical>();
		instrumentos.add(new InstrumentoMusical("Guitarra", Double.valueOf(1200)));
		instrumentos.add(new InstrumentoMusical("Bateria", Double.valueOf(125000)));
		instrumentos.add(new InstrumentoMusical("Guitarra Fender Broadcaster", Double.valueOf(375000)));
		instrumentos.add(new InstrumentoMusical("Violão", Double.valueOf(510)));
		instrumentos.add(new InstrumentoMusical("Piano", Double.valueOf(4500)));
		
		List<Profissional> profissionais = new ArrayList<Profissional>();
		profissionais.add(new Profissional("Médico", Double.valueOf(50000), 43));
		profissionais.add(new Profissional("Desenvolvedor", Double.valueOf(5000), 23));
		profissionais.add(new Profissional("Empresário", Double.valueOf(20000), 33));
		profissionais.add(new Profissional("Músico", Double.valueOf(320000), 27));
		profissionais.add(new Profissional("Mecânico", Double.valueOf(3000), 36));
		
		System.out.println("\n");
		pessoas.forEach(pessoa -> {
			System.out.println(pessoa);
			pessoa.emagrecer(12l);
		});
		
		System.out.println("\n");
		alunos.forEach(aluno -> {
			System.out.println(aluno);
			aluno.dormir();
			aluno.estudar();
		});
		
		System.out.println("\n");
		lugares.forEach(lugar -> {
			lugar.receberVisita(pessoas);
			System.out.println(lugar);
		});
		
		System.out.println("\n");
		calcados.forEach(calcado -> {
			calcado.serVestido(pessoas.get(calcados.indexOf(calcado)));
			System.out.println(calcado);
		});
		
		System.out.println("\n");
		instrumentos.forEach(instrumento -> {
			instrumento.avaliarPreco();
			System.out.println(instrumento);
		});
		
		System.out.println("\n");
		profissionais.forEach(profissional -> {
			profissional.perguntarSalario();
			System.out.println(profissional);
		});
	}
	

}
