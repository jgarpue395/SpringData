package es.jgp.SpringData.models;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="alumno")
public class Alumno 
{
	@Id
	@Column(length = 10)
	private Long id ;
	
	@Column(length = 9, unique = true)
    private String nif ;
    
	@Column(length = 25, nullable = false)
    private String nombre ;
    
	@Column(length = 50, nullable = false)
    private String apellido1 ;
    
	@Column(length = 50)
    private String apellido2 ;
    
	@Column(length = 25, nullable = false)
    private String ciudad ;
    
	@Column(length = 50, nullable = false)
    private String direccion ;
    
	@Column(length = 9)
    private String telefono ;
    
	@Column(nullable = false)
    private Date fechaNacimiento ;
    
	@Column(length = 1, nullable = false)
    private String sexo ;
    
	@Column(length = 20, nullable = false)
    private String tipo ;
	
	@OneToMany
	private Set<Matricula> conjuntoMatricula;
	
	/**
	 * Constructor por defecto vacío
	 */
	public Alumno() 
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
	 * @return the nif
	 */
	public String getNif() 
	{
		return this.nif ;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() 
	{
		return this.nombre ;
	}

	/**
	 * @return the apellido1
	 */
	public String getApellido1() 
	{
		return this.apellido1 ;
	}

	/**
	 * @return the apellido2
	 */
	public String getApellido2() 
	{
		return this.apellido2 ;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() 
	{
		return this.ciudad ;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion()
	{
		return this.direccion ;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() 
	{
		return this.telefono ;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() 
	{
		return this.fechaNacimiento ;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() 
	{
		return this.sexo ;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() 
	{
		return this.tipo ;
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
	 * @param nif the nif to set
	 */
	public void setNif(String nif) 
	{
		this.nif = nif ;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) 
	{
		this.nombre = nombre ;
	}

	/**
	 * @param apellido1 the apellido1 to set
	 */
	public void setApellido1(String apellido1)
	{
		this.apellido1 = apellido1 ;
	}

	/**
	 * @param apellido2 the apellido2 to set
	 */
	public void setApellido2(String apellido2) 
	{
		this.apellido2 = apellido2 ;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) 
	{
		this.ciudad = ciudad ;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) 
	{
		this.direccion = direccion ;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) 
	{
		this.telefono = telefono ;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) 
	{
		this.fechaNacimiento = fechaNacimiento ;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) 
	{
		this.sexo = sexo ;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) 
	{
		this.tipo = tipo ;
	}

	/**
	 * @param conjuntoMatricula the conjuntoMatricula to set
	 */
	public void setConjuntoMatricula(Set<Matricula> conjuntoMatricula) 
	{
		this.conjuntoMatricula = conjuntoMatricula ;
	}

	
	
}
