package es.jgp.SpringData.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso
{
	@Id
	@Column(length = 10)
	private Long id;

	@Column(length = 4, unique = false)
	private int anyoInicio;

	@Column(length = 4, nullable = false)
	private int anyoFin;

//	@OneToMany
//	private Set<Matricula> conjuntoMatricula;

	/**
	 * Constructor por defecto vacío
	 */
	public Curso()
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

	public int getAnyoInicio()
	{
		return this.anyoInicio;
	}

	public void setAnyoInicio(int anyoInicio)
	{
		this.anyoInicio = anyoInicio;
	}

	public int getAnyoFin()
	{
		return this.anyoFin;
	}

	public void setAnyoFin(int anyoFin)
	{
		this.anyoFin = anyoFin;
	}

//	public Set<Matricula> getConjuntoMatricula()
//	{
//		return this.conjuntoMatricula;
//	}
//
//	public void setConjuntoMatricula(Set<Matricula> conjuntoMatricula)
//	{
//		this.conjuntoMatricula = conjuntoMatricula;
//	}
}
