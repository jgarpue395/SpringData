package es.jgp.SpringData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.jgp.SpringData.models.Departamento;

public interface IDepartamentoRepository extends JpaRepository<Departamento, Long> 
{

}
