import java.util.Scanner;

public class MinhaClasseCondicional {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um Valor para a: ");
		a = sc.nextInt();
		
		System.out.println("Digite um Valor para b: ");
		b = sc.nextInt();
		
		//int soma = a + b;
		 
		//System.out.println("A = "+ a + " + " + "B = " + b + "   soma = " + soma );
	
		
		if(a > b) {
			System.out.println("A é maior ou igual a B.");
		} else {
			System.out.println("A é menor que B.");
		}
		
		
	}
	
	
	
}
