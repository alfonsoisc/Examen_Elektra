package com.practica.elektra;

import com.practica.elektra.models.Clasificacion;
import com.practica.elektra.models.Materiales;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ElektraApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElektraApplication.class, args);

		ArrayList<Clasificacion> listaClasificaciones = new ArrayList<Clasificacion>();

		listaClasificaciones.add(new Clasificacion(14, 16, 10, 0));
		listaClasificaciones.add(new Clasificacion(14, 25, 12, 10));

		ArrayList<Materiales> listaMateriales = new ArrayList<Materiales>();

		String[][] datos = {
				{"178121", "14", "16", "10", "0"},
				{"178122", "14", "25", "12", "10"},
				// Agregar más datos según el archivo
		};

		for (int i = 0; i < datos.length; i++) {
			listaMateriales.add(new Materiales(datos[i][0], datos[i][1], datos[i][2], datos[i][3], datos[i][4]));
		}

		ArrayList<Materiales> listaFiltrada = new ArrayList<Materiales>();

		for (Clasificacion clasificacion : listaClasificaciones) {
			// Recorrer la lista de materiales
			for (Materiales material : listaMateriales) {
				// Comparar los atributos de las clases
				if (clasificacion.getIdDepartamento() == material.getIdDepartamento() &&
						clasificacion.getIdSubDepartamento() == material.getIdSubDepartamento() &&
						clasificacion.getIdClase() == material.getIdClase() &&
						clasificacion.getIdSubClase() == material.getIdSubClase()) {
					// Agregar el material que cumple con la clasificación a la lista filtrada
					listaFiltrada.add(material);
				}
			}
		}


		System.out.println("Los materiales que cumplen con las clasificaciones son:");
		for (Materiales material : listaFiltrada) {
			System.out.println(material.getMaterial());
		}

	}

}
