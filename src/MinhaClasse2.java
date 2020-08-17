
public class MinhaClasse2 {
	public static void main(String[] args) {
		
		String valor = "10";
		
		int novoValor = 5;
		
		int soma = novoValor + Integer.parseInt(valor);
		
		String textoSoma = String.valueOf(soma);
		
		System.out.println("Soma = " + soma);
		
		System.out.println("Texto Soma = " + textoSoma);
	}
}
