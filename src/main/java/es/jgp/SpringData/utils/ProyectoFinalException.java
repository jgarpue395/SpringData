package es.jgp.SpringData.utils;

public class ProyectoFinalException extends Exception
{

	/** Serial Version UID */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor vacio
	 */
	public ProyectoFinalException()
	{
		super() ;
	}
	
	/**
	 * @param mensaje con un mensaje
	 */
	public ProyectoFinalException(String mensaje)
	{
		super(mensaje) ;
	}
	
	/**
	 * @param mensaje con un mensaje
	 * @param cause   con la causa
	 */	
    public ProyectoFinalException(String message, Throwable cause)
    {
        super(message, cause) ;
    }
}
