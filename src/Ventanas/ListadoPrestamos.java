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
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elvis
 */
public class ListadoPrestamos extends JFrame {

    private JPanel panel;
    private JLabel usuario, lTitulo, lTipo, Lautor;
    private JButton atras, guardar, buscar;
    private JTextField titulo, tipo, autor, encontrar;
    private JTable tbBiblio;
    private DefaultTableModel modelo;
    // private JScrollPane scroll;
    //private String columnas[] = { "Tipo","Autor", "Titulo",  "Descripcion", "Edición", "Temas", "Frecuencia Actual","Ejemplares","Área","Copias","Disponibles"}; //Listado de columnas/encabezados
    //Llamada al método estático obtener datos, de la clase Tienda. Recibe el arreglo de lecturas construido.

    public ListadoPrestamos() {
        setTitle("                                                                                                                                     LISTADO PRESTAMOS  ");

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

        colocarAreasDeTexto();
        eventoAccion();
    }

    private void colocarPanel() {

        panel = new JPanel();
        panel.setLayout(null);
        //panel.setSize(1300, 800);
        this.add(panel);

    }

    private void colocarTablas() {

        modelo = new DefaultTableModel();

        modelo.addColumn("No.");
       // modelo.addColumn("Usuario");
        modelo.addColumn("Titulo");
        modelo.addColumn("Tipo");
        modelo.addColumn("Fecha y Hora");

        String[] matriz = new String[4];
        matriz[0] = Static.usuarioPrestamo[Static.prestamoRealizado];
        matriz[1] = Static.tituloPrestamo[Static.prestamoRealizado];
        matriz[2] = Static.tipoPrestamo[Static.prestamoRealizado];
        matriz[3] = Static.hora[Static.prestamoRealizado];
        
         int contadorPrestamos=0;
        for (int i = 0; i < Static.prestamoRealizado; i++) {
            if (Static.usuarioPrestamo[i].equals(Static.USUARIONORMAL)) {
                String numCadena = String.valueOf(i);
                matriz[0] = numCadena;
                contadorPrestamos++;
               // matriz[1] = Static.usuarioPrestamo[i];

                matriz[1] = Static.tituloPrestamo[i];
                String tipos = Static.tipoPrestamo[i];
                if (tipos.equals("0")) {
                    tipos = "Libro";
                } else if (tipos.equals("1")) {
                    tipos = "Revista";
                } else if (tipos.equals("2")) {
                    tipos = "Tesis";
                }
                matriz[2] = tipos;
                matriz[3] = Static.hora[i];
                modelo.addRow(matriz);

            }
           
        }
         System.out.println("numero de prestamos"+contadorPrestamos);
        JTable tabla = new JTable(modelo);

        tabla.setBounds(15, 450, 1260, 250);
        tabla.setEnabled(false);
        panel.add(tabla);

        JScrollPane scroll = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(15, 450, 1260, 250);
        panel.add(scroll);

    }

    private void colocarLabel() {

        usuario = new JLabel("Listado de Prestamos");
        usuario.setBounds(470, 360, 400, 60);
        usuario.setFont(new Font("arial", 0, 35));
        usuario.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(usuario);

        lTitulo = new JLabel("Tipo");
        lTitulo.setBounds(50, 250, 130, 60);
        lTitulo.setFont(new Font("arial", 0, 25));
        lTitulo.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(lTitulo);

        lTipo = new JLabel("Autor");
        lTipo.setBounds(500, 250, 130, 60);
        lTipo.setFont(new Font("arial", 0, 25));
        lTipo.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(lTipo);

        Lautor = new JLabel("Titulo");
        Lautor.setBounds(900, 250, 130, 60);
        Lautor.setFont(new Font("arial", 0, 25));
        Lautor.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(Lautor);

    }

    private void colocarAreasDeTexto() {

        encontrar = new JTextField();
        encontrar.setBounds(650, 55, 270, 33);
        encontrar.setEditable(true);
        panel.add(encontrar);

        tipo = new JTextField();
        tipo.setBounds(180, 270, 250, 33);
        tipo.setEditable(false);
        panel.add(tipo);

        autor = new JTextField();
        autor.setBounds(600, 270, 250, 33);
        autor.setEditable(false);
        panel.add(autor);

        titulo = new JTextField();
        titulo.setBounds(980, 270, 250, 33);
        titulo.setEditable(false);
        panel.add(titulo);
    }

    private void colocarBotones() {
        atras = new JButton();
        atras.setText("Regresar");
        atras.setBounds(50, 50, 120, 42);
        atras.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(atras);

        guardar = new JButton();
        guardar.setText("Devolver");
        guardar.setBounds(1140, 50, 120, 42);
        guardar.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(guardar);

        buscar = new JButton();
        buscar.setText("Buscar Prestamo");
        buscar.setBounds(400, 50, 200, 42);
        buscar.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(buscar);

    }

