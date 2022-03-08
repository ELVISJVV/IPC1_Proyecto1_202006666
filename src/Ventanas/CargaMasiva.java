/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;



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

    public JPanel plCarga; 
    public JTextArea txaEntrada; 
    public JScrollPane scpScroll; 
    public JButton bttCargar,btnsalir; 

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
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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
        txaEntrada.setFont(new Font("arial", 0, 15));
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
        
         btnsalir = new JButton(" Atras ");
        btnsalir.setBounds(900 , 650, 150, 42);
        btnsalir.setFont(new Font("arial", Font.BOLD, 20));
        btnsalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   UsuarioAdmin ventanaAdmin = new UsuarioAdmin();
                  ventanaAdmin.setVisible(true);
                  dispose();
            }
        });
        plCarga.add(btnsalir);

    }

    
    public void cargarBibliografias(String texto) {

        String[] lineasTexto = texto.split("\n");

        for (String linea : lineasTexto) {
            String[] atributos = linea.split(";"); 

            if (atributos.length == 11) { 

                Static.tipoAlmacenado[Static.bibliografiaCreada]=atributos[0];
                Static.autorAlmacenado[Static.bibliografiaCreada]=atributos[1];
                Static.tituloAlmacenado[Static.bibliografiaCreada]=atributos[2];
                Static.descripcionAlmacenado[Static.bibliografiaCreada]=atributos[3];
                Static.edicionAlmacenado[Static.bibliografiaCreada]=atributos[4];
                Static.temasAlmacenados[Static.bibliografiaCreada]=atributos[5];
                Static.frecuenciaAlmacenado[Static.bibliografiaCreada]=atributos[6];
                Static.ejemplaresAlmacenado[Static.bibliografiaCreada]=atributos[7];
                Static.areaAlmacenado[Static.bibliografiaCreada]=atributos[8];
                Static.copiasAlmacenado[Static.bibliografiaCreada]=atributos[9];
                Static.disponiblesAlmacenado[Static.bibliografiaCreada]=atributos[10];
                
                
                Static.bibliografiaCreada++;

            } else {
                System.out.println("Fila omitida, al no cumplir con la estructura de entrada"); 
            }
        }

        JOptionPane.showMessageDialog(null, "La carga ha sido completada", "Mensaje", JOptionPane.INFORMATION_MESSAGE); //Mensaje cuando finaliza la carga.

        UsuarioAdmin ventanaAdmin = new UsuarioAdmin();
        ventanaAdmin.setVisible(true);
        dispose();
        //  setVisible(false); //Ocultar esta ventana(ventana de carga masiva)

    }

}
