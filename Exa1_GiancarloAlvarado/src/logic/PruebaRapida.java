package logic;

public final class PruebaRapida implements PruebaCovid19{

	Paciente paciente;

	//Inyeccion de dendencias 
	public PruebaRapida(Paciente paciente) {
		super();
		this.paciente = paciente;
	}
	//Sobrecarga de metodos
	@Override
	public Boolean isPositiveCase() {
		if (paciente.getTemperatura() >= 37 && paciente.getEdad() >= 60) {
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
