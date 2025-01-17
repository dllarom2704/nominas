package com.aprendec.model;

public class Nomina {
	private static final int SUELDO_BASE[] = { 50000, 70000, 90000, 110000, 130000, 150000, 170000, 190000, 210000,
			230000 };

	public Integer sueldo(Empleado empleado) {
		return SUELDO_BASE[empleado.getCategoria()] + 5000 * empleado.anyos;
	}
}
