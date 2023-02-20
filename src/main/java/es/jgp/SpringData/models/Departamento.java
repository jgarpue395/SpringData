package es.jgp.SpringData.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento
{
	@Id
	@Column(length = 10)
	private Long id;

	@Column(length = 50, nullable = false)
	private String nombre;
	
	@OneToMany(mappedBy = "idDepartamento")
	private List<Profesor> profesores;

	/**
	 * Constructor por defecto vacío
	 */
	public Departamento()
	{
		// Implementación vacía
	}

	public Long getId()
	{
		return this.id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getNombre()
	{
		return this.nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public List<Profesor> getProfesores()
	{
		return this.profesores;
	}

	public void setProfesores(List<Profesor> profesores)
	{
		this.profesores = profesores;
	}

	@Override
	public String toString()
	{
		return "Departamento [id=" + id + ", nombre=" + nombre + "]";
	}
}
