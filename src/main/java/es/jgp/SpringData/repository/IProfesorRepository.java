package es.jgp.SpringData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.jgp.SpringData.models.Profesor;

public interface IProfesorRepository extends JpaRepository<Profesor, Long>
{

}
