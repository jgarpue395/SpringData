package es.jgp.SpringData.models;

public class AlumnoResponse
{
	private String nombre;
	
	public AlumnoResponse(String nombre)
	{
		this.nombre = nombre;
	}

	public String getNombre()
	{
		return this.nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	@Override
	public String toString()
	{
		return "AlumnoResponse [nombre=" + nombre + "]";
	}
}
