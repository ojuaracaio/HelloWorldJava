
public class main {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("sc00001","Caio");
		aluno1.faltas = 2;
		aluno1.SetarNotaProva(8);
		aluno1.SetarNotaTrabalho(5);
		aluno1.SetarNotaExercicios(6);
		aluno1.ContabilizarFaltas();
		aluno1.MostrarSituacaoAluno();
	}

}
