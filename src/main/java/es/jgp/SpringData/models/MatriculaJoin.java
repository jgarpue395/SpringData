package es.jgp.SpringData.models;

public class MatriculaJoin
{
	private String nombreAsignatura;
	private String nombreAlumno;

	public MatriculaJoin(String nombreAsignatura, String nombreAlumno)
	{
		this.nombreAsignatura = nombreAsignatura;
		this.nombreAlumno = nombreAlumno;
	}

	public String getNombreAsignatura()
	{
		return this.nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura)
	{
		this.nombreAsignatura = nombreAsignatura;
	}

	public String getNombreAlumno()
	{
		return this.nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno)
	{
		this.nombreAlumno = nombreAlumno;
	}

	@Override
	public String toString()
	{
		return "MatriculaJoin [nombreAsignatura=" + nombreAsignatura + ", nombreAlumno=" + nombreAlumno + "]";
	}
}
