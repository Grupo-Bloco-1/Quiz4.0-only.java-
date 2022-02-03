package ProjQuiz;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalMain {
		
		public static void main(String [] args) {
			
		int cont=0;
		Scanner ler = new Scanner(System.in);
		
			System.out.println("SEJA BEM-VINDE AO DESAFIANDERSON\n");
			Pergunta pergunta1 = new Pergunta1(
					"1. Apenas uma pessoa na história recebeu o Prêmio Nobel "
					+ "em áreas científicas diferentes. Quem foi essa pessoa?",
					"A) Albert Einstein", 
					"B) Marie Cure",
					"C) Mahatma Gandhi", 
					'B');
			
			Pergunta pergunta2 = new Pergunta1(
					"2. Quem canta a versão da música “Vamos pular”"
					+ "como “Vamo côda, vamo côda  vamo côda  vamo cô-da!”",
					"A) Apenas o Junior", 
					"B) Anitta",
					"C) Anderson Uzumaki",
					'C');
			
			Pergunta pergunta3 = new Pergunta2(
					"3. Qual a tradução da frase “Fabiano cogió su saco antes de salir”?",
					"A) Fabiano coseu seu paletó antes de sair", 
					"B) Fabiano fechou o saco antes de sair",
					"C) Fabiano pegou seu paletó antes de sair",
					"D) Fabiano cortou o saco antes de cair",
					'C');
			
			Pergunta pergunta4 = new Pergunta2(
					"4. O que acontece se você não entregar o projeto do Bloco 1?",
					"A) Seu nome vai para a lista do Sabato", 
					"B) Leva esporro da Fernanda Miss Bloquinho",
					"C) Envergonha sua família",
					"D) Todas as anteriores",
					'D');
			
			Pergunta pergunta5 = new Pergunta1(
					"5. Como é a conjugação do verbo caber na 1.ª pessoa "
					+ "do singular do presente do indicativo?",
					"A) Eu caibo", 
					"B) Que eu caiba",
					"C) Eu cabo",
					'A');
			
			ArrayList<Pergunta> perguntas = new ArrayList<>();
			
			perguntas.add(pergunta1);
			perguntas.add(pergunta2);
			perguntas.add(pergunta3);
			perguntas.add(pergunta4);
			perguntas.add(pergunta5);
			
			char teste;
			
			for(Pergunta x: perguntas) {
				x.listarAlternativas();
				teste=ler.next().charAt(0);
				cont=cont+x.verificarResp(teste);
				
			}
			System.out.println("Pontuacão total: "+cont);	
			System.out.println("PARABÉNS! Você chegou ao Bloco 2.\n" + "VAMO CÔDÁÁÁ");
			ler.close();
		}
		
}
