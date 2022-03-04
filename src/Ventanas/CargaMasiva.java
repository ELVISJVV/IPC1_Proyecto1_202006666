/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;


import Clases.Bibliografia;
import Clases.Biblioteca;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Elvis
 */
public class CargaMasiva extends JFrame {

    public JPanel plCarga; //Panel para colocar el área de texto
    public JTextArea txaEntrada; //Área de texto para entrada de productos
    public JScrollPane scpScroll; //Este panel permite tener barras de desplazamiento verticales y horizontales
    public JButton bttCargar; //Botón para cargar datos masivamente

    public CargaMasiva() {
        definirPropiedades(); //Definir propiedades de esta ventana por separado
        construirComponentes(); //Iniciar componentes desde un método separado y no directamente en el constructor
    }

    /*
    * Puede establecerse un método iniciar componentes, con el objetivo de separar la definición de los componentes del constructor.
     */
    private void definirPropiedades() {
        setTitle( "                                                                                                   Carga Masiva");
        setSize(1100, 800); 
        //setBackground(Color.gray);
             this.setResizable(false);
        setLayout(null);
        setLocationRelativeTo(this);
    }

    private void construirComponentes() {
        //Definición del panel
        plCarga = new JPanel();
        plCarga.setBounds(0, 0, 1100, 800);
       // plCarga.setBackground(Color.gray);
        plCarga.setLayout(null);
        add(plCarga);

        //Definición de area de texto
        txaEntrada = new JTextArea();

        //Definición del panel
        scpScroll = new JScrollPane(txaEntrada);
        scpScroll.setBounds(55, 50, 990, 570);
        plCarga.add(scpScroll);

        //Definición de boton cargar 
        bttCargar = new JButton("Cargar");
        bttCargar.setBounds(470 , 650, 150, 42);
        bttCargar.setFont(new Font("arial", Font.BOLD, 20));
        bttCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String entradaTexto = txaEntrada.getText(); 
                cargarBibliografias(entradaTexto); 
            }
        });
        plCarga.add(bttCargar);

    }

    /*
     * El método cargarComics proporciona obtiene un texto del área de texto y lo separa en subcadenas
     * Las subcadenas son utilizadas para ubicar colocar los valores iniciales de ciertos objetos Comic
     * Los carácteres de escape son una forma alternativa de nombrar ciertos caracteres, como saltos de linea, tabulaciones, etc.
     * No se separarán los géneros en esta parte, eso se ha implementado en la Clase Comic
     */
    public void cargarBibliografias(String texto) {

        //Se separa el texto por líneas, el carácter utilizado ("\n") es un carácter de escape que hace referencia a un salto de línea
        String[] lineasTexto = texto.split("\n");

        //Se recorre el arreglo de líneas con un bucle For Each
        for (String linea : lineasTexto) {
            String[] atributos = linea.split(";"); //Cada línea se debe separar en otras sub cadenas para obtener los atributos separados por(";")

            if (atributos.length == 11) { //Las cadénas válidas de acuerdo con la entrada del usuario, deben contener 11 atributos separados por(";")

                Bibliografia nuevaBibliografia = new Bibliografia(atributos[0], atributos[1], atributos[2], atributos[3], atributos[4], atributos[5], atributos[6], atributos[7], atributos[8], atributos[9], atributos[10]);
                Biblioteca.colocarBibliografia(nuevaBibliografia); //Se ubica el comic en un arreglo de Comics

            } else {
                System.out.println("Fila omitida, al no cumplir con la estructura de entrada"); //Mensaje en consola si existe una cadena que no tiene todos los atritutos
            }
        }

        JOptionPane.showMessageDialog(null, "Carga completa!", "Mensaje", JOptionPane.INFORMATION_MESSAGE); //Mensaje cuando finaliza la carga.

        UsuarioAdmin ventanaAdmin = new UsuarioAdmin();
        ventanaAdmin.setVisible(true);
        dispose();
        //  setVisible(false); //Ocultar esta ventana(ventana de carga masiva)

    }

}
