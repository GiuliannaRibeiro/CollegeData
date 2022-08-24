package aula2;

public class Curso {
	public int codCurso;
	public String descCurso;
	public int duracaoSemestre; //"public" � porque estes dados ser�o publicos. Mas n�o � uma boa pratica expor os dados
	
	//construtor com passagem de dados
	public Curso(int codCurso, String descCurso, int duracaoSemestre) {
		
		this.codCurso = codCurso;
		this.descCurso = descCurso;
		this.duracaoSemestre = duracaoSemestre; //"this" � uma referencia a um objeto.
	}
	//construtor default (sem passagem de dados)
	public Curso() {
		
	}
	
	public void imprimeCurso() { //"void" a fun��o n�o coloca valor = n�o tem return.
		System.out.println("C�dico do curso: " + this.codCurso);
		System.out.println("Descri��o do curso: " + this.descCurso);
		System.out.println("Dura��o do curso: " + this.duracaoSemestre);
	}
	
	
	
	
}


