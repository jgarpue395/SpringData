package es.jgp.SpringData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.jgp.SpringData.impl.Consultas;
import es.jgp.SpringData.impl.ConsultasQuery;
import es.jgp.SpringData.impl.ParseoAlumnoImpl;
import es.jgp.SpringData.impl.ParseoAsignaturaImpl;
import es.jgp.SpringData.impl.ParseoCursoImpl;
import es.jgp.SpringData.impl.ParseoDepartamentoImpl;
import es.jgp.SpringData.impl.ParseoGradoImpl;
import es.jgp.SpringData.impl.ParseoMatriculaImpl;
import es.jgp.SpringData.impl.ParseoProfesorImpl;
import es.jgp.SpringData.utils.Constantes;
import es.jgp.SpringData.utils.ProyectoFinalException;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner
{	
	@Autowired
	private ParseoAlumnoImpl parseoAlumnoImpl;

	@Autowired
	private ParseoAsignaturaImpl parseoAsignaturaImpl;

	@Autowired
	private ParseoCursoImpl parseoCursoImpl;

	@Autowired
	private ParseoDepartamentoImpl parseoDepartamentoImpl;

	@Autowired
	private ParseoGradoImpl parseoGradoImpl;

	@Autowired
	private ParseoMatriculaImpl parseoMatriculaImpl;

	@Autowired
	private ParseoProfesorImpl parseoProfesorImpl;
	
	@Autowired
	Consultas consultas;
	
	@Autowired
	ConsultasQuery consultasQuery;

	private Scanner scanner;
	
	public static void main(String[] args)
	{
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
//		try
//		{
//			this.scanner = new Scanner(new File("src" + File.separator + "main" + File.separator + "resources"
//					+ File.separator + Constantes.NOMBRE_FICHERO_ALUMNO));
//			this.parseoAlumnoImpl.parseaFichero(scanner);
//
//			this.scanner = new Scanner(new File("src" + File.separator + "main" + File.separator + "resources"
//					+ File.separator + Constantes.NOMBRE_FICHERO_DEPARTAMENTO));
//			this.parseoDepartamentoImpl.parseaFichero(scanner);
//
//			this.scanner = new Scanner(new File("src" + File.separator + "main" + File.separator + "resources"
//					+ File.separator + Constantes.NOMBRE_FICHERO_PROFESOR));
//			this.parseoProfesorImpl.parseaFichero(scanner);
//
//			this.scanner = new Scanner(new File("src" + File.separator + "main" + File.separator + "resources"
//					+ File.separator + Constantes.NOMBRE_FICHERO_GRADO));
//			this.parseoGradoImpl.parseaFichero(scanner);
//
//			this.scanner = new Scanner(new File("src" + File.separator + "main" + File.separator + "resources"
//					+ File.separator + Constantes.NOMBRE_FICHERO_ASIGNATURA));
//			this.parseoAsignaturaImpl.parseaFichero(scanner);
//
//			this.scanner = new Scanner(new File("src" + File.separator + "main" + File.separator + "resources"
//					+ File.separator + Constantes.NOMBRE_FICHERO_CURSO));
//			this.parseoCursoImpl.parseaFichero(scanner);
//
//			this.scanner = new Scanner(new File("src" + File.separator + "main" + File.separator + "resources"
//					+ File.separator + Constantes.NOMBRE_FICHERO_MATRICULA));
//			this.parseoMatriculaImpl.parseaFichero(scanner);
//		}
//		catch (ProyectoFinalException proyectoFinalException)
//		{
//			proyectoFinalException.printStackTrace();
//		}
//		catch (FileNotFoundException fileNotFoundException)
//		{
//			fileNotFoundException.printStackTrace();
//		}
		
		//this.consultas.printConsulta();
		this.consultasQuery.printConsulta();
	}
}
