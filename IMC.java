package calcular_imc;

public class IMC {
	
	String abaixoDoPeso = "Ele est� abaixo do peso!";
	String pesoIdeal = "Ele est� no peso ideal!";
	String acimaDoPeso = "Ele est� acima do peso!";
	String pacienteObeso = "Ele est� obeso!";
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
