package es.jgp.SpringData.impl;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jgp.SpringData.models.Asignatura;
import es.jgp.SpringData.repository.IAsignaturaRepository;
import es.jgp.SpringData.repository.IGradoRepository;
import es.jgp.SpringData.repository.IProfesorRepository;
import es.jgp.SpringData.utils.Constantes;
import es.jgp.SpringData.utils.ProyectoFinalException;

@Service
public class ParseoAsignaturaImpl
{
	@Autowired
	private IAsignaturaRepository asignaturaRepository;

	@Autowired
	private IProfesorRepository profesorRepository;

	@Autowired
	private IGradoRepository gradoRepository;

	public void parseaFichero(Scanner scanner) throws ProyectoFinalException
	{
		scanner.nextLine();

		while (scanner.hasNextLine())
		{
			String lineaDelFichero = scanner.nextLine();

			String[] lineaDelFicheroTroceada = lineaDelFichero.split(Constantes.DELIMITADOR_CSV);

			Asignatura asignatura = new Asignatura();

			asignatura.setId(Long.valueOf(lineaDelFicheroTroceada[0]));
			asignatura.setNombre(lineaDelFicheroTroceada[1]);
			asignatura.setCreditos(Double.valueOf(lineaDelFicheroTroceada[2]));
			asignatura.setTipo(lineaDelFicheroTroceada[3]);
			asignatura.setCurso(Integer.valueOf(lineaDelFicheroTroceada[4]));
			asignatura.setCuatrimestre(Integer.valueOf(lineaDelFicheroTroceada[5]));
			asignatura.setIdProfesor(this.profesorRepository.findById(Long.valueOf(lineaDelFicheroTroceada[6])).get());
			asignatura.setIdGrado(this.gradoRepository.findById(Long.valueOf(lineaDelFicheroTroceada[7])).get());

			this.asignaturaRepository.saveAndFlush(asignatura);
		}
	}
}
