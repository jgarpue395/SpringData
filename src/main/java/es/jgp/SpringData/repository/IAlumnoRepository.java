package es.jgp.SpringData.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.jgp.SpringData.models.Alumno;
import es.jgp.SpringData.models.AlumnoResponse;

public interface IAlumnoRepository extends JpaRepository<Alumno, Long>
{
	List<Alumno> findByNombre(String name);
	
	List<Alumno> findByNombreContaining(String name);
	
	List<Alumno> findByNombreAndCiudad(String name, String city);
	
	List<Alumno> findBySexo(String sex);
	
	List<AlumnoResponse> findNombreByNombreAndApellido1(String name, String apellido1);
	
	List<Alumno> findByOrderByIdDesc();
	
	@Query("Select a from Alumno a where a.ciudad=:ciudad")
	List<Alumno> findAlumnoPorCiudad(@Param("ciudad") String ciudad);
}
