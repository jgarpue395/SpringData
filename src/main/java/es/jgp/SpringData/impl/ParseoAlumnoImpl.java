package es.jgp.SpringData.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jgp.SpringData.models.Alumno;
import es.jgp.SpringData.repository.IAlumnoRepository;
import es.jgp.SpringData.utils.Constantes;
import es.jgp.SpringData.utils.ProyectoFinalException;

@Service
public class ParseoAlumnoImpl
{
	@Autowired
	private IAlumnoRepository alumnoRepository;

	public void parseaFichero(Scanner scanner) throws ProyectoFinalException
	{
		scanner.nextLine();

		while (scanner.hasNextLine())
		{
			String lineaDelFichero = scanner.nextLine();

			String[] lineaDelFicheroTroceada = lineaDelFichero.split(Constantes.DELIMITADOR_CSV);

			Alumno alumno = new Alumno();

			alumno.setId(Long.valueOf(lineaDelFicheroTroceada[0]));
			alumno.setNif(lineaDelFicheroTroceada[1]);
			alumno.setNombre(lineaDelFicheroTroceada[2]);
			alumno.setApellido1(lineaDelFicheroTroceada[3]);
			alumno.setApellido2(lineaDelFicheroTroceada[4]);
			alumno.setCiudad(lineaDelFicheroTroceada[5]);
			alumno.setDireccion(lineaDelFicheroTroceada[6]);
			alumno.setTelefono(lineaDelFicheroTroceada[7]);
			alumno.setFechaNacimiento(this.crearFechaDesdeString(lineaDelFicheroTroceada[8]));
			alumno.setSexo(lineaDelFicheroTroceada[9]);

			System.out.println(alumno);
			//this.alumnoRepository.saveAndFlush(alumno);
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