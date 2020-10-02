import java.util.Locale;

//Em um novo programa, inicie as
//seguintes variáveis:

//Em seguida, usando os valores das variáveis, produza a
//seguinte saída na tela do console:


public class Main {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measeure = 53.234567;
		System.out.println("Products:");
		System.out.printf("%s, whitch price is $ %.2f%n", product1, price1);
		System.out.printf("%s, whitch price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: $ %.8f%n", measeure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measeure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.2f%n", measeure);
		
		

	}

}
