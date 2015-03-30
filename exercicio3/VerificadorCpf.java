import java.util.Scanner;

public class VerificadorCpf{
	String cpf;
	int [] intcpf = new int[11];

	public void LerCpf(){
		Scanner input = new Scanner( System.in );
		System.out.println("Informe os 9 primeiros números de seu CPF: ");
		String cpf=input.next();
		int a [] = new int[12];
		for(int i=0; i<9; i++){
			char caracter = cpf.charAt(i);
			intcpf[i] = Character.getNumericValue(caracter);
		}
	}

	public void CalcularX(){
		int soma=0;
		int j=8;
		for(int i=2; i<11; i++){
			soma = intcpf[j]*i + soma;
			j=j-1;
		}
		int resto=soma%11;
		if (resto<2){
			intcpf[9] = resto;
		}else{
			intcpf[9] = 11 - resto;
		}
	}

	public void CalcularY(){
		int soma=0;
		int j=9;
		for(int i=2; i<12; i++){
			soma = intcpf[j]*i + soma;
			j=j-1;
		}
		int resto=soma%11;
		if (resto<2){
			intcpf[10] = resto;
		}else{
			intcpf[10] = 11 - resto;
		}
	}

	public void ImprimirCpf(){
		System.out.println ("O CPF completo é: ");
		for(int i=0; i<11; i++){
			System.out.print (intcpf[i]);
		}
		System.out.println ();
	}
	
	public static void main (String [] args){
		VerificadorCpf g1 = new VerificadorCpf();
		g1.LerCpf();
		g1.CalcularX();
		g1.CalcularY();
		g1.ImprimirCpf();
	}
}
