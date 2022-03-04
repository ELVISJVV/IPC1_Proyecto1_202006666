/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Elvis
 */
public class CargaIndividualRevista extends JFrame implements ItemListener {

    private JPanel panel;
    private JLabel tipo, autor, titulo, edicion, descripcion, temas, frecuencia, ejemplares, copias, disponibles;
    private JComboBox listadespegable1;

    private JButton crear, atras;
    private JTextField autor1, titulo1, edicion1, descripcion1, temas1, frecuencia1, ejemplares1, copias1, disponibles1;

    public CargaIndividualRevista() {
        setTitle("                                                                                                                                     CARGA INDIVIDUAL ");

        this.setSize(1300, 800);  //tamano de la ventana
        setMinimumSize(new Dimension(1300, 800)); // tamano minimo de ventana
        setMaximumSize(new Dimension(1300, 800));

        setLocationRelativeTo(null);// posicion de la ventana en el centro

        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarLabel();
        colocarBotones();
        colocarAreasDeTexto();
        colocarListaDespegable();
        eventoAccion();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(1300, 800);
        this.add(panel);
    }

    private void colocarListaDespegable() {
        //  String [] rol ={"Revista", "Libro", "Tesis"};
        listadespegable1 = new JComboBox<String>();
        listadespegable1.setFont(new Font("arial", 0, 25));
        listadespegable1.setBounds(270, 50, 300, 60);
        listadespegable1.addItem("Revista");
        listadespegable1.addItem("Libro");
        listadespegable1.addItem("Tesis");
        //listadespegable1.addItem("argentina");//anadir objetos a tu lista despegable
        //listadespegable1.setSelectedItem("colombia");// seleccionar el primer objeto visto
        panel.add(listadespegable1);
        listadespegable1.addItemListener(this);
    }

    private void colocarLabel() {
        tipo = new JLabel("Tipo");
        tipo.setBounds(40, 50, 200, 60);
        tipo.setFont(new Font("arial", 0, 25));
        tipo.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(tipo);

        autor = new JLabel("Autor");
        autor.setBounds(40, 150, 200, 60);
        autor.setFont(new Font("arial", 0, 25));
        autor.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(autor);

        titulo = new JLabel("Título");
        titulo.setBounds(40, 250, 200, 60);
        titulo.setFont(new Font("arial", 0, 25));
        titulo.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(titulo);

        edicion = new JLabel("Edición");
        edicion.setBounds(40, 350, 200, 60);
        edicion.setFont(new Font("arial", 0, 25));
        edicion.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(edicion);

        descripcion = new JLabel("Descripción");
        descripcion.setBounds(40, 450, 200, 60);
        descripcion.setFont(new Font("arial", 0, 25));
        descripcion.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(descripcion);

        temas = new JLabel("Temas");
        temas.setBounds(40, 550, 200, 60);
        temas.setFont(new Font("arial", 0, 25));
        temas.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(temas);

        frecuencia = new JLabel("Frecuencia");
        frecuencia.setBounds(600, 150, 200, 60);
        frecuencia.setFont(new Font("arial", 0, 25));
        frecuencia.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(frecuencia);

        ejemplares = new JLabel("Ejemplares");
        ejemplares.setBounds(600, 250, 200, 60);
        ejemplares.setFont(new Font("arial", 0, 25));
        ejemplares.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(ejemplares);

        copias = new JLabel("Copias");
        copias.setBounds(600, 350, 200, 60);
        copias.setFont(new Font("arial", 0, 25));
        copias.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(copias);

        disponibles = new JLabel("Disponibles");
        disponibles.setBounds(600, 450, 200, 60);
        disponibles.setFont(new Font("arial", 0, 25));
        disponibles.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(disponibles);

    }

    private void colocarBotones() {
        
crear = new JButton();
        crear.setText("Crear");
        crear.setBounds(430, 660, 128, 48);
        crear.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(crear);

       
        atras = new JButton();
        atras.setText("Atras");
        atras.setBounds(700, 660,128, 48);
        atras.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(atras);
    }

    private void colocarAreasDeTexto() {

        autor1 = new JTextField();
        autor1.setBounds(250 ,160, 300, 33);
        panel.add(autor1);

        titulo1 = new JTextField();
        titulo1.setBounds(250, 260, 300, 33);
        panel.add(titulo1);

        edicion1 = new JTextField();
        edicion1.setBounds(250, 360, 300, 33);
        panel.add(edicion1);

        descripcion1 = new JTextField();
        descripcion1.setBounds(250, 460, 300, 33);
        panel.add(descripcion1);
        /*
        rol1 = new JTextField();
        rol1.setBounds(300, 250, 200, 30);
        panel.add(rol1);
         */

        temas1 = new JTextField();
        temas1.setBounds(250, 560, 300, 33);
        panel.add(temas1);

        frecuencia1 = new JTextField();
        frecuencia1.setBounds(810, 160, 300, 33);
        panel.add(frecuencia1);

        ejemplares1 = new JTextField();
        ejemplares1.setBounds(810, 260, 300, 33);
        panel.add(ejemplares1);

        copias1 = new JTextField();
        copias1.setBounds(810, 360, 300, 33);
        panel.add(copias1);

        disponibles1 = new JTextField();
        disponibles1.setBounds(810, 460, 300, 33);
        panel.add(disponibles1);

       

    }

    private void eventoAccion() {

    }


    @Override
    public void itemStateChanged(ItemEvent e) {
         CargaIndividualLibro ventanaLibro = new CargaIndividualLibro();
          CargaIndividualRevista ventanaRevista = new CargaIndividualRevista();
          CargaIndividualTesis ventanaTesis = new CargaIndividualTesis();
          
           
            String seleccionado=(String)listadespegable1.getSelectedItem();
            if (seleccionado.equals("Libro")) {
                 
      ventanaTesis.setVisible(false);
       ventanaRevista.setVisible(false);
       ventanaLibro.setVisible(true);
        dispose();
                dispose();
            }  else if (seleccionado.equals("Tesis")){
                 ventanaRevista.setVisible(false);
                 ventanaLibro.setVisible(false);
                ventanaTesis.setVisible(true);
                dispose();
            }
            
      
    }

}
