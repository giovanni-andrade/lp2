public class Exponencial{
	public static void main (String [] args){
		System.out.println("#        Q       C");
		for (int i=0; i<=10; i++){
			int x=i*i;
			int y=i*i*i;
			System.out.printf("%d\t %d\t %d\n", i, x, y);
		}
	}
}
