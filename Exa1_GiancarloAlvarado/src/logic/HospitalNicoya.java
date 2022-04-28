package logic;

import java.util.List;

public class HospitalNicoya extends OMS {

	private Hospital hospitalNicoya;
	
	public HospitalNicoya(List<Paciente> pacientes) {
		super(pacientes);
		hospitalNicoya = Hospital.Nicoya;
	}
	
	@Override
	protected Boolean isGamHospital() {
		return false;
	}

	@Override
	protected Hospital getNombreHospital() {
		return Hospital.Nicoya;
	}

}
