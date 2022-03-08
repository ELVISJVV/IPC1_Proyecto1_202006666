/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Ventanas.Biblioteca;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elvis
 */
public class VerBibliografias extends JFrame {
    ///private String[] columnas; //Columnas de la tabla, referencia 
    // private String[][] datos; //Datos presentados en la tabla  

    private JPanel panel;
    private JLabel usuario;
    private JButton atras;
    private JTable tbBiblio;
    private DefaultTableModel modelo;
    // private JScrollPane scroll;
    //private String columnas[] = { "Tipo","Autor", "Titulo",  "Descripcion", "Edición", "Temas", "Frecuencia Actual","Ejemplares","Área","Copias","Disponibles"}; //Listado de columnas/encabezados
    //Llamada al método estático obtener datos, de la clase Tienda. Recibe el arreglo de lecturas construido.

    public VerBibliografias() {
        setTitle("                                                                                                                                     VER BIBLIOGRAFIAS  ");

        this.setSize(1300, 800);  //tamano de la ventana
        setMinimumSize(new Dimension(1300, 800)); // tamano minimo de ventana
        setMaximumSize(new Dimension(1300, 800));
        this.setResizable(false);
        setLocationRelativeTo(null);// posicion de la ventana en el centro
        iniciarComponentes();
        // iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarBotones();
        colocarLabel();

        colocarTablas();

        //colocarAreasDeTexto();
        eventoAccion();
    }

    // VerBibliografias tabla= new VerBibliografias(datos,columnas);
    // tabla.setVisible(true);
    /*
      public VerBibliografias( String[][] datos, String[] columnas){
         // this.columnas= columnas;
         // this.datos= datos;
            colocarPanel();
     //   colocarBotones();
        colocarLabel();
          // eventoAccion();
      }
     */
    private void colocarPanel() {

        panel = new JPanel();
        panel.setLayout(null);
        //panel.setSize(1300, 800);
        this.add(panel);

    }

    private void colocarTablas() {

        modelo = new DefaultTableModel();

        modelo.addColumn("No.");
        modelo.addColumn("Tipo");
        modelo.addColumn("Autor");
        modelo.addColumn("Titulo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Edicion");
        modelo.addColumn("Temas");
        modelo.addColumn("Frecuencia");
        modelo.addColumn("Ejemplares");
        modelo.addColumn("Area");
        modelo.addColumn("Copias");
        modelo.addColumn("Disponibles");

        String[] matriz = new String[12];

        matriz[0] = Static.tipoAlmacenado[Static.bibliografiaCreada];
        matriz[1] = Static.autorAlmacenado[Static.bibliografiaCreada];
        matriz[2] = Static.tituloAlmacenado[Static.bibliografiaCreada];
        matriz[3] = Static.descripcionAlmacenado[Static.bibliografiaCreada];
        matriz[4] = Static.edicionAlmacenado[Static.bibliografiaCreada];
        matriz[5] = Static.temasAlmacenados[Static.bibliografiaCreada];
        matriz[6] = Static.frecuenciaAlmacenado[Static.bibliografiaCreada];
        matriz[7] = Static.ejemplaresAlmacenado[Static.bibliografiaCreada];
        matriz[8] = Static.areaAlmacenado[Static.bibliografiaCreada];
        matriz[9] = Static.copiasAlmacenado[Static.bibliografiaCreada];
        matriz[10] = Static.disponiblesAlmacenado[Static.bibliografiaCreada];

        for (int i = 0; i < Static.bibliografiaCreada; i++) {

            String numCadena = String.valueOf(i);
            matriz[0] = numCadena;
            String tipos =Static.tipoAlmacenado[i];
                    if (tipos.equals("0")) {
                        tipos="Libro";
                    } else if (tipos.equals("1")) {
                        tipos="Revista";
                    } else if (tipos.equals("2")) {
                        tipos="Tesis";
                    }
            matriz[1] = tipos;
            matriz[2] = Static.autorAlmacenado[i];
            matriz[3] = Static.tituloAlmacenado[i];
            matriz[4] = Static.descripcionAlmacenado[i];
            matriz[5] = Static.edicionAlmacenado[i];
            matriz[6] = Static.temasAlmacenados[i];
            matriz[7] = Static.frecuenciaAlmacenado[i];
            matriz[8] = Static.ejemplaresAlmacenado[i];
            matriz[9] = Static.areaAlmacenado[i];
            matriz[10] = Static.copiasAlmacenado[i];
            matriz[11] = Static.disponiblesAlmacenado[i];
            modelo.addRow(matriz);

        }
        JTable tabla = new JTable(modelo);

        tabla.setBounds(15, 150, 1260, 4050);
        tabla.setEnabled(false);
        panel.add(tabla);

        JScrollPane scroll = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(15, 150, 1260, 450);
        panel.add(scroll);

        //   Static.datos=Biblioteca.obtenerDatos();
        //  tbBiblio = new JTable(Static.datos,columnas);
        //  tbBiblio = new JTable(modelo);
        //   tbBiblio.setBounds(100, 150, 1090, 4050);
        //  panel.add(tbBiblio);
        //  JScrollPane scroll = new JScrollPane(tbBiblio, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //  scroll.setBounds(100, 150, 1090, 450);
        //  panel.add(scroll);
        //String matriz[]=new String [];
    }

    private void colocarLabel() {

        usuario = new JLabel("Listado de Bibliografias");
        usuario.setBounds(450, 50, 400, 60);
        usuario.setFont(new Font("arial", 0, 35));
        usuario.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(usuario);

        //panel.add(bibliografia);
        /*
         tbBiblio = new JTable(datos,columnas);
       
        JTable tabla = new JTable(modelo);

       tbBiblio.setBounds(100, 150, 1090, 4050);
        panel.add(tbBiblio);

        
      JScrollPane scroll = new JScrollPane(tbBiblio, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       scroll = new JScrollPane(tbBiblio);
       
       scroll.setBounds(100, 150, 1200, 700);
        panel.add(scroll);
         */
        //Columnas y filas de la tabla
        // String columnas[] = { "Tipo","Autor", "Titulo",  "Descripcion", "Edición", "Temas", "Frecuencia Actual","Ejemplares","Área","Copias","Disponibles"}; //Listado de columnas/encabezados
        //      String datos[][] = Biblioteca.obtenerDatos(); //Llamada al método estático obtener datos, de la clase Tienda. Recibe el arreglo de lecturas construido.
        //   fmTabla = new VerBibliografias(datos,columnas); //Creación de objeto tipo TablaLectura, pasando como parámetros los datos y las columnas recuperadas
        //     fmTabla.setVisible(true); //Se hace visible el Fram(TablaLecturas)
        //String matriz[]=new String [];
    }

    private void colocarBotones() {
        atras = new JButton();
        atras.setText("Regresar");
        atras.setBounds(50, 50, 120, 42);
        atras.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(atras);

    }

    private void eventoAccion() {
        ActionListener eventoAtras = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                UsuarioAdmin ventanaAdmin = new UsuarioAdmin();
                ventanaAdmin.setVisible(true);
                dispose();

            }

        };
        atras.addActionListener(eventoAtras);
    }

}
