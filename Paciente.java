package calcular_imc;

public class Paciente {
	
	String nome;
	int peso;
	double altura;
	
	double calculoDeMassaCorporal() {
		IMC imc = new IMC();
		
		double imcPaciente = peso / (altura * altura);
		System.out.println("O IMC do paciente " + nome + " é de: " + imcPaciente);		
		if (imcPaciente <= 18.5) {
			System.out.println(imc.abaixoDoPeso);
		} else if (imcPaciente <= 25.5) {
			System.out.println(imc.pesoIdeal);
		} else if (imcPaciente <= 30.0) {
			System.out.println(imc.acimaDoPeso);
		} else if (imcPaciente >= 30.1) {
			System.out.println(imc.pacienteObeso);
		}
	    
		return imcPaciente;
	}

}
