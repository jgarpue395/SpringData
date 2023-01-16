package es.jgp.SpringData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import es.jgp.SpringData.impl.ParseoAlumnoImpl;
import es.jgp.SpringData.impl.ParseoAsignaturaImpl;
import es.jgp.SpringData.impl.ParseoCursoImpl;
import es.jgp.SpringData.impl.ParseoDepartamentoImpl;
import es.jgp.SpringData.impl.ParseoGradoImpl;
import es.jgp.SpringData.impl.ParseoMatriculaImpl;
import es.jgp.SpringData.impl.ParseoProfesorImpl;
import es.jgp.SpringData.utils.Constantes;
import es.jgp.SpringData.utils.ProyectoFinalException;

public class Launcher2
{
	private static ParseoAlumnoImpl parseoAlumnoImpl = new ParseoAlumnoImpl();

	private static ParseoAsignaturaImpl parseoAsignaturaImpl = new ParseoAsignaturaImpl();

	private static ParseoCursoImpl parseoCursoImpl = new ParseoCursoImpl();

	private static ParseoDepartamentoImpl parseoDepartamentoImpl = new ParseoDepartamentoImpl();

	private static ParseoGradoImpl parseoGradoImpl = new ParseoGradoImpl();

	private static ParseoMatriculaImpl parseoMatriculaImpl = new ParseoMatriculaImpl();

	private static ParseoProfesorImpl parseoProfesorImpl = new ParseoProfesorImpl();

	private static Scanner scanner;

	public static void main(String[] args)
	{
		try
		{
			scanner = new Scanner(new File("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + Constantes.NOMBRE_FICHERO_ALUMNO));
			parseoAlumnoImpl.parseaFichero(scanner);

			scanner = new Scanner(new File("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + Constantes.NOMBRE_FICHERO_DEPARTAMENTO));
			parseoDepartamentoImpl.parseaFichero(scanner);

			scanner = new Scanner(new File("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + Constantes.NOMBRE_FICHERO_PROFESOR));
			parseoProfesorImpl.parseaFichero(scanner);

			scanner = new Scanner(new File("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + Constantes.NOMBRE_FICHERO_GRADO));
			parseoGradoImpl.parseaFichero(scanner);

			scanner = new Scanner(new File("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + Constantes.NOMBRE_FICHERO_ASIGNATURA));
			parseoAsignaturaImpl.parseaFichero(scanner);

			scanner = new Scanner(new File("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + Constantes.NOMBRE_FICHERO_CURSO));
			parseoCursoImpl.parseaFichero(scanner);

			scanner = new Scanner(new File("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + Constantes.NOMBRE_FICHERO_MATRICULA));
			parseoMatriculaImpl.parseaFichero(scanner);
		}
		catch (ProyectoFinalException proyectoFinalException)
		{
			proyectoFinalException.printStackTrace();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
