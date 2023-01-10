/**
 * 
 */
package com.nttdata.repositories;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entidad para Cliente
 * 
 * @author Jonatan Carrera Viera
 *
 */
@Entity
@Table(name = "T_CLIENTE")
public class Cliente implements Serializable {

	/** Serial Version */
	private static final long serialVersionUID = 1L;

	/** Id (PK) */
	private String clienteId;

	/** Nombre del cliente */
	private String nombre;

	/** Primer apellido del cliente */
	private String primerApellido;

	/** Segundo apellido del cliente */
	private String segundoApellido;

	/** Fecha nacimiento del cliente */
	private String fechaNacimiento;

	/** DNI del cliente */
	private String dni;

	/**
	 * Método constructor con parámetros
	 * 
	 * @param clienteId
	 * @param nombre
	 * @param primerApellido
	 * @param segundoApellido
	 * @param fechaNacimiento
	 * @param dni
	 */
	public Cliente(String clienteId, String nombre, String primerApellido, String segundoApellido, String fechaNacimiento,
			String dni) {
		super();
		this.clienteId = clienteId;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
	}

	/**
	 * Método constructor sin parámetros
	 */
	public Cliente() {
		super();
	}

	/**
	 * @return the clienteId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "C_PK_CLIENTE_ID", nullable = false)
	public String getClienteId() {
		return clienteId;
	}

	/**
	 * @param clienteId the clienteId to set
	 */
	public void setClienteId(String clienteId) {
		this.clienteId = clienteId;
	}

	/**
	 * @return the nombre
	 */
	@Column(name = "C_NOMBRE", nullable = false)
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the primerApellido
	 */
	@Column(name = "C_PRIMER_APELLIDO", nullable = false)
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	@Column(name = "C_SEGUNDO_APELLIDO", nullable = false)
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * @return the fechaNacimiento
	 */
	@Column(name = "C_FECHA_NACIMIENTO", nullable = false)
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the dni
	 */
	@Column(name = "C_DNI", nullable = false)
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Cliente [Id de cliente=" + clienteId + "; Nombre=" + nombre + "; Primer apellido=" + primerApellido
				+ "; Segundo Apellido=" + segundoApellido + "; Fecha de nacimiento=" + fechaNacimiento + "; DNI=" + dni
				+ "]";
	}

}
