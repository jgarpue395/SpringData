package es.jgp.SpringData.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Profesor")
public class Profesor
{
	@Id
	@Column(length = 10)
	private Long id;

	@Column(length = 9, unique = true)
	private String nif;

	@Column(length = 25, nullable = false)
	private String nombre;

	@Column(length = 50, nullable = false)
	private String apellido1;

	@Column(length = 50)
	private String apellido2;

	@Column(length = 25, nullable = false)
	private String ciudad;

	@Column(length = 50, nullable = false)
	private String direccion;

	@Column(length = 9)
	private String telefono;

	@Column(nullable = false)
	private Date fechaNacimiento;

	@Column(length = 1, nullable = false)
	private String sexo;

	@ManyToOne
	@JoinColumn(name = "id_departamento_id")
	private Departamento idDepartamento;

	public Profesor()
	{
		// Implemenatación vacía
	}

	public Long getId()
	{
		return this.id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getNif()
	{
		return this.nif;
	}

	public void setNif(String nif)
	{
		this.nif = nif;
	}

	public String getNombre()
	{
		return this.nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getApellido1()
	{
		return this.apellido1;
	}

	public void setApellido1(String apellido1)
	{
		this.apellido1 = apellido1;
	}

	public String getApellido2()
	{
		return this.apellido2;
	}

	public void setApellido2(String apellido2)
	{
		this.apellido2 = apellido2;
	}

	public String getCiudad()
	{
		return this.ciudad;
	}

	public void setCiudad(String ciudad)
	{
		this.ciudad = ciudad;
	}

	public String getDireccion()
	{
		return this.direccion;
	}

	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}

	public String getTelefono()
	{
		return this.telefono;
	}

	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}

	public Date getFechaNacimiento()
	{
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento)
	{
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo()
	{
		return this.sexo;
	}

	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}

	public Departamento getIdDepartamento()
	{
		return this.idDepartamento;
	}

	public void setIdDepartamento(Departamento idDepartamento)
	{
		this.idDepartamento = idDepartamento;
	}

	@Override
	public String toString()
	{
		return "Profesor [id=" + id + ", nif=" + nif + ", nombre=" + nombre + ", apellido1=" + apellido1
				+ ", apellido2=" + apellido2 + ", ciudad=" + ciudad + ", direccion=" + direccion + ", telefono="
				+ telefono + ", fechaNacimiento=" + fechaNacimiento + ", sexo=" + sexo + ", idDepartamento="
				+ idDepartamento + "]";
	}
}
