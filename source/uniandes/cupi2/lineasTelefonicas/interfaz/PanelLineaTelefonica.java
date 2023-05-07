/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: PanelLineaTelefonica.java,v 1.2 2005/12/20 17:17:36 k-marcos Exp $ 
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co) (http://cupi2.uniandes.edu.co)
 * Ejercicio:  n1_lineasTelefonicas
 * Im�genes tomadas de: http://www.shopnbu.com/classic-phones/crosley-retro-classic-1950-desk-phone-ivory-1950-desk-iv.shtml
 * Autor: Pablo Barvo - Dec 6, 2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.lineasTelefonicas.interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import uniandes.cupi2.lineasTelefonicas.mundo.LineaTelefonica;

/**
 * Panel con la informaci�n de una l�nea telef�nica
 */
public class PanelLineaTelefonica extends JPanel implements ActionListener
{

    //-----------------------------------------------------------------
    // Constantes
    //-----------------------------------------------------------------

    /**
     * Comando Agregar llamada
     */
    private static final String AGREGAR = "AGREGAR";

    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * Ventana principal de la aplicaci�n
     */
    private InterfazLineasTelefonicas principal;

    /**
     * N�mero del l�nea telef�nica
     */
    private int numeroLinea;

    //-----------------------------------------------------------------
    // Atributos de Interfaz
    //-----------------------------------------------------------------

    /**
     * Etiqueta con la imagen del tel�fono
     */
    private JLabel etiquetaImagen;

    /**
     * Etiqueta costo de llamadas
     */
    private JLabel etiquetaCosto;

    /**
     * Etiqueta n�mero de llamadas
     */
    private JLabel etiquetaNumeroLlamadas;

    /**
     * Etiqueta minutos consumidos
     */
    private JLabel etiquetaMinutos;

    /**
     * Bot�n Agregar llamada
     */
    private JButton btnAgregar;

    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------

    /**
     * Constructor del panel
     * @param laPrincipal Ventana principal. laPrincipal != null.
     * @param elNumeroLinea N�mero de la l�nea.
     */
    public PanelLineaTelefonica( InterfazLineasTelefonicas laPrincipal, int elNumeroLinea )
    {
        principal = laPrincipal;
        numeroLinea = elNumeroLinea;
        setBorder( new TitledBorder( "Linea #" + numeroLinea ) );
        setLayout( new GridBagLayout( ) );
        setPreferredSize( new Dimension( 260, 220 ) );

        //
        //Etiqueta de Imagen
        ImageIcon icono = new ImageIcon( "data/linea" + numeroLinea + ".jpg" );
        etiquetaImagen = new JLabel( "" );
        etiquetaImagen.setIcon( icono );
        etiquetaImagen.setBorder( new TitledBorder( "" ) );

        //
        //Etiqueta Costo
        etiquetaCosto = new JLabel( formatearValor( 0 ) );
        etiquetaCosto.setForeground( Color.BLUE.darker( ) );
        etiquetaCosto.setFont( new Font( "Tahoma", Font.BOLD, 20 ) );

        //
        //Etiqueta N�mero de llamadas
        etiquetaNumeroLlamadas = new JLabel( "Numero Llamadas: 0" );

        //Etiqueta Total de Minutos
        etiquetaMinutos = new JLabel( "Numero de Minutos: 0" );

        //
        //Bot�n Agregar llamada
        btnAgregar = new JButton( "Agregar Llamada" );
        btnAgregar.setPreferredSize( new Dimension( 150, 25 ) );
        btnAgregar.setActionCommand( AGREGAR );
        btnAgregar.addActionListener( this );

        //
        //Organizaci�n
        GridBagConstraints posicion = new GridBagConstraints( 0, 0, 2, 2, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( etiquetaImagen, posicion );

        posicion = new GridBagConstraints( 2, 0, 4, 2, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( etiquetaCosto, posicion );

        posicion = new GridBagConstraints( 0, 2, 6, 2, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( etiquetaNumeroLlamadas, posicion );

        posicion = new GridBagConstraints( 0, 4, 6, 2, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( etiquetaMinutos, posicion );

        posicion = new GridBagConstraints( 0, 6, 6, 2, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( btnAgregar, posicion );
    }

    //-----------------------------------------------------------------
    // M�todos
    //-----------------------------------------------------------------

    /**
     * Actualiza la visualizaci�n de la informaci�n
     * @param linea L�nea telef�nica donde se saca la informaci�n. linea != null.
     */
    public void actualizar( LineaTelefonica linea )
    {
        etiquetaCosto.setText( formatearValor( linea.darCostoLlamadas( ) ) );
        etiquetaNumeroLlamadas.setText( "Numero Llamadas: " + formatearValorEntero( linea.darNumeroLlamadas( ) ) );
        etiquetaMinutos.setText( "Numero de Minutos: " + formatearValorEntero( linea.darNumeroMinutos( ) ) );
    }

    /**
     * Formatea un valor num�rico para presentar en la interfaz.
     * @param valor Valor num�rico a ser formateado
     * @return Cadena con el valor formateado con puntos y signos.
     */
    private String formatearValor( double valor )
    {
        DecimalFormat df = ( DecimalFormat )NumberFormat.getInstance( );
        df.applyPattern( "$ ###,###.##" );
        df.setMinimumFractionDigits( 2 );
        return df.format( valor );
    }

    /**
     * Formatea un valor num�rico para presentar en la interfaz <br>
     * @param valor Valor num�rico a ser formateado
     * @return Retorna una cadena con el valor formateado con puntos y signos.
     */
    private String formatearValorEntero( int valor )
    {
        DecimalFormat df = ( DecimalFormat )NumberFormat.getInstance( );
        df.applyPattern( " ###,###" );
        df.setMinimumFractionDigits( 0 );
        return df.format( valor );
    }

    /**
     * Manejo de eventos del usuario
     * @param e Evento de usuario. e != null.
     */
    public void actionPerformed( ActionEvent e )
    {
        if( AGREGAR.equals( e.getActionCommand( ) ) )
        {
            principal.agregarLlamada( numeroLinea );
        }
    }

}
