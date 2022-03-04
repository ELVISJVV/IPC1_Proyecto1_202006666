/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Biblioteca;
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
public class VerBibliografias  extends JFrame{
 ///private String[] columnas; //Columnas de la tabla, referencia 
  // private String[][] datos; //Datos presentados en la tabla  

    private JPanel panel;
    private JLabel usuario;
    private JButton atras;
     private JTable tbBiblio;
     private DefaultTableModel modelo;
   // private JScrollPane scroll;
  private String columnas[] = { "Tipo","Autor", "Titulo",  "Descripcion", "Edición", "Temas", "Frecuencia Actual","Ejemplares","Área","Copias","Disponibles"}; //Listado de columnas/encabezados
      public  String datos[][] = Biblioteca.obtenerDatos(); //Llamada al método estático obtener datos, de la clase Tienda. Recibe el arreglo de lecturas construido.

    public VerBibliografias (){
         setTitle("                                                                                                                                     VER USUARIOS ");
       
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
          /*
         modelo = new DefaultTableModel();

        //modelo.addColumn("NO.");
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Usuario");
        modelo.addColumn("Rol");
        modelo.addColumn("Contraseña");

        String[] matriz = new String[6];
        matriz[0] = Static.idAlmacenado[Static.usuarioCreado];

        matriz[1] = Static.nombreAlmacenado[Static.usuarioCreado];
        matriz[2] = Static.apellidoAlmacenado[Static.usuarioCreado];
        matriz[3] = Static.usuarioAlmacenado[Static.usuarioCreado];
        matriz[4] = Static.rolAlmacenado[Static.usuarioCreado];
        matriz[5] = Static.contraAlmacenada[Static.usuarioCreado];

        for (int i = 0; i < Static.usuarioCreado; i++) {
            matriz[0] = Static.idAlmacenado[i];
            matriz[1] = Static.nombreAlmacenado[i];
            matriz[2] = Static.apellidoAlmacenado[i];
            matriz[3] = Static.usuarioAlmacenado[i];
            matriz[4] = Static.rolAlmacenado[i];
            matriz[5] = Static.contraAlmacenada[i];
            modelo.addRow(matriz);

        }
         */
         
        tbBiblio = new JTable(datos,columnas);
       //  tbBiblio = new JTable(modelo);

        tbBiblio.setBounds(100, 150, 1090, 4050);
        panel.add(tbBiblio);

        JScrollPane scroll = new JScrollPane(tbBiblio, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(100, 150, 1090, 450);
        panel.add(scroll);

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
