package logic;

public final class Paciente {
	
	private final String nombre;
	private final int edad;
	private final int temperatura;
	private final Boolean vomito;
	
	
	public final String getNombre() {
		return nombre;
	}

	public final int getEdad() {
		return edad;
	}

	public final int getTemperatura() {
		return temperatura;
	}

	public final Boolean getVomito() {
		return vomito;
	}

	public Paciente(String nombre, int edad, int temperatura, Boolean vomito) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.temperatura = temperatura;
		this.vomito = vomito;
	}
	
	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", edad=" + edad + ", temperatura=" + temperatura + ", vomito=" + vomito
				+ "]";
	}
	
	
	

}
