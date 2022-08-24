package aula2;

public class professor {
	public int codProfessor;
	public String nomeProf;
	public String emailProf;
	public String foneProf;
	
	public professor(int codProfessor, String nomeProf, String emailProf, String foneProf) {
		
		this.codProfessor = codProfessor;
		this.nomeProf = nomeProf;
		this.emailProf = emailProf;
		this.foneProf = foneProf;
	}
	
	public professor() {
		
	}
	
	public void imprimeProfessor() {
		System.out.println("Código do professor: " + this.codProfessor );
		System.out.println("Nome do professor: " + this.nomeProf);
		System.out.println("Email do professor: " + this.emailProf);
		System.out.println("Fone do professor: " + this.foneProf);
	}
	
}
