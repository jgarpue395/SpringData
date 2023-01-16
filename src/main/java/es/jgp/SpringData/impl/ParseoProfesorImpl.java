package es.jgp.SpringData.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jgp.SpringData.models.Profesor;
import es.jgp.SpringData.repository.IDepartamentoRepository;
import es.jgp.SpringData.repository.IProfesorRepository;
import es.jgp.SpringData.utils.Constantes;
import es.jgp.SpringData.utils.ProyectoFinalException;

@Service
public class ParseoProfesorImpl
{
	@Autowired
	private IProfesorRepository profesorRepository;

	@Autowired
	private IDepartamentoRepository departamentoRepository;

	public void parseaFichero(Scanner scanner) throws ProyectoFinalException
	{
		scanner.nextLine();

		while (scanner.hasNextLine())
		{
			String lineaDelFichero = scanner.nextLine();

			String[] lineaDelFicheroTroceada = lineaDelFichero.split(Constantes.DELIMITADOR_CSV);

			Profesor profesor = new Profesor();

			profesor.setId(Long.valueOf(lineaDelFicheroTroceada[0]));
			profesor.setNif(lineaDelFicheroTroceada[1]);
			profesor.setNombre(lineaDelFicheroTroceada[2]);
			profesor.setApellido1(lineaDelFicheroTroceada[3]);
			profesor.setApellido2(lineaDelFicheroTroceada[4]);
			profesor.setCiudad(lineaDelFicheroTroceada[5]);
			profesor.setDireccion(lineaDelFicheroTroceada[6]);
			profesor.setTelefono(lineaDelFicheroTroceada[7]);
			profesor.setFechaNacimiento(this.crearFechaDesdeString(lineaDelFicheroTroceada[8]));
			profesor.setSexo(lineaDelFicheroTroceada[9]);
			profesor.setIdDepartamento(this.departamentoRepository.findById(Long.valueOf(lineaDelFicheroTroceada[10])).get());

			System.out.println(profesor);
			//this.profesorRepository.saveAndFlush(profesor);
		}
	}
	
	private Date crearFechaDesdeString(String fechaString) throws ProyectoFinalException
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		try
		{
			return formatter.parse(fechaString);
		}
		catch (ParseException parseException)
		{
			throw new ProyectoFinalException("Fecha con formato incorrecto: " + fechaString, parseException);
		}
	}
}
