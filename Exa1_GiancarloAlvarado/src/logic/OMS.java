package logic;

import java.util.ArrayList;
import java.util.List;

public abstract class OMS {
	
	private List<Paciente> pacientes;
	private List<PruebaCovid19> resultados;

	public OMS(List<Paciente> pacientes) {
		this.pacientes = pacientes;
		this.resultados = new ArrayList();
		diagnosticar();
	}
	
	protected abstract Boolean isGamHospital();
	protected abstract Hospital getNombreHospital();
	
	private void diagnosticar() {
		resultados = new ArrayList();
		for (Paciente paciente : pacientes) {
			PruebaCovid19 pruebaCovid19 = null;
			if (this.getNombreHospital() == Hospital.Mexico) {
				pruebaCovid19 = new PruebaPCR(paciente);
			} else {
				pruebaCovid19 = new PruebaRapida(paciente);
			}
			resultados.add(pruebaCovid19);
		}
	}
	
	public String imprimirReporte() {
		String reporte = "Reporte del hospital=" + this.getNombreHospital() + "\n"; 
		for (PruebaCovid19 pruebaCovid19 : resultados) {
			reporte += pruebaCovid19.getNombrePaciente() + " " + pruebaCovid19.isPositiveCase() +  "\n";
		}
		return reporte;
	}
	
}