    private void eventoAccion() {
        ActionListener eventoAtras = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                UsuarioNormal ventanaUsuarioNormal = new UsuarioNormal();
                ventanaUsuarioNormal.setVisible(true);
                dispose();

            }

        };
        atras.addActionListener(eventoAtras);

        ActionListener eventoBuscar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String buscarTitulo = encontrar.getText();
                int pos = -1;
                
               
                for (int i = 0; i < Static.prestamoRealizado; i++) {
                    if (Static.usuarioPrestamo[i].equals(Static.USUARIONORMAL)) {
                        for (int j = 0; j < 100; j++) {
                            if (buscarTitulo.equals(Static.tituloPrestamo[j]) && Static.usuarioPrestamo[j].equals(Static.USUARIONORMAL)) {//titulo almacenado
                                pos = j;
                            }
                        }

                    }

                }

                if (pos == -1) {
                    //System.out.println("No se encontro el usuario");
                    JOptionPane.showMessageDialog(buscar,
                            "NO SE HA REALIZADO EL PRESTAMO",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    System.out.println("Si se encontró la bibliografia");
                    //tipo1.setText(datos[pos][0]);
                    tipo.setText(Static.tipoAlmacenado[pos]);
                    String tipos = tipo.getText();
                    if (tipos.equals("0")) {
                        tipo.setText("Libro");
                    } else if (tipos.equals("1")) {
                        tipo.setText("Revista");
                    } else if (tipos.equals("2")) {
                        tipo.setText("Tesis");
                    }
                    autor.setText(Static.autorAlmacenado[pos]);
                    titulo.setText(Static.tituloPrestamo[pos]);// titulo.setText(Static.titulo almacenado[pos]

                }
            }

        };
        buscar.addActionListener(eventoBuscar);

        ActionListener eventoGuardar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String buscarTitulo = encontrar.getText();

                int pos = -1;
                int pos2 = -1;
                for (int i = 0; i < Static.prestamoRealizado; i++) {
                    if (Static.usuarioPrestamo[i].equals(Static.USUARIONORMAL)) {
                        for (int j = 0; j < 100; j++) {
                            if (buscarTitulo.equals(Static.tituloPrestamo[j]) && Static.usuarioPrestamo[j].equals(Static.USUARIONORMAL)) {//titulo almacenado
                                pos = j;
                            }
                        }

                    }

                }

                if (pos == -1) {
                    //System.out.println("No se encontro el usuario");
                    JOptionPane.showMessageDialog(guardar,
                            "INGRESE EL TITULO DEL PRESTAMO A DEVOLVER",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    System.out.println("Si se encontró la bibliografia");
                    JOptionPane.showMessageDialog(guardar,
                            "SE HA DEVUELTO LA BIBLIOGRAFIA",
                            "  REGRESAR BIBLIOGRAFIA",
                            JOptionPane.INFORMATION_MESSAGE);

                    for (int i = 0; i < 100; i++) {
                        if (buscarTitulo.equals(Static.tituloAlmacenado[i])) {
                            pos2 = i;
                        }

                    }
                    int disponibilidadPrestamo = Integer.parseInt(Static.disponiblesAlmacenado[pos2]);
                    disponibilidadPrestamo++;
                    Static.disponiblesAlmacenado[pos2] = String.valueOf(disponibilidadPrestamo);

                    for (int i = pos; i < Static.hora.length - 1; i++) {
                        Static.hora[i] = Static.hora[i + 1];
                    }

                    for (int i = pos; i < Static.usuarioPrestamo.length - 1; i++) {
                        Static.usuarioPrestamo[i] = Static.usuarioPrestamo[i + 1];
                    }
                    for (int i = pos; i < Static.tituloPrestamo.length - 1; i++) {
                        Static.tituloPrestamo[i] = Static.tituloPrestamo[i + 1];
                    }
                    for (int i = pos; i < Static.tipoPrestamo.length - 1; i++) {
                        Static.tipoPrestamo[i] = Static.tipoPrestamo[i + 1];
                    }
                    Static.prestamoRealizado--;
                    tipo.setText("");

                    encontrar.setText("");
                    autor.setText("");
                    titulo.setText("");// titulo.setText(Static.titulo almacenado[pos]
                    UsuarioNormal ventanaUsuarioNormal = new UsuarioNormal();
                    ventanaUsuarioNormal.setVisible(true);
                    dispose();

                }
            }

        };
        guardar.addActionListener(eventoGuardar);
    }

}
