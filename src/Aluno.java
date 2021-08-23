
public class Aluno {
	String id;
	String nome;
	float notaProva;
	float notaTrabalho;
	float notaExercicios;
	int faltas;
	
	Aluno(String id, String nome){
		this.id = id;
		this.nome = nome;
	}
	
	void ContabilizarFaltas(){
		System.out.println("Total de faltas: " + this.faltas);
	}
	
	void SetarNotaProva(float notaProva) {
		this.notaProva = notaProva;
	}
	
	void SetarNotaTrabalho(float notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}
	
	void SetarNotaExercicios(float notaExercicios) {
		this.notaExercicios = notaExercicios;
	}
	
	float CalcularMedia() {
		float notaFinal = (this.notaProva+this.notaTrabalho+this.notaExercicios)/3;
		return notaFinal;
	}
	
	void MostrarSituacaoAluno() {
		float notaFinal = CalcularMedia();
		if (notaFinal >= 6) {
			System.out.println("Aluno Aprovado!");
		} else if (notaFinal >= 4) {
			System.out.println("Aluno em IFA!");
		} else {
			System.out.println("Aluno Reprovado!");
		}
	}
}
