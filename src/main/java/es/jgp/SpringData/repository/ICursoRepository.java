package es.jgp.SpringData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.jgp.SpringData.models.Curso;

public interface ICursoRepository extends JpaRepository<Curso, Long> 
{

}
