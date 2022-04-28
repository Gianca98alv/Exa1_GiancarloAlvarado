package logic;

public final class PruebaPCR implements PruebaCovid19 {
	
	Paciente paciente;

	//Inyeccion de dendencias 
	public PruebaPCR(Paciente paciente) {
		super();
		this.paciente = paciente;
	}
	//Sobrecarga de metodos
	@Override
	public Boolean isPositiveCase() {
		if (paciente.getTemperatura() >= 39 && paciente.getVomito()) {
			return true;
		} 
		return false;
	}
	//Sobrecarga de metodos
	@Override
	public String getNombrePaciente() {
		return paciente.getNombre();
	}

	
	
}
