package es.jgp.SpringData.impl;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jgp.SpringData.models.Alumno;
import es.jgp.SpringData.models.Asignatura;
import es.jgp.SpringData.models.Curso;
import es.jgp.SpringData.models.Matricula;
import es.jgp.SpringData.models.MatriculaId;
import es.jgp.SpringData.repository.IAlumnoRepository;
import es.jgp.SpringData.repository.IAsignaturaRepository;
import es.jgp.SpringData.repository.ICursoRepository;
import es.jgp.SpringData.repository.IMatriculaRepository;
import es.jgp.SpringData.utils.Constantes;
import es.jgp.SpringData.utils.ProyectoFinalException;

@Service
public class ParseoMatriculaImpl
{
	@Autowired
	private IMatriculaRepository matriculaRepository;

	@Autowired
	private IAlumnoRepository alumnoRepository;

	@Autowired
	private IAsignaturaRepository asignaturaRepository;

	@Autowired
	private ICursoRepository cursoRepository;

	public void parseaFichero(Scanner scanner) throws ProyectoFinalException
	{
		scanner.nextLine();

		while (scanner.hasNextLine())
		{
			String lineaDelFichero = scanner.nextLine();

			String[] lineaDelFicheroTroceada = lineaDelFichero.split(Constantes.DELIMITADOR_CSV);

			Matricula matricula = new Matricula();

			Alumno alumno = this.alumnoRepository.findById(Long.valueOf(lineaDelFicheroTroceada[0])).get();
			matricula.setIdAlumno(alumno);

			Asignatura asignatura = this.asignaturaRepository.findById(Long.valueOf(lineaDelFicheroTroceada[1])).get();
			matricula.setIdAsignatura(asignatura);

			Curso curso = this.cursoRepository.findById(Long.valueOf(lineaDelFicheroTroceada[2])).get();
			matricula.setIdCurso(curso);

			MatriculaId matriculaId = new MatriculaId();

			matriculaId.setIdAlumno(alumno.getId());
			matriculaId.setIdAsignatura(asignatura.getId());
			matriculaId.setIdCurso(curso.getId());

			matricula.setMatriculaId(matriculaId);

			System.out.println(matricula);
			//this.matriculaRepository.saveAndFlush(matricula);
		}
	}
}
