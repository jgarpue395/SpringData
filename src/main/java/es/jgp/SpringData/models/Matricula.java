package es.jgp.SpringData.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name="matricula")
public class Matricula 
{
	@EmbeddedId
    private MatriculaId matriculaId ;
	
	@ManyToOne
    @JoinColumn(name="id_alumno")
    @MapsId("idAlumno")
    private Alumno idAlumno ;

    @ManyToOne
    @JoinColumn(name="id_asignatura")
    @MapsId("idAsignatura")
    private Asignatura idAsignatura ;
    
    @ManyToOne
    @JoinColumn(name="id_curso")
    @MapsId("idCurso")
    private Curso idCurso ;

	/**
	 * Constructor público por defecto
	 */
	public Matricula() 
	{
		// Implementación vacía
	}

    /**
	 * @return the matriculaId
	 */
	public MatriculaId getMatriculaId()
	{
		return this.matriculaId ;
	}

	/**
	 * @param matriculaId the matriculaId to set
	 */
	public void setMatriculaId(MatriculaId matriculaId)
	{
		this.matriculaId = matriculaId ;
	}

	/**
	 * @return the idAlumno
	 */
	public Alumno getIdAlumno() 
	{
		return this.idAlumno ;
	}

	/**
	 * @return the idAsignatura
	 */
	public Asignatura getIdAsignatura() 
	{
		return this.idAsignatura ;
	}

	/**
	 * @return the idCurso
	 */
	public Curso getIdCurso() 
	{
		return this.idCurso ;
	}

	/**
	 * @param idAlumno the idAlumno to set
	 */
	public void setIdAlumno(Alumno idAlumno) 
	{
		this.idAlumno = idAlumno ;
	}

	/**
	 * @param idAsignatura the idAsignatura to set
	 */
	public void setIdAsignatura(Asignatura idAsignatura) 
	{
		this.idAsignatura = idAsignatura ;
	}

	/**
	 * @param idCurso the idCurso to set
	 */
	public void setIdCurso(Curso idCurso) 
	{
		this.idCurso = idCurso ;
	}
}
