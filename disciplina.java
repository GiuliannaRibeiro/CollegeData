package aula2;

public class disciplina {
	public int codDisciplina;
	public String descDisciplina;
	
	//contrutor com passagem de argumentos.
	public disciplina(int codDisciplina, String descDisciplina) {
		
		this.codDisciplina = codDisciplina;
		this.descDisciplina = descDisciplina;
	}
	 //construtor default.
	public disciplina() {
	
	}
	
	public void imprimeDisciplina() {
		System.out.println("Código da disciplina: " + this.codDisciplina);
		System.out.println("Descrição da disciplina: " + this.descDisciplina);
	
	}
	
}