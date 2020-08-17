
public class MinhaClasseVetor {

	public static void main(String[] args) {
		
		int vec[] = new int[7]; 		
		
		/*
		vec[0] = 5;
		vec[1] = 8;
		vec[2] = 1;
		vec[6] = 4;

		System.out.println("A posição 0 do vec é: " + vec[0]);
		System.out.println("A posição 1 do vec é: " + vec[1]);
		System.out.println("A posição 2 do vec é: " + vec[2]);
		System.out.println("A posição 6 do vec é: " + vec[6]);
		*/
		
		int aux = 7;
		
		for(int i = 0; i < 7; i++) {
			vec[i] = aux;
			
			aux--;
		}
		
		for(int i = 0; i < 7; i++) {
			
			System.out.println("O valor do vetor é: " + vec[i]);
		}
		
	}

}
