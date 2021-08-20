package br.com.daniel;

import java.util.Scanner;

public class Boot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Paciente paciente = new Paciente();

        System.out.print("Digite seu nome: ");
        paciente.setNome(scanner.nextLine());

        System.out.print("Digite sua altura: ");
        paciente.setAltura(scanner.nextDouble());

        System.out.print("Digite seu peso: ");
        paciente.setPeso(scanner.nextInt());

        paciente.calculoDeMassaCorporal();

        scanner.close();

    }

}
