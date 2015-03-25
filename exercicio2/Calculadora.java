public class Calculadora{
	int x, y;

	public void soma(){
		System.out.println("A soma dos dois números é: " + (x+y));
	}

	public void subtracao(){
		System.out.println("A subtração dos dois números é: " + (x-y));
	}

	public void multiplicacao(){
		System.out.println("A multiplicação dos dois números é: " + (x*y));
	}

	public void divisao(){
		System.out.println("A divisão dos dois números é: " + (x/y));
	}

	public static void main (String [] args){
		Calculadora g1 = new Calculadora();
		g1.x=20;
		g1.y=10;
		g1.soma();		
		g1.subtracao();
		g1.multiplicacao();
		g1.divisao();

		Calculadora g2 = new Calculadora();
		g2.x=15;
		g2.y=5;
		g2.soma();		
		g2.subtracao();
		g2.multiplicacao();
		g2.divisao();

		Calculadora g3 = new Calculadora();
		g3.x=4;
		g3.y=2;
		g3.soma();		
		g3.subtracao();
		g3.multiplicacao();
		g3.divisao();	
	}
}
