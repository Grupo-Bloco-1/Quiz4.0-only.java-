package ProjQuiz;

public class Pergunta2 extends Pergunta{
	
	protected String alt4;
	
	public Pergunta2(String pergunta, String alt1, String alt2, String alt3, String alt4,
			 char altCorreta) {
		super(pergunta, alt1, alt2, alt3, altCorreta);
		this.alt4 = alt4;
	}


	
	@Override
	public void listarAlternativas() {
		System.out.println(this.pergunta);
		System.out.println(this.alt1);
		System.out.println(this.alt2);
		System.out.println(this.alt3);
		System.out.println(this.alt4); //override aqui
		System.out.println("Insira a alternativa correta");
	}

}
