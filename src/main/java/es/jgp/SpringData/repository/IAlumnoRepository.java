package es.jgp.SpringData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.jgp.SpringData.models.Alumno;

public interface IAlumnoRepository extends JpaRepository<Alumno, Long>
{

}
