/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: Empresa.java,v 1.3 2005/12/20 17:17:37 k-marcos Exp $
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n1_lineasTelefonicas
 * Autor: Pablo Barvo - 06-Dec-2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.lineasTelefonicas.mundo;

/**
 * Clase que representa la empresa
 */
public class Empresa
{

    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * L�nea telef�nica n�mero 1
     */
    private LineaTelefonica linea1;

    /**
     * L�nea telef�nica n�mero 2
     */
    private LineaTelefonica linea2;

    /**
     * L�nea telef�nica n�mero 3
     */
    private LineaTelefonica linea3;

    //-----------------------------------------------------------------
    // M�todos
    //-----------------------------------------------------------------

    /**
     * Inicializa las l�neas telef�nicas de la empresa <br>
     * <b>post: </b> Se inicializaron las 3 l�neas telef�nicas.
     */
    public void inicializar( )
    {
        //
        //Inicializa la l�nea 1
        linea1 = new LineaTelefonica( );
        linea1.inicializar( );
        //
        //Inicializa la l�nea 2
        linea2 = new LineaTelefonica( );
        linea2.inicializar( );

        //
        //Inicializa la l�nea 3
        linea3 = new LineaTelefonica( );
        linea3.inicializar( );

    }

    /**
     * Devuelve la l�nea 1
     * @return L�nea 1
     */
    public LineaTelefonica darLinea1( )
    {
        return linea1;
    }

    /**
     * Devuelve la l�nea 2
     * @return L�nea 2
     */
    public LineaTelefonica darLinea2( )
    {
        return linea2;
    }

    /**
     * Devuelve la l�nea 3
     * @return L�nea 3
     */
    public LineaTelefonica darLinea3( )
    {
        return linea3;
    }

    /**
     * Agrega una llamada local a la l�nea telef�nica 1 <br>
     * <b>post: </b> Se agrega la llamada a la l�nea 1
     * @param minutos N�mero de minutos de la llamada. minutos > 0.
     */
    public void agregarLlamadaLocalLinea1( int minutos )
    {
        linea1.agregarLlamadaLocal( minutos );
    }

    /**
     * Agrega una llamada local a la l�nea telef�nica 2 <br>
     * <b>post: </b> Se agrega la llamada a la l�nea 2
     * @param minutos N�mero de minutos de la llamada. minutos > 0.
     */
    public void agregarLlamadaLocalLinea2( int minutos )
    {
        linea2.agregarLlamadaLocal( minutos );
    }

    /**
     * Agrega una llamada local a la l�nea telef�nica 3 <br>
     * <b>post: </b> Se agrega la llamada a la l�nea 3
     * @param minutos N�mero de minutos de la llamada. minutos > 0.
     */
    public void agregarLlamadaLocalLinea3( int minutos )
    {
        linea3.agregarLlamadaLocal( minutos );
    }

    /**
     * Agrega una llamada de larga distancia a la l�nea telef�nica 1 <br>
     * <b>post: </b> Se agrega la llamada a la l�nea 1
     * @param minutos N�mero de minutos de la llamada. minutos > 0.
     */
    public void agregarLlamadaLargaDistanciaLinea1( int minutos )
    {
        linea1.agregarLlamadaLargaDistancia( minutos );
    }

    /**
     * Agrega una llamada de larga distancia a la l�nea telef�nica 2 <br>
     * <b>post: </b> Se agrega la llamada a la l�nea 2
     * @param minutos N�mero de minutos de la llamada. minutos > 0.
     */
    public void agregarLlamadaLargaDistanciaLinea2( int minutos )
    {
        linea2.agregarLlamadaLargaDistancia( minutos );
    }

    /**
     * Agrega una llamada de larga distancia a la l�nea telef�nica 3 <br>
     * <b>post: </b> Se agrega la llamada a la l�nea 3
     * @param minutos N�mero de minutos de la llamada. minutos > 0.
     */
    public void agregarLlamadaLargaDistanciaLinea3( int minutos )
    {
        linea3.agregarLlamadaLargaDistancia( minutos );
    }

    /**
     * Agrega una llamada a celular a la l�nea telef�nica 1 <br>
     * <b>post: </b> Se agrega la llamada a la l�nea 1
     * @param minutos N�mero de minutos de la llamada. minutos > 0.
     */
    public void agregarLlamadaCelularLinea1( int minutos )
    {
        linea1.agregarLlamadaCelular( minutos );
    }

    /**
     * Agrega una llamada a celular a la l�nea telef�nica 2 <br>
     * <b>post: </b> Se agrega la llamada a la l�nea 2
     * @param minutos N�mero de minutos de la llamada. minutos > 0.
     */
    public void agregarLlamadaCelularLinea2( int minutos )
    {
        linea2.agregarLlamadaCelular( minutos );
    }

    /**
     * Agrega una llamada a celular a la l�nea telef�nica 3 <br>
     * <b>post: </b> Se agrega la llamada a la l�nea 3
     * @param minutos N�mero de minutos de la llamada. minutos > 0.
     */
    public void agregarLlamadaCelularLinea3( int minutos )
    {
        linea3.agregarLlamadaCelular( minutos );
    }

    /**
     * Devuelve el n�mero total de llamadas realizadas
     * @return total de llamadas de las tres l�neas
     */
    public int darTotalNumeroLlamadas( )
    {
        return linea1.darNumeroLlamadas()+linea2.darNumeroLlamadas()+linea3.darNumeroLlamadas();
    }

    /**
     * Devuelve el total de minutos consumidos
     * @return total de minutos de las tres l�neas
     */
    public int darTotalMinutos( )
    {
        return linea1.darNumeroMinutos()+linea2.darNumeroMinutos()+linea3.darNumeroMinutos();
    }

    /**
     * Devuelve el costo total de las llamadas realizadas
     * @return costo total de las tres l�neas
     */
    public double darTotalCostoLlamadas( )
    {        
        return linea1.darCostoLlamadas()+linea2.darCostoLlamadas()+linea3.darCostoLlamadas();
    }

    /**
     * Devuelve el costo promedio de un minuto, seg�n los minutos consumidos <br>
     * <b>pre: </b> TotalMinutos > 0
     * @return Costo promedio por minuto.
     */
    public double darCostoPromedioMinuto( )
    {
        return darTotalCostoLlamadas()/darTotalMinutos();
    }

    /**
     * Reinicia todas las l�neas telef�nicas.
     */
    public void reiniciar( )
    {
        linea1.reiniciar( );
        linea2.reiniciar( );
        linea3.reiniciar( );

    }

    //-----------------------------------------------------------------
    // Puntos de Extensi�n
    //-----------------------------------------------------------------

    /**
     * M�todo para la extensi�n 1
     * @return Respuesta 1
     */
    public String metodo1( )
    {
        return "Respuesta 1";
    }

    /**
     * M�todo para la extensi�n 2
     * @return Respuesta 2
     */
    public String metodo2( )
    {
        return "Respuesta 2";
    }

}