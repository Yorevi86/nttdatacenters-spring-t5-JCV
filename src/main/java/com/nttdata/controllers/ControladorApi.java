/**
 * 
 */
package com.nttdata.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.repositories.Cliente;

/**
 * Controlador REST de la api para clientes
 * 
 * @author Jonatan Carrera Viera
 *
 */
@RestController
@RequestMapping("/springRest")
public class ControladorApi {

	/** Simula repositorio */
	private static Map<String, Cliente> listaClientes;

	/**
	 * Constructor simula repositorio.
	 */
	public ControladorApi() {

		listaClientes = new HashMap<>();

		final Cliente c1 = new Cliente("1", "Jonatan", "Carrera", "Viera", "1986-11-26", "28929933G");
		listaClientes.put("1", c1);

		final Cliente c2 = new Cliente("2", "Fernando", "Perez", "Nieto", "1991-12-10", "11111111A");
		listaClientes.put("2", c2);

		final Cliente c3 = new Cliente("3", "Pablo", "Dominguez", "Romero", "1989-01-01", "22222222B");
		listaClientes.put("3", c3);

		final Cliente c4 = new Cliente("4", "Rafael", "Herrera", "Chavez", "2015-03-03", "33333333C");
		listaClientes.put("4", c4);

		final Cliente c5 = new Cliente("5", "Eva", "Cardenas", "Bermudez", "2003-02-02", "44444444D");
		listaClientes.put("5", c5);
	}

	/**
	 * Retorna todos los clientes.
	 * 
	 * @return List<Cliente>
	 */
	@GetMapping
	public Map<String, Cliente> showClientes() {

		return listaClientes;
	}

	/**
	 * Añade un nuevo cliente.
	 * 
	 * @param cliente
	 */
	@PostMapping
	public void addCliente(final @RequestBody Cliente cliente) {

		listaClientes.put(cliente.getClienteId(), cliente);
	}

	/**
	 * Elimina un cliente por la Id
	 * 
	 * @param id
	 */
	@DeleteMapping(value = "/{id}")
	public void deleteCliente(final @PathVariable String id) {

		listaClientes.remove(id);
	}

	/**
	 * Búsqueda por Id del cliente
	 * 
	 * @param client
	 * @return Client
	 */
	@RequestMapping(path = "/cliente", method = RequestMethod.GET, consumes = "application/json")
	public Cliente searchBy(@RequestBody Cliente cliente) {

		return listaClientes.get(cliente.getClienteId());
	}
}
