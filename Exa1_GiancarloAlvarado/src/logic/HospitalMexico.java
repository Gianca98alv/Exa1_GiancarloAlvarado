package logic;

import java.util.List;

public class HospitalMexico extends OMS{

	private Hospital hospitalMexico;
	
	public HospitalMexico(List<Paciente> pacientes) {
		super(pacientes);
		hospitalMexico = Hospital.Mexico;
	}
	
	@Override
	protected Boolean isGamHospital() {
		return true;
	}

	@Override
	protected Hospital getNombreHospital() {
		return Hospital.Mexico;
	}

}
