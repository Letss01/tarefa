/***Let�cia Moreira***/

package tp;

public class Main {
	
      public static void main(String[] args) {
			
			Aluno aluno = new Aluno();
			
			aluno.alterarNome("leticia");
			aluno.alteraId(5);
			aluno.nota1 = 3.5;
			aluno.nota2 = 6.5;
			
			System.out.println( " a media �: " + aluno.retornaMedia());
			//System.out.println( " passou " + aluno.passou());
			
			
			if(aluno.passou()) {
				System.out.println( " passou ");
			}
			else {
				System.out.println( "n�o passou ");
			}
		
			
		}
	}







