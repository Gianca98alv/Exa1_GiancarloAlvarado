package logic;

public enum Hospital {

	Nicoya("Hospital de Nicoya"),
	Mexico("Hospital de Mexico");

	private String tipo;

	private Hospital(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
}
