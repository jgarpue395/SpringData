package es.jgp.SpringData.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="asignatura")
public class Asignatura 
{
	/** https://stackoverflow.com/questions/8169196/illegal-attempt-to-map-a-non-collection-as-a-onetomany-manytomany-or-collec */
	
	@Id
	@Column(length = 10)
	private Long id ;
	
	@Column(length = 100, unique = false)
    private String nombre ;
    
	@Column(nullable = false)
    private double creditos ;
    
	@Column(length = 15, nullable = false)
    private String tipo ;
    
	@Column(length = 3, nullable = false)
    private int curso ;
    
	@Column(length = 1, nullable = false)
    private int cuatrimestre ;
    
	@ManyToOne
    private Profesor idProfesor ;
	
	@ManyToOne
    private Grado idGrado ;
	
	@OneToMany
	private Set<Matricula> conjuntoMatricula ;
	
	/**
	 * Constructor por defecto vacío
	 */
	public Asignatura() 
	{
		// Implementación vacía
	}

	/**
	 * @return the id
	 */
	public Long getId() 
	{
		return this.id ;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() 
	{
		return this.nombre ;
	}

	/**
	 * @return the creditos
	 */
	public double getCreditos() 
	{
		return this.creditos ;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() 
	{
		return this.tipo ;
	}

	/**
	 * @return the curso
	 */
	public int getCurso() 
	{
		return this.curso ;
	}

	/**
	 * @return the cuatrimestre
	 */
	public int getCuatrimestre() 
	{
		return this.cuatrimestre ;
	}

	/**
	 * @return the idProfesor
	 */
	public Profesor getIdProfesor() 
	{
		return this.idProfesor ;
	}

	/**
	 * @return the idGrado
	 */
	public Grado getIdGrado()
	{
		return this.idGrado ;
	}

	/**
	 * @return the conjuntoMatricula
	 */
	public Set<Matricula> getConjuntoMatricula()
	{
		return this.conjuntoMatricula ;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id)
	{
		this.id = id ;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre ;
	}

	/**
	 * @param creditos the creditos to set
	 */
	public void setCreditos(double creditos)
	{
		this.creditos = creditos ;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo)
	{
		this.tipo = tipo ;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(int curso)
	{
		this.curso = curso ;
	}

	/**
	 * @param cuatrimestre the cuatrimestre to set
	 */
	public void setCuatrimestre(int cuatrimestre) 
	{
		this.cuatrimestre = cuatrimestre ;
	}

	/**
	 * @param idProfesor the idProfesor to set
	 */
	public void setIdProfesor(Profesor idProfesor) 
	{
		this.idProfesor = idProfesor ;
	}

	/**
	 * @param idGrado the idGrado to set
	 */
	public void setIdGrado(Grado idGrado) 
	{
		this.idGrado = idGrado ;
	}

	/**
	 * @param conjuntoMatricula the conjuntoMatricula to set
	 */
	public void setConjuntoMatricula(Set<Matricula> conjuntoMatricula) 
	{
		this.conjuntoMatricula = conjuntoMatricula ;
	}	
}
