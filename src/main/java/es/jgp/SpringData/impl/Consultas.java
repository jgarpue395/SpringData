package es.jgp.SpringData.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jgp.SpringData.models.Alumno;
import es.jgp.SpringData.models.AlumnoResponse;
import es.jgp.SpringData.models.Asignatura;
import es.jgp.SpringData.models.Profesor;
import es.jgp.SpringData.repository.IAlumnoRepository;
import es.jgp.SpringData.repository.IAsignaturaRepository;
import es.jgp.SpringData.repository.IProfesorRepository;

@Service
public class Consultas
{
	@Autowired
	private IAlumnoRepository alumnoRepository;
	
	@Autowired
	private IAsignaturaRepository asignaturaRepository;
	
	@Autowired
	private IProfesorRepository profesorRepository;

	public void printConsulta()
	{
		System.out.println("findByNombre");
		for (Alumno alumno : this.alumnoRepository.findByNombre("Juan"))
		{
			System.out.println(alumno.toString());
		}

		System.out.println();
		
		System.out.println("findByNombreContaining");
		for (Alumno alumno : this.alumnoRepository.findByNombreContaining("I"))
		{
			System.out.println(alumno.toString());
		}

		System.out.println();

		System.out.println("findByNombreAndCiudad");
		for (Alumno alumno : this.alumnoRepository.findByNombreAndCiudad("Juan", "Almería"))
		{
			System.out.println(alumno.toString());
		}

		System.out.println();

		System.out.println("findBySexo");
		for (Alumno alumno : this.alumnoRepository.findBySexo("M"))
		{
			System.out.println(alumno.toString());
		}
		
		System.out.println();

		System.out.println("findByNombreAndApellido1");
		for (AlumnoResponse alumno : this.alumnoRepository.findNombreByNombreAndApellido1("Juan", "Saez"))
		{
			System.out.println(alumno.toString());
		}
		
		System.out.println();

		System.out.println("findOrderByIdDesc");
		for (Alumno alumno : this.alumnoRepository.findByOrderByIdDesc())
		{
			System.out.println(alumno.toString());
		}
		
		System.out.println();

		System.out.println("findFirst10ByOrderByCreditosAsc");
		for (Asignatura asignatura : this.asignaturaRepository.findFirst10ByOrderByCreditosDesc())
		{
			System.out.println(asignatura.toString());
		}
		
		System.out.println();

		System.out.println("findByCreditosLessEqualThan");
		for (Asignatura asignatura : this.asignaturaRepository.findByCreditosLessThan(5))
		{
			System.out.println(asignatura.toString());
		}
		
		System.out.println();

		System.out.println("findByCreditosBetween");
		for (Asignatura asignatura : this.asignaturaRepository.findByCreditosBetweenOrderByCreditosDesc(2.3, 8.6))
		{
			System.out.println(asignatura.toString());
		}
	}
}