package es.jgp.SpringData.models;

public class ProfesorAsignatura
{
	private String nombre;	
	private Long asignaturas;
	
	public ProfesorAsignatura(String nombre, Long asignaturas)
	{
		this.nombre = nombre;
		this.asignaturas = asignaturas;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public Long getAsignaturas()
	{
		return asignaturas;
	}

	public void setAsignaturas(Long asignaturas)
	{
		this.asignaturas = asignaturas;
	}

	@Override
	public String toString()
	{
		return "ProfesorAsignatura [nombre=" + nombre + ", asignaturas=" + asignaturas + "]";
	}
}
