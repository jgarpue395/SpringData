package es.jgp.SpringData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.jgp.SpringData.models.Matricula;
import es.jgp.SpringData.models.MatriculaId;

public interface IMatriculaRepository extends JpaRepository<Matricula, MatriculaId> 
{

}
