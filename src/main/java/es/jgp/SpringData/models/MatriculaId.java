package es.jgp.SpringData.models;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class MatriculaId implements Serializable
{
	/** Serial Version UID */
	private static final long serialVersionUID = -2149990752410587470L ;

	/** Atributo - ID Alumno */
	private Long idAlumno ;
	
	/** Atributo - ID Asignatura */
	private Long idAsignatura ;
	
    /** Atributo - ID Curso */
	private Long idCurso ;

	/**
	 * Constructor público por defecto
	 */
    public MatriculaId()
    {
    	// Implementación vacía
    }

	public Long getIdAlumno()
	{
		return this.idAlumno ;
	}

	public void setIdAlumno(Long idAlumno)
	{
		this.idAlumno = idAlumno ;
	}

	public Long getIdAsignatura()
	{
		return this.idAsignatura ;
	}

	public void setIdAsignatura(Long idAsignatura)
	{
		this.idAsignatura = idAsignatura ;
	}

	public Long getIdCurso()
	{
		return this.idCurso ;
	}

	public void setIdCurso(Long idCurso)
	{
		this.idCurso = idCurso;
	}
}
