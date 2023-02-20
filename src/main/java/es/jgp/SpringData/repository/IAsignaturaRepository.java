package es.jgp.SpringData.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.jgp.SpringData.models.Asignatura;
import es.jgp.SpringData.models.ProfesorAsignatura;

public interface IAsignaturaRepository extends JpaRepository<Asignatura, Long>
{
	List<Asignatura> findFirst10ByOrderByCreditosDesc();

	List<Asignatura> findByCreditosLessThan(double creditos);
	
	List<Asignatura> findByCreditosBetweenOrderByCreditosDesc(double minimo, double maxima);
	
	@Query("SELECT new es.jgp.SpringData.models.ProfesorAsignatura(p.nombre, COUNT(a)) FROM Asignatura a JOIN Profesor p on a.idProfesor = p.id GROUP BY p.nombre")
	List<ProfesorAsignatura> findNumeroAsignaturasImparteUnProfesorByNombre();
	
	@Query("SELECT DISTINCT(CONCAT(p.nombre, ' ', p.apellido1)) FROM Asignatura a JOIN Profesor p ON a.idProfesor = p.id WHERE tipo = :tipo")
	List<String> findProfesorByTipo(@Param("tipo") String tipo);
	
	@Query("SELECT DISTINCT(CONCAT(p.nombre, ' ', p.apellido1)) FROM Asignatura a JOIN Profesor p JOIN Grado g ON p.id = a.idProfesor AND a.idGrado = g.id WHERE g.nombre = :nombreGrado")
	List<String> findProfesorByGrado(@Param("nombreGrado") String nombreGrado);
}
