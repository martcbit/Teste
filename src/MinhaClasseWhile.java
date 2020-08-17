import java.util.Scanner;

public class MinhaClasseWhile {
	public static void main(String[] args) {
		
		int x = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para X: ");
		x = sc.nextInt();
		
		while(x >= 0) {
			
			System.out.println("O valor de X é: " + x);
			
			x--;
		}
		System.out.println("Saiu do while.");
		
	}
}
