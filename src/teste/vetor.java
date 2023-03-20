package teste;

import java.util.Locale;
import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double fat = 0;
		double [] mes = new double[30];
		double maiFat = 0;
		double menFat = 0;
		
		
		for(int x = 0; x < 30; x++) {
			System.out.println("Informe o faturamento do " + (x+1) +"º dia: ");
			fat = sc.nextDouble();
			mes[x] = fat;
		}
		for(int x = 0; x < 30; x++) {
			if(maiFat < mes[x]) {
				maiFat = mes[x];
			}
			
		}
		System.out.println(maiFat);
		menFat = mes[0];
		for(int x = 0; x < 30; x++) {
			if(menFat > mes[x]) {
				menFat = mes[x];
			}
			
		}
		double soma =  0;
		System.out.println(menFat);
		for(int x = 0; x < 30; x++) {
			soma+=mes[x];
		
		}
		double media = 0;
		media = soma/30;
		System.out.println(media);
		
		sc.close();
		
	}

}
