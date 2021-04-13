package br.edu.univas.main;


import java.util.Random;
import java.util.Scanner;

import br.edu.univas.vo.Carro;
import br.edu.univas.vo.Competidor;
import br.edu.univas.vo.Moto;
import br.edu.univas.vo.Veiculo;

public class StartApp {

	public static void main(String[] args) {
		
		Competidor competidor1 = new Competidor();		
		Competidor competidor2 = new Competidor();
		Competidor competidor3 = new Competidor();
		Competidor competidor4 = new Competidor();
		Competidor competidor5 = new Competidor();	
				
		Competidor[] competidores = {competidor1, competidor2, competidor3, competidor4, competidor5};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i < 5; i++) {
			System.out.println("Escolha um tipo de estacionamento");
			System.out.println("1 - Carro");
			System.out.println("2 - Moto");
			
			int veiculoNumber = scanner.nextInt();
			
			System.out.println("Insira seu apelido");
			String nome = scanner.nextLine();
			
			Veiculo veiculoEscolhido = null;
			
			if(veiculoNumber == 1) {
				veiculoEscolhido = new Carro();
			}else if(veiculoNumber == 2) {
				veiculoEscolhido = new Moto();
			}
			
			competidores[i].setApelido(nome);
			competidores[i].setVeiculo(veiculoEscolhido);
		}
		
		scanner.close();
		
		
		for(int i=0; i < 10; i++) {
			Random random = new Random();
			int numero = random.nextInt(21) + 5;
			
			competidores[i].getVeiculo().acelerar(numero);
		}
		
		Competidor competidorWin = competidores[0];
		int velocidadeWin = competidores[0].getVeiculo().getVelocidadeAtual();
		
		for(int i=0; i < 10; i++) {
			if(velocidadeWin < competidores[i].getVeiculo().getVelocidadeAtual()) {
				competidorWin = competidores[i];
				velocidadeWin = competidores[i].getVeiculo().getVelocidadeAtual();				
			}
		}
		
		System.out.println("O vencedor foi " + competidorWin.getApelido());		
	}
}
