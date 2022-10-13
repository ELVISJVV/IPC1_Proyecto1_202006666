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
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

/**
 *
 * @author Elvis
 */
public class UsuarioAdmin extends JFrame {

    private JPanel panel;
    private JLabel usuario, reporte, bibliografia, nameUsuario;
    private JTextArea area1, area2, area3, area4, area5;
    private JButton btnCrear, btnVer, btnModificar, btnEliminar, btnLogout, btnUsuarios, btnBibliografias, btnPrestamos, btnCrear1, btnVer1, btnModificar1, btnEliminar1;
    //private VerBibliografias tabla;

    public UsuarioAdmin() {
        setTitle("                                                                                                                                     ADMINISTRADOR ");

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
        colocarAreasDeTexto();
        eventoAccion();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        //panel.setSize(1300, 800);
        this.add(panel);

    }

    private void colocarLabel() {
        usuario = new JLabel("Usuarios");
        usuario.setBounds(30, 400, 200, 60);
        usuario.setFont(new Font("arial", 0, 25));
        usuario.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(usuario);
        
        
        nameUsuario = new JLabel("ADMINISTRADOR");
        //nameUsuario.setBackground(new Color(0, 00, 00, 0));
        nameUsuario.setBounds(880, 50, 200, 120);
        nameUsuario.setFont(new Font("arial", 0, 20));
        //nameUsuario.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        //nameUsuario.setEditable(false);//editar el area de texto
        panel.add(nameUsuario);

        reporte = new JLabel("Reportes");
        reporte.setBounds(670, 180, 200, 60);
        reporte.setFont(new Font("arial", 0, 25));
        reporte.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(reporte);

        bibliografia = new JLabel("Bibliografía");
        bibliografia.setBounds(670, 400, 200, 60);
        bibliografia.setFont(new Font("arial", 0, 25));
        bibliografia.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(bibliografia);

       final ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/login.PNG"));

       JLabel imagenUsuario = new JLabel();
       imagenUsuario.setBounds(720, 50, 120, 120);
        imagenUsuario.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(imagenUsuario.getWidth(), imagenUsuario.getHeight(), Image.SCALE_SMOOTH)));
