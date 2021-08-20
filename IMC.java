package calcular_imc;

public class IMC {
	
	String abaixoDoPeso = "Ele está abaixo do peso!";
	String pesoIdeal = "Ele está no peso ideal!";
	String acimaDoPeso = "Ele está acima do peso!";
	String pacienteObeso = "Ele está obeso!";
	double imcPaciente;
	
	void resultadoDoIMCDoPaciente() {
	if (imcPaciente <= 18.5) {
		System.out.println(abaixoDoPeso);
	} else if (imcPaciente <= 25.5) {
		System.out.println(pesoIdeal);
	} else if (imcPaciente <= 30.0) {
		System.out.println(acimaDoPeso);
	} else if (imcPaciente >= 30.1) {
		System.out.println(pacienteObeso);
	}
	}
}
