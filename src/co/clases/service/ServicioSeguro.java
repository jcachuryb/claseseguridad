package co.clases.service;

import java.util.ArrayList;
import java.util.List;

public class ServicioSeguro {

	public List<String> obtenerElementos(Integer numero) {
		List<String> lista = new ArrayList<>();
		for (int i = 0; i < numero; i++) {
			lista.add("Elemento " + (i + 1));
		}
		return lista;
	}

}
