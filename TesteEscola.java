package aula2;

public class TesteEscola {
	public static void main(String[] args) { //a função main executa o programa
		//criação dos cursos
		Curso curso1 = new Curso(1, "Ciencia da computação", 8); //declarei uma var chamda curso1 e crieu um curso com estes dados em parenteses
		Curso curso2 = new Curso(2, "Sistemas de informação", 8);
		Curso curso3 = new Curso(3, "Redes de computadores", 5);
		Curso curso4 = new Curso(4, "ADS", 5);
		Curso curso5 = new Curso(5, "Gestão de TI", 5);
		//para criar objetos usa-se o operador "new"
		
		Curso[]tabCurso = new Curso[5]; 
		//array com 5 posições (tamanho 5).
		
		tabCurso[0] = curso1;
		tabCurso[1] = curso2;
		tabCurso[2] = curso3;
		tabCurso[3] = curso4;
		tabCurso[4] = curso5;
		
		professor prof1 = new professor(10, "Paulo", "pg@uol.com.br", "4330-4578");
		professor prof2 = new professor(15, "Alfredo", "am@uol.com.br", "5578-9812");
		professor prof3 = new professor(20, "Marcos", "ms@uol.com.br", "4125-9976");
		professor prof4 = new professor(25, "Ana", "an@uol.com.br", "5678-1145");
		
		professor[]tabProfessor = new professor[4];
		
		tabProfessor[0] = prof1;
		tabProfessor[1] = prof2;
		tabProfessor[2] = prof3;
		tabProfessor[3] = prof4;
		
		disciplina disc1 = new disciplina(100, "Estatística"); 
		disciplina disc2 = new disciplina(110, "Algoritmos");
		disciplina disc3 = new disciplina(120, "Redes");
		disciplina disc4 = new disciplina(130, "Algebra");
		//1- criei a disciplinas
		//disc1 é uma variavel
		
		disciplina[] tabDisciplina = new disciplina[4]; //array da disciplina
		
		tabDisciplina[0] = disc1;
		tabDisciplina[1] = disc2;
		tabDisciplina[2] = disc3;
		tabDisciplina[3] = disc4;
		//2- e coloquei as diciplinas dentro do array
		//até agora eu criei objetos e guardei os objetos em um array (cursos, professores, disciplinas)
		
		System.out.println("-------------------------");
		System.out.println("Exibindo os dados dos cursos: ");
		//código para imprimir os dados dos cursos, usando um comando de repetição(for):
		for (int i=0; i < tabCurso.length; i++) { 
			tabCurso[i].imprimeCurso();
			//tabcurso = variavel que aponta pro array
		}
		
		System.out.println("----------------------");
		//codigo para exibir dados dos professores
		System.out.println("Exibindo dados dos professores: ");
		for (int i=0; i < tabProfessor.length; i++) {
			tabProfessor[i].imprimeProfessor();
			System.out.println("******************");
		}
		System.out.println("----------------------");
		
		System.out.println("Exibindo dados das discipinas: ");
		for (int i=0; i < tabDisciplina.length; i++) {
			tabDisciplina[i].imprimeDisciplina();
		}
			
		
		
	} 
}
