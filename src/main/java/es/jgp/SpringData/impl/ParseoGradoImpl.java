package es.jgp.SpringData.impl;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jgp.SpringData.models.Grado;
import es.jgp.SpringData.repository.IGradoRepository;
import es.jgp.SpringData.utils.Constantes;
import es.jgp.SpringData.utils.ProyectoFinalException;

@Service
public class ParseoGradoImpl
{
	@Autowired
	private IGradoRepository gradoRepository;

	public void parseaFichero(Scanner scanner) throws ProyectoFinalException
	{
		scanner.nextLine();

		while (scanner.hasNextLine())
		{
			String lineaDelFichero = scanner.nextLine();

			String[] lineaDelFicheroTroceada = lineaDelFichero.split(Constantes.DELIMITADOR_CSV);

			Grado grado = new Grado();

			grado.setId(Long.valueOf(lineaDelFicheroTroceada[0]));
			grado.setNombre(lineaDelFicheroTroceada[1]);

			this.gradoRepository.saveAndFlush(grado);
		}
	}
}
