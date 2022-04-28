package logic;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Paciente> pacientesNicoya = new ArrayList();
		pacientesNicoya.add(new Paciente ("Jorge Lopez", 34, 45, true));
		pacientesNicoya.add(new Paciente ("David Guevara", 85, 38, false));
		
		List<Paciente> pacientesMexico = new ArrayList();
		pacientesMexico.add(new Paciente ("Alicia Rivera", 69, 40, true));
		pacientesMexico.add(new Paciente ("Ulises Ugalde", 15, 32, false));
		
		OMS hospitalMexico = new HospitalMexico(pacientesMexico);
		System.out.println(hospitalMexico.imprimirReporte());
		
		OMS hospitalNicoya = new HospitalNicoya(pacientesNicoya);
		System.out.println(hospitalNicoya.imprimirReporte());
		

	}

}
