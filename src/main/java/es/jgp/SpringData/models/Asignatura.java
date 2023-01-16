package es.jgp.SpringData.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "asignatura")
public class Asignatura
{
	@Id
	@Column(length = 10)
	private Long id;

	@Column(length = 100, unique = false)
	private String nombre;

	@Column(nullable = false)
	private double creditos;

	@Column(length = 15, nullable = false)
	private String tipo;

	@Column(length = 3, nullable = false)
	private int curso;

	@Column(length = 1, nullable = false)
	private int cuatrimestre;

	@ManyToOne
	private Profesor idProfesor;

	@ManyToOne
	private Grado idGrado;

	@OneToMany
	private Set<Matricula> conjuntoMatricula;

	/**
	 * Constructor por defecto vacío
	 */
	public Asignatura()
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

	public double getCreditos()
	{
		return this.creditos;
	}

	public void setCreditos(double creditos)
	{
		this.creditos = creditos;
	}

	public String getTipo()
	{
		return this.tipo;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public int getCurso()
	{
		return this.curso;
	}

	public void setCurso(int curso)
	{
		this.curso = curso;
	}

	public int getCuatrimestre()
	{
		return this.cuatrimestre;
	}

	public void setCuatrimestre(int cuatrimestre)
	{
		this.cuatrimestre = cuatrimestre;
	}

	public Profesor getIdProfesor()
	{
		return this.idProfesor;
	}

	public void setIdProfesor(Profesor idProfesor)
	{
		this.idProfesor = idProfesor;
	}

	public Grado getIdGrado()
	{
		return this.idGrado;
	}

	public void setIdGrado(Grado idGrado)
	{
		this.idGrado = idGrado;
	}

	public Set<Matricula> getConjuntoMatricula()
	{
		return this.conjuntoMatricula;
	}

	public void setConjuntoMatricula(Set<Matricula> conjuntoMatricula)
	{
		this.conjuntoMatricula = conjuntoMatricula;
	}

	@Override
	public String toString()
	{
		return "Asignatura [id=" + id + ", nombre=" + nombre + ", creditos=" + creditos + ", tipo=" + tipo + ", curso="
				+ curso + ", cuatrimestre=" + cuatrimestre + ", idProfesor=" + idProfesor + ", idGrado=" + idGrado
				+ ", conjuntoMatricula=" + conjuntoMatricula + "]";
	}
}
