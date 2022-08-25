package aula2;

public class Curso {
	public int codCurso;
	public String descCurso;
	public int duracaoSemestre; 
	
	//construtor com passagem de dados
	public Curso(int codCurso, String descCurso, int duracaoSemestre) {
		
		this.codCurso = codCurso;
		this.descCurso = descCurso;
		this.duracaoSemestre = duracaoSemestre; 
	}
	//construtor default 
	public Curso() {
		
	}
	
	public void imprimeCurso() { 
		System.out.println("Códico do curso: " + this.codCurso);
		System.out.println("Descrição do curso: " + this.descCurso);
		System.out.println("Duração do curso: " + this.duracaoSemestre);
	}
	
	
	
	
}


