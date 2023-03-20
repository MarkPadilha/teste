package teste;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print("Informe um número: ");
		int u = sc.nextInt();
		System.out.println(a);
		for(int x = 0; x < u; x++) {
			
			System.out.println(b);
			c = a + b;
			System.out.println(c);
			a = b+c;
			System.out.println(a);
			b = c +a;
			}
		
		
		
		sc.close();
		}
		
		
	}


