package aula2;

public class Curso {
	public int codCurso;
	public String descCurso;
	public int duracaoSemestre; //"public" é porque estes dados serão publicos. Mas não é uma boa pratica expor os dados
	
	//construtor com passagem de dados
	public Curso(int codCurso, String descCurso, int duracaoSemestre) {
		
		this.codCurso = codCurso;
		this.descCurso = descCurso;
		this.duracaoSemestre = duracaoSemestre; //"this" é uma referencia a um objeto.
	}
	//construtor default (sem passagem de dados)
	public Curso() {
		
	}
	
	public void imprimeCurso() { //"void" a função não coloca valor = não tem return.
		System.out.println("Códico do curso: " + this.codCurso);
		System.out.println("Descrição do curso: " + this.descCurso);
		System.out.println("Duração do curso: " + this.duracaoSemestre);
	}
	
	
	
	
}


