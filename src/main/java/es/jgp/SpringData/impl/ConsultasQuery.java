package es.jgp.SpringData.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jgp.SpringData.models.Alumno;
import es.jgp.SpringData.models.MatriculaJoin;
import es.jgp.SpringData.models.Profesor;
import es.jgp.SpringData.models.ProfesorAsignatura;
import es.jgp.SpringData.models.ProfesorJoinDepartamento;
import es.jgp.SpringData.repository.IAlumnoRepository;
import es.jgp.SpringData.repository.IAsignaturaRepository;
import es.jgp.SpringData.repository.IMatriculaRepository;
import es.jgp.SpringData.repository.IProfesorRepository;

@Service
public class ConsultasQuery
{
	@Autowired
	private IAlumnoRepository alumnoRepository;

	@Autowired
	private IAsignaturaRepository asignaturaRepository;
	
	@Autowired
	private IProfesorRepository profesorRepository;

	@Autowired
	private IMatriculaRepository matriculaRepository;

	public void printConsulta()
	{ 
		System.out.println("findAlumnoPorCiudad");
		for (Alumno alumno : this.alumnoRepository.findAlumnoPorCiudad("Almeria"))
		{
			System.out.println(alumno.toString());
		}
		
		System.out.println();

		System.out.println("findProfesorJoinDepartamento");
		for (ProfesorJoinDepartamento profesor : this.profesorRepository.findProfesorJoinDepartamento())
		{
			System.out.println(profesor.toString());
		}
		
		System.out.println();

		System.out.println("findProfesorJoinDepartamentoByNombre");
		for (Profesor profesor : this.profesorRepository.findProfesorJoinDepartamentoByNombre("Mat"))
		{
			System.out.println(profesor.toString());
		}
		
		System.out.println();

		System.out.println("findProfesorJoinDepartamentoByNombre");
		for (ProfesorAsignatura profesor : this.asignaturaRepository.findNumeroAsignaturasImparteUnProfesorByNombre())
		{
			System.out.println(profesor.toString());
		}
		
		System.out.println();

		System.out.println("findAlumnoGroudByAsignatura");
		for (MatriculaJoin matricula : this.matriculaRepository.findAlumnoGroudByAsignatura())
		{
			System.out.println(matricula.toString());
		}
		
		// -------------------------------------------------------------------------------------------------------------------
		System.out.println();

		System.out.println("Matriculas de alumnos femeninos: " + this.matriculaRepository.countMatriculasAlumnosBySexo("M"));
		
		System.out.println();

		System.out.println("findProfesorByTipo");
		for (String asignatura : this.asignaturaRepository.findProfesorByTipo("optativa"))
		{
			System.out.println(asignatura);
		}
		
		System.out.println();

		System.out.println("findProfesorByGrado");
		for (String asignatura : this.asignaturaRepository.findProfesorByGrado("Grado en Ingeniería Informática (Plan 2015)"))
		{
			System.out.println(asignatura);
		}
	}
}
