
public class MinhaClasse {

	public static void main(String[] args) {
		int idade = 0;
		double altura = 0.0;
		String nome = "";
		boolean flag = true;
		
		//constante
		final double minhaConstantePi = 3.14;
		
		
		System.out.println("A sua Idade é: " + idade);
		System.out.println("A sua Idade é: " + altura);
		System.out.println("A seu Nome é: " + nome);
		System.out.println("A sua Flag é: " + flag);

		System.out.println("A sua Constante Pi é: " + minhaConstantePi);
		
		
		idade = 20;
		altura = 1.80;
		nome = "Ally";
		flag = false;
		
		//minhaConstantePi = 10; (**final => Não permite alterar por ser uma constante.
		
		System.out.println("A sua Idade é: " + idade);
		System.out.println("A sua Altura é: " + altura);
		System.out.println("A seu Nome é: " + nome);
		System.out.println("A sua Flag é: " + flag);



	}

}
