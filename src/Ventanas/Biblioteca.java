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
public class Biblioteca {

    static Bibliografia[] almacenBibliografias = new Bibliografia[100];
   

    public static void colocarBibliografia(Bibliografia nuevaBibliografia) {
        for (int i = 0; i < almacenBibliografias.length; i++) {
            if (almacenBibliografias[i] == null) {
                almacenBibliografias[i] = nuevaBibliografia;
               Static.cantidadBiBibliografias++;//Incrementar la cantidad de comics con cada Comic agregado
                return;
            }
        }
    }

    

    public static void mostrarBibliografias() {
        for (Bibliografia bibliografia : almacenBibliografias) { //Recorrido For Each, para cada objeto Comic en el arreglo de objetos Comic(almacenComis)
            if (bibliografia != null) { //Evaluar si no es nulo o que de verdad exista un objeto tipo Comic en esta posición

                //Imprimier en consola los atributos del objeto Comic sin encapsulamiento
                System.out.println("Autor: " + bibliografia.getAutor()
                        + " - Titulo: " + bibliografia.getTitulo()
                        + " - Frecuencia: " + bibliografia.getFrecuancia()
                        + " - Descripción: " + bibliografia.getDescripcion()
                        + " - Temas: " + bibliografia.getTemasConcatenados()
                        + " - Copias: " + bibliografia.getStrCopias()
                        + " - Tipo: " + bibliografia.getTipo()
                        + " - ejemplares: " + bibliografia.getEjemplares()
                        + " - Edicion: " + bibliografia.getEdicion()
                        + " - Areas: " + bibliografia.getArea()
                        + " - Disponibles: " + bibliografia.getDisponibles()
                );

            }
        }
    }

    /* 
   * obtenerDatos, retorna un arreglo de dos dimensiones(matriz) con los datos de los Comics
     */
    public static String[][] obtenerDatos() {

        String[][] datos = new String[Static.cantidadBiBibliografias][11]; //Crear nueva matriz de cantidadComics filas x 7 columnas. Será retornada al final.

        int posicion = 0; //Contador de posiciones para recorr arreglo de datos y colocar en cada posición un Comic. Inicia en 0. 

        for (Bibliografia bibliografia : almacenBibliografias) //Recorrido del arreglo de Comics, para cada comic en almacenComics
        {
            if (bibliografia != null) { //Si el objeto Comic no es nulo

                //Crear nuevo arreglo de tipo String, con los atributos del objeto. 
                String[] fila = {
                    bibliografia.getTipo(),//0
                    bibliografia.getAutor(),//1
                    bibliografia.getTitulo(),//2
                    bibliografia.getDescripcion(), //3
                    bibliografia.getStrEdicion(),//4
                    bibliografia.getTemasConcatenados(), //5
                    bibliografia.getFrecuancia(), //6
                    bibliografia.getStrEjemplares(), //7
                    bibliografia.getArea(), //8
                    bibliografia.getStrCopias(), //9
                    bibliografia.getStrDisponibles() //10
                };
                datos[posicion] = fila; //Almacenar la fila en la posición actual del arreglo datos
                posicion++; //Correr una posición 
            }
        }

        return datos; //Retornar el nuevo arreglo de datos recolectados del arreglo de comics

    }

   
    
}
