package es.jgp.SpringData.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="grado")
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

	/**
	 * @return the id
	 */
	public Long getId() 
	{
		return this.id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() 
	{
		return this.nombre;
	}

	/**
	 * @return the conjuntoAsignaturas
	 */
	public Set<Asignatura> getConjuntoAsignaturas() 
	{
		return this.conjuntoAsignaturas;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) 
	{
		this.id = id;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	/**
	 * @param conjuntoAsignaturas the conjuntoAsignaturas to set
	 */
	public void setConjuntoAsignaturas(Set<Asignatura> conjuntoAsignaturas) 
	{
		this.conjuntoAsignaturas = conjuntoAsignaturas;
	}

	
}
