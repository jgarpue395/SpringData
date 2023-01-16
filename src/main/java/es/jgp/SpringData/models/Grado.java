package es.jgp.SpringData.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "grado")
public class Grado
{
	@Id
	@Column(length = 10)
	private Long id;

	@Column(length = 100, nullable = false)
	private String nombre;

	@OneToMany
	private Set<Asignatura> conjuntoAsignaturas;

	/**
	 * Constructor por defecto vacío
	 */
	public Grado()
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

	public Set<Asignatura> getConjuntoAsignaturas()
	{
		return this.conjuntoAsignaturas;
	}

	public void setConjuntoAsignaturas(Set<Asignatura> conjuntoAsignaturas)
	{
		this.conjuntoAsignaturas = conjuntoAsignaturas;
	}

	@Override
	public String toString()
	{
		return "Grado [id=" + id + ", nombre=" + nombre + ", conjuntoAsignaturas=" + conjuntoAsignaturas + "]";
	}
}
