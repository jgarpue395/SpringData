package es.jgp.SpringData.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.jgp.SpringData.models.Profesor;
import es.jgp.SpringData.models.ProfesorJoinDepartamento;

public interface IProfesorRepository extends JpaRepository<Profesor, Long>
{
	@Query(value = "SELECT new es.jgp.SpringData.models.ProfesorJoinDepartamento(p.nombre, p.apellido1, p.apellido2, d.nombre) FROM Profesor p JOIN p.idDepartamento d")
	List<ProfesorJoinDepartamento> findProfesorJoinDepartamento();
	
	@Query(value = "SELECT p FROM Profesor p JOIN p.idDepartamento d WHERE d.nombre LIKE %:nombre%")
	List<Profesor> findProfesorJoinDepartamentoByNombre(@Param("nombre") String nombre);
}
