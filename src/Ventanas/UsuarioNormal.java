/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elvis
 */
public class UsuarioNormal extends JFrame {

    private JPanel panel;
    private JLabel usuario, nameUsuario;

    private JTextArea area1, area2, area4;
    private JButton btnBuscar, prestar, btnPrestamos, btnLogout;
    private JTextField buscarTma;
    private DefaultTableModel modelo;

    public UsuarioNormal() {
        setTitle("                                                                                                                                     USUARIO NORMAL ");

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
        colocarLabel();
        colocarBotones();
        // colocarTabla();
        colocarAreasDeTexto();
        eventoBuscar();
        eventoAccion();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(1300, 800);
        this.add(panel);

    }

    private void colocarLabel() {
        usuario = new JLabel("Usuarios");
        usuario.setBounds(30, 400, 200, 60);
        usuario.setFont(new Font("arial", 0, 25));
        usuario.setHorizontalAlignment(SwingConstants.LEFT);
        //panel.add(usuario);

        nameUsuario = new JLabel(Static.USUARIONORMAL);
        //nameUsuario.setBackground(new Color(0, 00, 00, 0));
        nameUsuario.setBounds(900, 60, 150, 100);
        nameUsuario.setFont(new Font("arial", 0, 25));
        //nameUsuario.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        //nameUsuario.setEditable(false);//editar el area de texto
        panel.add(nameUsuario);

        //final ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/login.PNG"));

      //  JLabel imagenUsuario = new JLabel();
      //  imagenUsuario.setBounds(720, 50, 120, 120);
     //   imagenUsuario.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(imagenUsuario.getWidth(), imagenUsuario.getHeight(), Image.SCALE_SMOOTH)));

     //   panel.add(imagenUsuario);

      //  final ImageIcon imagen2 = new ImageIcon(getClass().getResource("/Imagenes/logo.PNG"));
//
    //    JLabel imagenLogo = new JLabel();
   //     imagenLogo.setBounds(20, 80, 600, 200);
   //     imagenLogo.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(imagenLogo.getWidth(), imagenLogo.getHeight(), Image.SCALE_SMOOTH)));

   //     panel.add(imagenLogo);
    }

    private void colocarAreasDeTexto() {

        area1 = new JTextArea();
        area1.setBackground(new Color(0, 0, 0, 0));
        area1.setBounds(20, 40, 600, 250);
        area1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        area1.setEditable(false);//editar el area de texto
        panel.add(area1);

        area2 = new JTextArea();
        area2.setBackground(new Color(0, 0, 0, 0));
        area2.setBounds(20, 400, 1250, 300);
        area2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        area2.setEditable(false);//editar el area de texto
        //panel.add(area2);

        area4 = new JTextArea();
        area4.setBackground(new Color(0, 0, 0, 0));
        area4.setBounds(660, 40, 600, 150);
        area4.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        area4.setEditable(false);//editar el area de texto
        panel.add(area4);

        buscarTma = new JTextField();
        //buscarTma.setBackground(new Color(0, 0, 0, 0));
        buscarTma.setBounds(350, 320, 250, 42);
        //buscarTma.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        buscarTma.setEditable(true);//editar el area de texto
        panel.add(buscarTma);

        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20, 400, 1250, 300);
        // anade mas texto al area
        areaTexto.setEditable(false);//editar el area de texto

        //System.out.println("texto en la caja" + areaTexto.getText());
        panel.add(areaTexto);

        //Barras de desplazamiento
        JScrollPane barrasDesplazamiento = new JScrollPane(areaTexto, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barrasDesplazamiento.setBounds(20, 400, 1250, 300);

        //barrasDesplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        //barrasDesplazamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(barrasDesplazamiento);

    }

    private void colocarTabla() {
        modelo = new DefaultTableModel();

        //modelo.addColumn("NO.");
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
        //  modelo.addColumn("Prestar");

        String[] matriz = new String[11];
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
            matriz[0] = Static.tipoAlmacenado[i];
            matriz[1] = Static.autorAlmacenado[i];
            matriz[2] = Static.tituloAlmacenado[i];
            matriz[3] = Static.descripcionAlmacenado[i];
            matriz[4] = Static.edicionAlmacenado[i];
            matriz[5] = Static.temasAlmacenados[i];
            matriz[6] = Static.frecuenciaAlmacenado[i];
            matriz[7] = Static.ejemplaresAlmacenado[i];
            matriz[8] = Static.areaAlmacenado[i];
            matriz[9] = Static.copiasAlmacenado[i];
            matriz[10] = Static.disponiblesAlmacenado[i];
            modelo.addRow(matriz);

        }
        JTable tabla = new JTable(modelo);
        //tabla.getColumnModel().getColumn(12);
        // tabla.setCellEditor(tabla.getDefaultEditor(Boolean.class));

