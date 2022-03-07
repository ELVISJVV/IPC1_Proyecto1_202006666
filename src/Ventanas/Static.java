/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author Elvis
 */
class Static {

    static String[] idAlmacenado = new String[100];

    static String[] nombreAlmacenado = new String[100];
    static String[] apellidoAlmacenado = new String[100];
    static String[] usuarioAlmacenado = new String[100];
    static String[] rolAlmacenado = new String[100];
    static String[] contraAlmacenada = new String[100];
    static String[] confirmarcontraAlmacenada = new String[100];
    static int matriz[];

    static int usuarioCreado = 0;
    static int contadorid = 0;
    static int contadornombre = 0;
    static int contadorapellido = 0;
    static int contadorusuario = 0;
    static int contadorrol = 0;
    static int contadorcontra = 0;
    static int contadorconfirmarcontra = 0;

    static String USUARIONORMAL = "";

    static String[] tipoAlmacenado = new String[100];
    static String[] autorAlmacenado = new String[100];
    static String[] tituloAlmacenado = new String[100];
    static String[] descripcionAlmacenado = new String[100];
    static String[] edicionAlmacenado = new String[100];
    static String[] temasAlmacenados = new String[100];
    static String[] frecuenciaAlmacenado = new String[100];
    static String[] ejemplaresAlmacenado = new String[100];
    static String[] areaAlmacenado = new String[100];
    static String[] copiasAlmacenado = new String[100];
    static String[] disponiblesAlmacenado = new String[100];
    static int bibliografiaCreada = 0;

    static int cantidadBiBibliografias = 0;//por el momento no se usa
    static String datos[][] = Biblioteca.obtenerDatos();

    
    //Prestamos de libros
    static String[] hora=new String[100];
    static String[] usuarioPrestamo=new String[100];
    static String[] tituloPrestamo=new String[100];
    static String[] tipoPrestamo=new String[100];
    static int prestamoRealizado=0;
    
    
    
    
}
