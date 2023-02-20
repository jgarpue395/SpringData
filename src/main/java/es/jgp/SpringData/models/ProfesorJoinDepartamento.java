package es.jgp.SpringData.models;

public class ProfesorJoinDepartamento
{
	private String nombre;

	private String apellido1;

	private String apellido2;
	
	private String departamento;

	public ProfesorJoinDepartamento(String nombre, String apellido1, String apellido2, String departamento)
	{
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.departamento = departamento;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getApellido1()
	{
		return apellido1;
	}

	public void setApellido1(String apellido1)
	{
		this.apellido1 = apellido1;
	}

	public String getApellido2()
	{
		return apellido2;
	}

	public void setApellido2(String apellido2)
	{
		this.apellido2 = apellido2;
	}

	public String getDepartamento()
	{
		return departamento;
	}

	public void setDepartamento(String departamento)
	{
		this.departamento = departamento;
	}

	@Override
	public String toString()
	{
		return "ProfesorJoinDepartamento [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", departamento=" + departamento + "]";
	}
}
