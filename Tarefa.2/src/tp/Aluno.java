package tp;

public class Aluno {
	private String nome;
	private int id;
	private double media;
	
	protected double nota1 = 0;
	protected double nota2 = 0;
	
		
	//get
	public String imprimeNome() {
		return this.nome;
	}
	
	//set
	public void alterarNome(String nome) {
		this.nome = nome;
	}
	
	//get
	public int imprimeId() {
		return this.id;
	}
	
	//set
	public void alteraId(int id) {
		this.id = id;
	}

	
	public double retornaMedia() {
		this.calcularMedia();
		return this.media;
	}
	
	private void calcularMedia() {
		 this.media = (this.nota1 + this.nota2) / 2;
	}
	
	public boolean passou() {
		if(this.media > 7.0) {			
			return true;
		}else {
			return false;
		}
	}


}
