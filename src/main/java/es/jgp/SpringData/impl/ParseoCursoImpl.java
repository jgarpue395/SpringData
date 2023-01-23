package es.jgp.SpringData.impl;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jgp.SpringData.models.Curso;
import es.jgp.SpringData.repository.ICursoRepository;
import es.jgp.SpringData.utils.Constantes;
import es.jgp.SpringData.utils.ProyectoFinalException;

@Service
public class ParseoCursoImpl
{
	@Autowired
	private ICursoRepository cursoRepository;

	public void parseaFichero(Scanner scanner) throws ProyectoFinalException
	{
		scanner.nextLine();

		while (scanner.hasNextLine())
		{
			String lineaDelFichero = scanner.nextLine();

			String[] lineaDelFicheroTroceada = lineaDelFichero.split(Constantes.DELIMITADOR_CSV);

			Curso curso = new Curso();

			curso.setId(Long.valueOf(lineaDelFicheroTroceada[0]));
			curso.setAnyoInicio(Integer.valueOf(lineaDelFicheroTroceada[1]));
			curso.setAnyoFin(Integer.valueOf(lineaDelFicheroTroceada[2]));

			this.cursoRepository.saveAndFlush(curso);
		}
	}
}
