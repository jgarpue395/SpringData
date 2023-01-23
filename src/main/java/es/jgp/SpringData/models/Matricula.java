package es.jgp.SpringData.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula
{
	@EmbeddedId
	private MatriculaId matriculaId;

	@ManyToOne
	@JoinColumn(name = "id_alumno")
	@MapsId("idAlumno")
	private Alumno idAlumno;

	@ManyToOne
	@JoinColumn(name = "id_asignatura")
	@MapsId("idAsignatura")
	private Asignatura idAsignatura;

	@ManyToOne
	@JoinColumn(name = "id_curso")
	@MapsId("idCurso")
	private Curso idCurso;

	/**
	 * Constructor público por defecto
	 */
	public Matricula()
	{
		// Implementación vacía
	}

	public MatriculaId getMatriculaId()
	{
		return this.matriculaId;
	}

	public void setMatriculaId(MatriculaId matriculaId)
	{
		this.matriculaId = matriculaId;
	}

	public Alumno getIdAlumno()
	{
		return this.idAlumno;
	}

	public Asignatura getIdAsignatura()
	{
		return this.idAsignatura;
	}

	public Curso getIdCurso()
	{
		return this.idCurso;
	}

	public void setIdAlumno(Alumno idAlumno)
	{
		this.idAlumno = idAlumno;
	}

	public void setIdAsignatura(Asignatura idAsignatura)
	{
		this.idAsignatura = idAsignatura;
	}

	public void setIdCurso(Curso idCurso)
	{
		this.idCurso = idCurso;
	}
}
