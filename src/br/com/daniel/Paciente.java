package br.com.daniel;

public class Paciente {

    private String nome;
    private int peso;
    private double altura;

    public void calculoDeMassaCorporal() {

        double imcPaciente = peso / (altura * altura);
        System.out.println("O IMC do paciente " + nome + " é de: " + String.format("%,.2f", imcPaciente));
        if (imcPaciente <= 18.5) {
            System.out.println(IMC.ABAIXO.getDescricao());
        } else if (imcPaciente <= 25.5) {
            System.out.println(IMC.IDEAL.getDescricao());
        } else if (imcPaciente <= 30.0) {
            System.out.println(IMC.ACIMA.getDescricao());
        } else if (imcPaciente >= 30.1) {
            System.out.println(IMC.OBESO.getDescricao());
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
