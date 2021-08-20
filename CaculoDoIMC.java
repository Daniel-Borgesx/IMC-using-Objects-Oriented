package calcular_imc;

import java.util.Scanner;

public class CaculoDoIMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Paciente paciente = new Paciente();
		
		System.out.print("Digite seu nome: ");
		paciente.nome = scanner.nextLine();
		
		System.out.print("Digite sua altura: ");
		paciente.altura = scanner.nextDouble();
		
		System.out.print("Digite seu peso: ");
		paciente.peso = scanner.nextInt();
		
		paciente.calculoDeMassaCorporal();
		
		scanner.close();

	}

}
