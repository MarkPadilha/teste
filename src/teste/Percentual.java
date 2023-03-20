package teste;


import java.util.Locale;
import java.util.Scanner;

public class Percentual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double soma = 0;
		double [] vec = new double[5];
		for(int x = 0; x < 5; x++) {
			System.out.println("informe: ");
			vec[x] = sc.nextDouble();
			soma += vec[x];
		}
		System.out.println("vec[?]" );
		int lol = sc.nextInt();
		 double por = (vec[lol]*100)/soma;
		 System.out.println(por + "%");
		 
		 sc.close();
	}
	

}