        tabla.setBounds(20, 400, 1250, 300);
        panel.add(tabla);

        JScrollPane scroll = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 400, 1250, 300);
        panel.add(scroll);

    }

    private void colocarBotones() {
        btnLogout = new JButton();
        btnLogout.setText("Logout");
        btnLogout.setBounds(1100, 90, 120, 42);
        btnLogout.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(btnLogout);

        // botones area 2 abajo izquierda
        btnBuscar = new JButton();
        btnBuscar.setText("Buscar");
        btnBuscar.setBounds(110, 320, 200, 42);
        btnBuscar.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(btnBuscar);

        btnPrestamos = new JButton();
        btnPrestamos.setText("Ver Prestamos");
        btnPrestamos.setBounds(1019, 320, 200, 42);
        btnPrestamos.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(btnPrestamos);

        prestar = new JButton();
        prestar.setText("Prestar");
        prestar.setBounds(780, 320, 200, 42);
        prestar.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(prestar);

    }

    private void eventoAccion() {

        ActionListener eventoLogout = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PantallaInicio ventanaInicio = new PantallaInicio();
                ventanaInicio.setVisible(true);
                dispose();
            }

        };
        btnLogout.addActionListener(eventoLogout);

        ActionListener eventoPrestar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Prestar ventanaPrestar = new Prestar();
                ventanaPrestar.setVisible(true);
                dispose();

            }

        };
        prestar.addActionListener(eventoPrestar);

        ActionListener eventoVerPrestamos = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ListadoPrestamos ventanaListaPres = new ListadoPrestamos();
                ventanaListaPres.setVisible(true);
                dispose();

            }

        };
        btnPrestamos.addActionListener(eventoVerPrestamos);
    }

    private void eventoBuscar() {
        ActionListener eventofiltro = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String filtro = buscarTma.getText();
                System.out.println(filtro);
                modelo = new DefaultTableModel();

                //modelo.addColumn("NO.");
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
                //  modelo.addColumn("Prestar");

                String[] matriz = new String[11];

                int cant = Static.bibliografiaCreada;
                for (int i = 0; i < Static.bibliografiaCreada; i++) {
                    String a = Static.temasAlmacenados[i];
                    String[] b = a.split(",");
                    String[] x = new String[3];
                    // x[0]=b[0];
                    //   x[1]=b[1];
                    //  x[2]=b[2];

                    System.out.println(a);
                    // for (int j = 0; j < x.length; j++) {
                    if (Static.temasAlmacenados[i].toLowerCase().contains(filtro.toLowerCase())) {
                        System.out.println("si se encontro");
                        matriz[0] = Static.tipoAlmacenado[i];
                        matriz[1] = Static.autorAlmacenado[i];
                        matriz[2] = Static.tituloAlmacenado[i];
                        matriz[3] = Static.descripcionAlmacenado[i];
                        matriz[4] = Static.edicionAlmacenado[i];
                        matriz[5] = Static.temasAlmacenados[i];
                        matriz[6] = Static.frecuenciaAlmacenado[i];
                        matriz[7] = Static.ejemplaresAlmacenado[i];
                        matriz[8] = Static.areaAlmacenado[i];
                        matriz[9] = Static.copiasAlmacenado[i];
                        matriz[10] = Static.disponiblesAlmacenado[i];
                        modelo.addRow(matriz);
                        //    break;
                    }

                    // }
                    JTable tabla = new JTable(modelo);
                    //tabla.getColumnModel().getColumn(12);
                    // tabla.setCellEditor(tabla.getDefaultEditor(Boolean.class));

                    tabla.setBounds(20, 400, 1250, 300);
                    panel.add(tabla);

                    JScrollPane scroll = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                    scroll.setBounds(20, 400, 1250, 300);
                    panel.add(scroll);
                }

            }

        };
        btnBuscar.addActionListener(eventofiltro);

    }

}
