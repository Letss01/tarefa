package tp;

public class Disciplina {
	
	private double mediaN;
	Aluno[] alunos = new Aluno[10];
	
	public void addAlu(int novPos, String novNome, 
			int novId, double novN1, double novN2) {
		
		alunos[novPos].nota1 = novN1;
		alunos[novPos].nota2 = novN2;
		
		alunos[novPos].alterarNome(novNome);
		alunos[novPos].alteraId(novId);
	}
	
	public double mediaN1() {
		mediaN = 0;
		for(int i = 0; i < alunos.length; i++) {
			mediaN += alunos[i].nota1;
		} return mediaN /10;
		}
	public double mediaN2() {
		mediaN = 0;
		for(int i = 0; i < alunos.length; i++) {
			mediaN += alunos[i].nota2;
		} return mediaN /10;
		}
	public void antEsuc (int novPos) {
		if (novPos == 1) {
			System.out.println(alunos[novPos].imprimeNome());
		
		}
		else if(novPos == 10) {
			System.out.println(alunos[novPos -2].imprimeNome());
		}
		else {
			System.out.println(alunos[novPos -2].imprimeNome());
			
			System.out.println(alunos[novPos].imprimeNome());
		}
	
	
	}
	


}
