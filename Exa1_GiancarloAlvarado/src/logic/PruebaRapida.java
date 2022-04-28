package logic;

public final class PruebaRapida implements PruebaCovid19{

	Paciente paciente;

	
	public PruebaRapida(Paciente paciente) {
		super();
		this.paciente = paciente;
	}

	@Override
	public Boolean isPositiveCase() {
		if (paciente.getTemperatura() >= 37 && paciente.getEdad() >= 60) {
			return true;
		} 
		return false;
	}

	@Override
	public String getNombrePaciente() {
		return paciente.getNombre();
	}
	
}
