import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite seu peso: ");
		Double pesoDoCliente = scanner.nextDouble();
		
		System.out.print("Digite sua altura: ");
		Double alturaDoCliente = scanner.nextDouble();
		
		Double multiplicacao = alturaDoCliente * alturaDoCliente;
		
		Double resultado = pesoDoCliente / multiplicacao;
		System.out.println("IMC: " + resultado);
		
		scanner.close();
	}
}
