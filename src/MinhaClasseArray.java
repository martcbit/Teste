import java.util.ArrayList;

public class MinhaClasseArray {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Allys");
		list.add("Sylla");
		list.add("Aurly");
		list.add("Lyaur");

		System.out.println("Terceiro item: " + list.get(2));
		System.out.println("Tamanho da Lista: " + list.size());

		if(list.contains("Allys")) {
			System.out.println("Existe Allys na Lista");

		} else {
			System.out.println("Nome Allys não Localizado");

		}
		
		list.remove(0);
		
		System.out.println("Tamanho da Lista: " + list.size());
		
		if(list.contains("Allys")) {
			System.out.println("Existe Allys na Lista");

		} else {
			System.out.println("Nome Allys não Localizado");

		}
	}
}
