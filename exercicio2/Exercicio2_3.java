public class ContaBancaria2{
	int agencia, contaCorrente;
 	double saldo, limiteExtra;
	
	public void imprimirSaldo(){
		System.out.println("Saldo: " + this.saldo);
	}

	public void imprimirSaldo(){
		double soma= this.saldo + this.limiteExtra;
		System.out.println(" Saldo  com limite extra" + soma);
	}

	public void imprimirAgencia(){
		System.out.println("Agência: "+this.agencia );
	}

	public void imprimirContaCorrente(){
		System.out.println("Conta corrente: "+this.contaCorrente);
	}

	public void imprimirTitular(){

	}
	
	public static void main (String [] args){
	
		ContaBancaria cb1 = new ContaBancaria();
		cb1.agencia=361.0;
		cb1.contaCorrente=15766;
		cb1.saldo=35.54;
		cb1.limiteExtra=50;

		cb1.imprimirSaldo();
		cb1.imprimirSaldoTotal();
		cb1.imprimirAgencia();
}
}
