package logic;

public final class PruebaPCR implements PruebaCovid19 {
	
	Paciente paciente;


	public PruebaPCR(Paciente paciente) {
		super();
		this.paciente = paciente;
	}

	@Override
	public Boolean isPositiveCase() {
		if (paciente.getTemperatura() >= 39 && paciente.getVomito()) {
			return true;
		} 
		return false;
	}

	@Override
	public String getNombrePaciente() {
		return paciente.getNombre();
	}

	
	
}
