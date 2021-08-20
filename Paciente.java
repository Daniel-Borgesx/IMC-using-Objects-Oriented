package calcular_imc;

public class Paciente {
	
	String nome;
	int peso;
	double altura;
	
	double calculoDeMassaCorporal() {
		IMC imc = new IMC();
		
		imc.imcPaciente = peso / (altura * altura);
		
		System.out.println("O IMC do paciente " + nome + " é de: " + imc.imcPaciente);		
		
		imc.resultadoDoIMCDoPaciente();
	    
		return imc.imcPaciente;
	}

}