//
       panel.add(imagenUsuario);

        final ImageIcon imagen2 = new ImageIcon(getClass().getResource("/Imagenes/logo.PNG"));

      JLabel imagenLogo = new JLabel();
       imagenLogo.setBounds(20, 80, 600, 200);
       imagenLogo.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(imagenLogo.getWidth(), imagenLogo.getHeight(), Image.SCALE_SMOOTH)));

        panel.add(imagenLogo);
    }

    private void colocarAreasDeTexto() {

        area1 = new JTextArea();
        area1.setBackground(new Color(0, 0, 0, 0));
        area1.setBounds(20, 40, 600, 300);
        area1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        area1.setEditable(false);//editar el area de texto
        panel.add(area1);

        area2 = new JTextArea();
        area2.setBackground(new Color(0, 0, 0, 0));
        area2.setBounds(20, 400, 600, 300);
        area2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        area2.setEditable(false);//editar el area de texto
        panel.add(area2);

        area3 = new JTextArea();
        area3.setBackground(new Color(0, 0, 0, 0));
        area3.setBounds(660, 400, 600, 300);
        area3.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        area3.setEditable(false);//editar el area de texto
        panel.add(area3);

        area4 = new JTextArea();
        area4.setBackground(new Color(0, 0, 0, 0));
        area4.setBounds(660, 40, 600, 150);
        area4.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        area4.setEditable(false);//editar el area de texto
        panel.add(area4);

        //area de reportes
        area5 = new JTextArea();
        area5.setBackground(new Color(0, 0, 0, 0));
        area5.setBounds(660, 190, 600, 150);
        area5.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        area5.setEditable(false);//editar el area de texto
        panel.add(area5);

    }

    private void colocarBotones() {
        btnLogout = new JButton();
        btnLogout.setText("Logout");
        btnLogout.setBounds(1100, 90, 120, 42);
        btnLogout.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(btnLogout);

        // botones area 2 abajo izquierda
        btnCrear = new JButton();
        btnCrear.setText("Crear");
        btnCrear.setBounds(130, 500, 150, 42);
        btnCrear.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(btnCrear);

        btnVer = new JButton();
        btnVer.setText("Ver");
        btnVer.setBounds(350, 500, 150, 42);
        btnVer.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(btnVer);

        btnModificar = new JButton();
        btnModificar.setText("Modificar");
        btnModificar.setBounds(130, 600, 150, 42);
        btnModificar.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(btnModificar);

        btnEliminar = new JButton();
        btnEliminar.setText("Eliminar");
        btnEliminar.setBounds(350, 600, 150, 42);
        btnEliminar.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(btnEliminar);

        // botones area 3 abajo a la derecha
        btnCrear1 = new JButton();
        btnCrear1.setText("Crear");
        btnCrear1.setBounds(770, 500, 150, 42);
        btnCrear1.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(btnCrear1);

        btnVer1 = new JButton();
        btnVer1.setText("Ver");
        btnVer1.setBounds(990, 500, 150, 42);
        btnVer1.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(btnVer1);

        btnModificar1 = new JButton();
        btnModificar1.setText("Modificar");
        btnModificar1.setBounds(770, 600, 150, 42);
        btnModificar1.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(btnModificar1);

        btnEliminar1 = new JButton();
        btnEliminar1.setText("Eliminar");
        btnEliminar1.setBounds(990, 600, 150, 42);
        btnEliminar1.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(btnEliminar1);

        // botones en area de reportes
        btnUsuarios = new JButton();
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setBounds(700, 250, 160, 48);
        btnUsuarios.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(btnUsuarios);

        btnBibliografias = new JButton();
        btnBibliografias.setText("Bibliografias");
        btnBibliografias.setBounds(892, 250, 160, 48);
        btnBibliografias.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(btnBibliografias);

        btnPrestamos = new JButton();
        btnPrestamos.setText("Préstamos");
        btnPrestamos.setBounds(1080, 250, 160, 48);
        btnPrestamos.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(btnPrestamos);

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

        ActionListener eventoCrearUsuario = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                CrearUsuario ventanaCrearUsuario = new CrearUsuario();
                ventanaCrearUsuario.setVisible(true);
                dispose();

            }
        };
        btnCrear.addActionListener(eventoCrearUsuario);

        ActionListener eventoEliminarUsuario = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                EliminarUsuario ventanaEliminarUsuario = new EliminarUsuario();
                ventanaEliminarUsuario.setVisible(true);
                dispose();

            }

        };
        btnEliminar.addActionListener(eventoEliminarUsuario);

        ActionListener eventoModificarUsuario = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ModificarUsuario ventanaModificarUsuario = new ModificarUsuario();
                ventanaModificarUsuario.setVisible(true);
                dispose();

            }

        };
        btnModificar.addActionListener(eventoModificarUsuario);
        ActionListener eventoCrearBiblio = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                CrearBibliografia ventanaCrearBibli = new CrearBibliografia();
                ventanaCrearBibli.setVisible(true);
                dispose();

            }

        };
        btnCrear1.addActionListener(eventoCrearBiblio);

        ActionListener eventoVerUsuarios = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                VerUsuarios ventanaVerUsuarios = new VerUsuarios();
                ventanaVerUsuarios.setVisible(true);
                dispose();
            }
        };
        btnVer.addActionListener(eventoVerUsuarios);

        ActionListener eventoVerBIbliografias = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                VerBibliografias ventanaVerBibliografias = new VerBibliografias();
                ventanaVerBibliografias.setVisible(true);
                dispose();

                //       String columnas[] = { "Tipo","Autor", "Titulo",  "Descripcion", "Edición", "Temas", "Frecuencia Actual","Ejemplares","Área","Copias","Disponibles"}; //Listado de columnas/encabezados
                //  String datos[][] = Biblioteca.obtenerDatos(); //Llamada al método estático obtener datos, de la clase Tienda. Recibe el arreglo de lecturas construido.
                //     tabla= new VerBibliografias(datos,columnas);
                //tabla.setVisible(true);
            }
        };
        btnVer1.addActionListener(eventoVerBIbliografias);

        ActionListener eventoEliminarBibliografia = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                EliminarBibliografia ventanaEliminarBiblio = new EliminarBibliografia();
                ventanaEliminarBiblio.setVisible(true);
                dispose();

            }
        };
        btnEliminar1.addActionListener(eventoEliminarBibliografia);

        ActionListener eventoModidfiBiblio = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ModificarBibliografia ventanaModificarBiblio = new ModificarBibliografia();
                ventanaModificarBiblio.setVisible(true);
                dispose();
            }
        };
        btnModificar1.addActionListener(eventoModidfiBiblio);
        ActionListener eventoPrestamos = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               ReportePrestamos ventanaReP=new ReportePrestamos();
               ventanaReP.setVisible(true);
                dispose();
            }
        };
        btnPrestamos.addActionListener(eventoPrestamos);
        
          ActionListener eventoRepoBiblio = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               ReporteBibliografia ventanaRePBiblio=new ReporteBibliografia();
               ventanaRePBiblio.setVisible(true);
                dispose();
            }
        };
        btnBibliografias.addActionListener(eventoRepoBiblio);
        
        ActionListener eventoRepoUsuario = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               ReporteUsuarios ventanaUserReport = new ReporteUsuarios();
               ventanaUserReport.setVisible(true);
                dispose();
            }
        };
        btnUsuarios.addActionListener(eventoRepoUsuario);
    }
}
