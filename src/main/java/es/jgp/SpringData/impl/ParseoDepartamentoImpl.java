package es.jgp.SpringData.impl;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jgp.SpringData.models.Departamento;
import es.jgp.SpringData.repository.IDepartamentoRepository;
import es.jgp.SpringData.utils.Constantes;
import es.jgp.SpringData.utils.ProyectoFinalException;

@Service
public class ParseoDepartamentoImpl
{
	@Autowired
	private IDepartamentoRepository departamentoRepository;

	public void parseaFichero(Scanner scanner) throws ProyectoFinalException
	{
		scanner.nextLine();

		while (scanner.hasNextLine())
		{
			String lineaDelFichero = scanner.nextLine();

			String[] lineaDelFicheroTroceada = lineaDelFichero.split(Constantes.DELIMITADOR_CSV);

			Departamento departamento = new Departamento();

			departamento.setId(Long.valueOf(lineaDelFicheroTroceada[0]));
			departamento.setNombre(lineaDelFicheroTroceada[1]);

			System.out.println(departamento);
			//this.departamentoRepository.saveAndFlush(departamento);
		}
	}
}
