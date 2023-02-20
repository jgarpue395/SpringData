package es.jgp.SpringData.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.jgp.SpringData.models.Matricula;
import es.jgp.SpringData.models.MatriculaId;
import es.jgp.SpringData.models.MatriculaJoin;

public interface IMatriculaRepository extends JpaRepository<Matricula, MatriculaId> 
{
	@Query("SELECT new es.jgp.SpringData.models.MatriculaJoin(a.nombre, CONCAT(al.nombre, ' ', al.apellido1)) FROM Matricula m JOIN Asignatura a JOIN Alumno al ON m.idAlumno = al.id AND m.idAsignatura = a.id")
	List<MatriculaJoin> findAlumnoGroudByAsignatura();
	
	@Query("SELECT COUNT(*) FROM Matricula m JOIN Alumno a on m.idAlumno = a.id WHERE a.sexo = :sexo")
	Long countMatriculasAlumnosBySexo(@Param("sexo") String sexo);
}
