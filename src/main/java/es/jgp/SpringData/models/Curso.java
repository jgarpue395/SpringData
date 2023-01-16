package es.jgp.SpringData.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="curso")
public class Curso 
{
	@Id
	@Column(length = 10)
	private Long id ;
	
	@Column(length = 4, unique = false)
    private int anyoInicio ;
    
	@Column(length = 4, nullable = false)
    private int anyoFin ;
	
	@OneToMany
	private Set<Matricula> conjuntoMatricula ;
	
	/**
	 * Constructor por defecto vacío
	 */
	public Curso() 
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
	 * @return the anyoInicio
	 */
	public int getAnyoInicio() 
	{
		return this.anyoInicio;
	}

	/**
	 * @return the anyoFin
	 */
	public int getAnyoFin()
	{
		return this.anyoFin;
	}

	/**
	 * @return the conjuntoMatricula
	 */
	public Set<Matricula> getConjuntoMatricula()
	{
		return conjuntoMatricula;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id)
	{
		this.id = id;
	}

	/**
	 * @param anyoInicio the anyoInicio to set
	 */
	public void setAnyoInicio(int anyoInicio)
	{
		this.anyoInicio = anyoInicio;
	}

	/**
	 * @param anyoFin the anyoFin to set
	 */
	public void setAnyoFin(int anyoFin) 
	{
		this.anyoFin = anyoFin;
	}

	/**
	 * @param conjuntoMatricula the conjuntoMatricula to set
	 */
	public void setConjuntoMatricula(Set<Matricula> conjuntoMatricula)
	{
		this.conjuntoMatricula = conjuntoMatricula;
	}

	
	
}
