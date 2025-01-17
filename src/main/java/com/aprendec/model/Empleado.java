package com.aprendec.model;

import com.aprendec.model.exceptions.DatosNoCorrectosException;

public class Empleado {
	private String nombre, dni;
	private char sexo;
	private Integer categoria;
	public Integer anyos;

	public Empleado() {
	}

	/**
	 * Constructor del objeto Empleado, en este caso se le pasan como parámetros el
	 * nombre y el sexo. Los obtenemos de Persona
	 * 
	 * @param nombre Nombre de la persona
	 * @param sexo   Sexo de la persona
	 */
	public Empleado(String nombre, char sexo) {
		this.nombre = nombre;
		this.sexo = sexo;

	}

	/**
	 * Constructor del objeto Empleado, en este case se le pasan como parámetros el
	 * nombre, el dni y es sexo
	 * 
	 * @param nombre El nombre de la persona
	 * @param dni    El dni de la persona
	 * @param sexo   El sexo de la persona
	 */
	public Empleado(String nombre, String dni, char sexo) {
		this.nombre = nombre;
		this.dni = dni;
		this.sexo = sexo;
		categoria = 1;
		anyos = 0;
	}

	/**
	 * Constructor del objeto Empleado
	 * 
	 * @param nombre    Nombre de la persona
	 * @param dni       Dni de la persona
	 * @param sexo      Sexo de la persona
	 * @param categoria Categoría de empleado
	 * @param anyos     Años trabajados
	 * @throws DatosNoCorrectosException
	 */
	public Empleado(String nombre, String dni, char sexo, Integer categoria, Integer anyos)
			throws DatosNoCorrectosException {
		if (!(categoria >= 1 && categoria <= 10 || !(anyos >= 0))) {
			throw new DatosNoCorrectosException("Datos no correctos");
		}

		this.categoria = categoria;
		this.anyos = anyos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Integer getAnyos() {
		return anyos;
	}

	public void setAnyos(Integer anyos) {
		this.anyos = anyos;
	}

	/**
	 * Getter de la propiedad categoría
	 * 
	 * @return El valor de categoría
	 */
	public Integer getCategoria() {
		return categoria;
	}

	/**
	 * Setter de categoría
	 * 
	 * @param categoria La categoría de empleado
	 */
	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}

	/**
	 * Método que incrementa en uno los años trabajados
	 */
	public void incrAnyo() {
		anyos++;
	}

	/**
	 * Método que imprime todos los datos de un objeto empleado
	 */
	public void imprime() {
		System.out.println("Nombre: " + nombre + "\nDni: " + dni + "\nSexo: " + sexo + "\nCategoría: " + categoria
				+ "\nAños trabajados: " + anyos);
	}

}
