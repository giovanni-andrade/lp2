public class Aluno{
	String nome;
	String matricula;
	int idade;

	public void ImprimirDadosCadastrais(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Idade: " + this.idade);
	}
	public static void main (String [] args){
		Aluno g1 = new Aluno();
		g1.nome="Giovanni";
		g1.matricula="201318110122";
		g1.idade=16;
		g1.ImprimirDadosCadastrais();

		Aluno g2 = new Aluno();
		g2.nome="Mateus";
		g2.matricula="201318110146";
		g2.idade=17;
		g2.ImprimirDadosCadastrais();

		Aluno g3 = new Aluno();
		g3.nome="Thaminy";
		g3.matricula="201318110240";
		g3.idade=16;
		g3.ImprimirDadosCadastrais();
	}
}
