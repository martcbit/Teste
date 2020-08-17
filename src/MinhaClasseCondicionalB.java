import java.util.Scanner;

public class MinhaClasseCondicionalB {
	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int c = 0;

		Scanner sc = new Scanner(System.in);
		/* System.out.println("Digite um Valor para a: ");
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
		*/
		
		
		System.out.println("Digite um Valor para C: ");
		c = sc.nextInt();
		
		switch(c) {
			case 0:
				System.out.println("Valor de C é " + c + ".");
				break;
			case 1:
				System.out.println("Valor de C é " + c + ".");
				break;
			case 2:
				System.out.println("Valor de C é " + c + ".");
				break;
			default:
				System.out.println("Valor não indentificado");
				break;
		
	
		}
		
	}
}
