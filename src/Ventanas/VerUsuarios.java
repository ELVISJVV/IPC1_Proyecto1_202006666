/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Usuario;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
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
public class VerUsuarios extends JFrame {

    private JPanel panel;
    private JLabel usuario, reporte, bibliografia;
    private JButton atras;
    private DefaultTableModel modelo;

    public VerUsuarios() {

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

        // colocarAreasDeTexto();
        eventoAccion();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        //panel.setSize(1300, 800);
        this.add(panel);

    }

    private void colocarLabel() {
        usuario = new JLabel("Listado de Usuarios");
        usuario.setBounds(450, 50, 400, 60);
        usuario.setFont(new Font("arial", 0, 35));
        usuario.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(usuario);

      
        //panel.add(bibliografia);
    }

    private void colocarTablas() {
        modelo = new DefaultTableModel();

        //modelo.addColumn("NO.");
        modelo.addColumn("No.");
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Usuario");
        modelo.addColumn("Rol");
        modelo.addColumn("Contraseña");

        String[] matriz = new String[7];
        matriz[0] = Static.idAlmacenado[Static.usuarioCreado];

        matriz[1] = Static.nombreAlmacenado[Static.usuarioCreado];
        matriz[2] = Static.apellidoAlmacenado[Static.usuarioCreado];
        matriz[3] = Static.usuarioAlmacenado[Static.usuarioCreado];
        matriz[4] = Static.rolAlmacenado[Static.usuarioCreado];
        matriz[5] = Static.contraAlmacenada[Static.usuarioCreado];

        for (int i = 0; i < Static.usuarioCreado; i++) {
            String numCadena= String.valueOf(i);
            matriz[0]=numCadena;
            matriz[1] = Static.idAlmacenado[i];
            matriz[2] = Static.nombreAlmacenado[i];
            matriz[3] = Static.apellidoAlmacenado[i];
            matriz[4] = Static.usuarioAlmacenado[i];
            matriz[5] = Static.rolAlmacenado[i];
            matriz[6] = Static.contraAlmacenada[i];
            modelo.addRow(matriz);

        }
        
        JTable tabla = new JTable(modelo);

        tabla.setBounds(100, 150, 1090, 4050);
        panel.add(tabla);

        JScrollPane scroll = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(100, 150, 1090, 450);
        panel.add(scroll);

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
