/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Utilidades.MetodosSueltos;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Elvis
 */
public class ModificarBibliografia extends JFrame {

    private JRadioButton rb1;
    private JRadioButton rb2;
    private JRadioButton rb3;
    private JRadioButton rb4;
    private JPanel panel;
    private JLabel lbTipo, lbAutor, lbEdicion, lbDescripcion, lbTemas, lbFrecuencia, lbEjemplares, lbCopias, lbDisponibles, lbArea;
    private JComboBox listadespegable1;
    private String tipo = "0";
     String tipos1;
    private JButton modificar, atras, buscar;
    private JTextField tipo1, autor1, edicion1, descripcion1, temas1, frecuencia1, ejemplares1, copias1, disponibles1, area1, buscar1;

    public ModificarBibliografia() {
        setTitle("                                                                                                                                     MODIFICAR BIBLIOGRAFIA ");

        this.setSize(1300, 800);  //tamano de la ventana
        setMinimumSize(new Dimension(1300, 800)); // tamano minimo de ventana
        setMaximumSize(new Dimension(1300, 800));
        this.setResizable(false);
        setLocationRelativeTo(null);// posicion de la ventana en el centro

        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarRadioBotones();
        colocarLabel();
        colocarBotones();
        colocarAreasDeTexto();
        //colocarListaDespegable();
        // condicion();
        //eventoAccion();
        eventoBotones();
        eventoAccionEliminar();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(1300, 800);
        this.add(panel);
    }

    private void colocarListaDespegable() {
        //  String [] rol ={"Revista", "Libro", "Tesis"};
      /*
          listadespegable1 = new JComboBox<String>();
        listadespegable1.setFont(new Font("arial", 0, 25));
        listadespegable1.setBounds(270, 50, 300, 60);
        listadespegable1.addItem("Libro");
        listadespegable1.addItem("Revista");
        listadespegable1.addItem("Tesis");
        //listadespegable1.addItem("argentina");//anadir objetos a tu lista despegable
        //listadespegable1.setSelectedItem("colombia");// seleccionar el primer objeto visto
        panel.add(listadespegable1);
        //listadespegable1.addItemListener(this);
        */
      
      
    }

    private void colocarLabel() {

        lbTipo = new JLabel("Tipo");
        lbTipo.setBounds(40, 150, 200, 60);
        lbTipo.setFont(new Font("arial", 0, 25));
        lbTipo.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(lbTipo);

        lbAutor = new JLabel("Autor");
        lbAutor.setBounds(40, 250, 200, 60);
        lbAutor.setFont(new Font("arial", 0, 25));
        lbAutor.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(lbAutor);

        lbEdicion = new JLabel("Edición");
        lbEdicion.setBounds(40, 350, 200, 60);
        lbEdicion.setFont(new Font("arial", 0, 25));
        lbEdicion.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(lbEdicion);

        lbDescripcion = new JLabel("Descripción");
        lbDescripcion.setBounds(40, 450, 200, 60);
        lbDescripcion.setFont(new Font("arial", 0, 25));
        lbDescripcion.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(lbDescripcion);

        lbTemas = new JLabel("Temas");
        lbTemas.setBounds(40, 550, 200, 60);
        lbTemas.setFont(new Font("arial", 0, 25));
        lbTemas.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(lbTemas);

        lbFrecuencia = new JLabel("Frecuencia");
        lbFrecuencia.setBounds(600, 150, 200, 60);
        lbFrecuencia.setFont(new Font("arial", 0, 25));
        lbFrecuencia.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(lbFrecuencia);

        lbEjemplares = new JLabel("Ejemplares");
        lbEjemplares.setBounds(600, 250, 200, 60);
        lbEjemplares.setFont(new Font("arial", 0, 25));
        lbEjemplares.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(lbEjemplares);

        lbCopias = new JLabel("Copias");
        lbCopias.setBounds(600, 350, 200, 60);
        lbCopias.setFont(new Font("arial", 0, 25));
        lbCopias.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(lbCopias);

        lbDisponibles = new JLabel("Disponibles");
        lbDisponibles.setBounds(600, 450, 200, 60);
        lbDisponibles.setFont(new Font("arial", 0, 25));
        lbDisponibles.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(lbDisponibles);

        lbArea = new JLabel("Área");
        lbArea.setBounds(600, 550, 200, 60);
        lbArea.setFont(new Font("arial", 0, 25));
        lbArea.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(lbArea);

    }

    private void colocarBotones() {
        buscar = new JButton();
        buscar.setText("Buscar");
        buscar.setBounds(40, 50, 128, 48);
        buscar.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(buscar);

        modificar = new JButton();
        modificar.setText("Modificar");
        modificar.setBounds(430, 660, 128, 48);
        modificar.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(modificar);

        atras = new JButton();
        atras.setText("Atras");
        atras.setBounds(700, 660, 128, 48);
        atras.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(atras);
    }

    private void colocarAreasDeTexto() {
        buscar1 = new JTextField();
        buscar1.setBounds(250, 50, 300, 33);
        //buscar1.setEditable(false);
        panel.add(buscar1);

        tipo1 = new JTextField();
        tipo1.setBounds(250, 160, 300, 33);
        //tipo1.setEditable(false);
        // panel.add(tipo1);

        autor1 = new JTextField();
        autor1.setBounds(250, 260, 300, 33);
        // autor1.setEditable(false);
        panel.add(autor1);

        edicion1 = new JTextField();
        edicion1.setBounds(250, 360, 300, 33);
        // edicion1.setEditable(false);
        panel.add(edicion1);

        descripcion1 = new JTextField();
        descripcion1.setBounds(250, 460, 300, 33);
        // descripcion1.setEditable(false);
        panel.add(descripcion1);
        /*
        rol1 = new JTextField();
        rol1.setBounds(300, 250, 200, 30);
        panel.add(rol1);
         */

        temas1 = new JTextField();
        temas1.setBounds(250, 560, 300, 33);
        // temas1.setEditable(false);
        panel.add(temas1);

        frecuencia1 = new JTextField();
        frecuencia1.setBounds(810, 160, 300, 33);
        // frecuencia1.setEditable(false);
        panel.add(frecuencia1);

        ejemplares1 = new JTextField();
        ejemplares1.setBounds(810, 260, 300, 33);
        //ejemplares1.setEditable(false);
        panel.add(ejemplares1);

        copias1 = new JTextField();
        copias1.setBounds(810, 360, 300, 33);
        // copias1.setEditable(false);
        panel.add(copias1);

        disponibles1 = new JTextField();
        disponibles1.setBounds(810, 460, 300, 33);
        // disponibles1.setEditable(false);
        panel.add(disponibles1);

        area1 = new JTextField();
        area1.setBounds(810, 560, 300, 33);
        area1.setEditable(false);
        panel.add(area1);

    }

    private void colocarRadioBotones() {
        rb1 = new JRadioButton("Revista", false);
        rb1.setBounds(250, 150, 85, 60);
        rb1.setFont(new Font("arial", 0, 18));
        panel.add(rb1);

        rb2 = new JRadioButton("Libro", false);
        rb2.setBounds(335, 150, 85, 60);
        rb2.setFont(new Font("arial", 0, 18));
        panel.add(rb2);

        rb3 = new JRadioButton("Tesis", false);
        rb3.setBounds(420, 150, 85, 60);
        rb3.setFont(new Font("arial", 0, 18));
        panel.add(rb3);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rb1);
        grupo.add(rb2);
        grupo.add(rb3);

        eventoAccion();
        /*
           if (rb1.isSelected()) {
            tipo = "0";

        } else if (rb2.isSelected()) {
            tipo = "1";
        } else if (rb3.isSelected()) {
            tipo = "2";
        }
         */

    }

    private void eventoAccion() {

        ActionListener eventoAccion1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frecuencia1.setEditable(true);
                area1.setEditable(false);
                ejemplares1.setEditable(true);
                area1.setText("");
                if (rb1.isSelected()) {
                    tipo = "1";

                } else if (rb2.isSelected()) {
                    tipo = "0";
                } else if (rb3.isSelected()) {
                    tipo = "2";
                }

            }
        };

        rb1.addActionListener(eventoAccion1);

        ActionListener eventoAccion2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                area1.setEditable(false);
                frecuencia1.setEditable(false);
                ejemplares1.setEditable(false);
                area1.setText("");
                ejemplares1.setText("");
                frecuencia1.setText("");
                if (rb1.isSelected()) {
                    tipo = "1";

                } else if (rb2.isSelected()) {
                    tipo = "0";
                } else if (rb3.isSelected()) {
                    tipo = "2";
                }
            }
        };

        rb2.addActionListener(eventoAccion2);

        ActionListener eventoAccion3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                area1.setEditable(true);
                ejemplares1.setEditable(false);
                frecuencia1.setEditable(false);
                ejemplares1.setText("");
                frecuencia1.setText("");

                if (rb1.isSelected()) {
                    tipo = "1";

                } else if (rb2.isSelected()) {
                    tipo = "0";
                } else if (rb3.isSelected()) {
                    tipo = "2";
                }
            }
        };

        rb3.addActionListener(eventoAccion3);

    }

    private void eventoBotones() {
        ActionListener eventoSalir = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                UsuarioAdmin ventanaAdmin = new UsuarioAdmin();
                ventanaAdmin.setVisible(true);
                dispose();

            }

        };
        atras.addActionListener(eventoSalir);

    }

    private void eventoAccionEliminar() {
        ActionListener eventoBuscar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // String errores = "";
                // Object object = listadespegable1.getSelectedItem();
                // String tipo = String.valueOf(object);
                //  Object object = listadespegable1.getSelectedItem();
                //  String bibliografiaTipo = String.valueOf(object);
                // String tipo = (String) listadespegable1.getSelectedItem();
                //int radionButtonId =grupo.getCheckedRadioButtonId();
                String buscarTitulo = buscar1.getText();
                Static.tituloAlmacenado[Static.bibliografiaCreada] = Static.tituloAlmacenado[Static.bibliografiaCreada];
                int pos = -1;
                for (int i = 0; i < 100; i++) {
                    if (buscarTitulo.equals(Static.tituloAlmacenado[i])) {
                        pos = i;
                    }

                }

                // String datos[][] = Biblioteca.obtenerDatos();
                if (pos == -1) {
                    //System.out.println("No se encontro el usuario");
                    JOptionPane.showMessageDialog(buscar,
                            "NO SE ENCONTRÓ LA BIBLIOGRAFIA",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    System.out.println("Si se encontró la bibliografia");
                    //tipo1.setText(datos[pos][0]);
                    String tipos = Static.tipoAlmacenado[pos];

                    if (tipos.equals("0")) {
                        // tipo1.setText("Libro");
                        rb2.setSelected(true);
                        area1.setEditable(false);
                        frecuencia1.setEditable(false);
                        ejemplares1.setEditable(false);
                    } else if (tipos.equals("1")) {
                        // tipo1.setText("Revista");
                        rb1.setSelected(true);
                        frecuencia1.setEditable(true);
                        area1.setEditable(false);
                        ejemplares1.setEditable(true);
                    } else if (tipos.equals("2")) {
                        //tipo1.setText("Tesis");
                        rb3.setSelected(true);
                        area1.setEditable(true);
                        ejemplares1.setEditable(false);
                        frecuencia1.setEditable(false);
                    }
                    autor1.setText(Static.autorAlmacenado[pos]);
                    descripcion1.setText(Static.descripcionAlmacenado[pos]);
                    edicion1.setText(Static.edicionAlmacenado[pos]);
                    temas1.setText(Static.temasAlmacenados[pos]);
                    frecuencia1.setText(Static.frecuenciaAlmacenado[pos]);
                    ejemplares1.setText(Static.ejemplaresAlmacenado[pos]);
                    area1.setText(Static.areaAlmacenado[pos]);
                    copias1.setText(Static.copiasAlmacenado[pos]);
                    disponibles1.setText(Static.disponiblesAlmacenado[pos]);
                     tipo= Static.tipoAlmacenado[pos];
                     tipos1 = Static.tipoAlmacenado[pos];
                }

            }

        };
        buscar.addActionListener(eventoBuscar);

        ActionListener eventoModificar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String buscarTitulo = buscar1.getText();
                Static.tituloAlmacenado[Static.bibliografiaCreada] = Static.tituloAlmacenado[Static.bibliografiaCreada];
                int pos = -1;
                for (int i = 0; i < 100; i++) {
                    if (buscarTitulo.equals(Static.tituloAlmacenado[i])) {
                        pos = i;
                    }

                }
                //  tipo = Static.tipoAlmacenado[pos];
                String errores = "";
              
                
                String autor = autor1.getText();
                String descripcion = descripcion1.getText();
                String edicion = edicion1.getText();
                 //String str=temas1.getText();
                
                String temas = temas1.getText();
              
                String frecuencia = frecuencia1.getText();
                String ejemplares = ejemplares1.getText();
                String area = area1.getText();
                String copias = copias1.getText();
                String disponibles = disponibles1.getText();

                if (autor.isEmpty()) {
                    errores += " - El autor no puede estar vacio \n";
                }

                if (descripcion.isEmpty()) {
                    errores += " - La descripcion no puede estar vacia \n";
                }

                if (copias.isEmpty()) {
                    errores += " - Las cppias no pueden estar vacias \n";
                } else {
                    if (!MetodosSueltos.validaNumeroEntero_Exp(copias)) {
                        errores += " - Las copias no tienen el formato correcto \n";
                    }
                }
                if (disponibles.isEmpty()) {
                    errores += " - La disponibilidad no puede estar vacia \n";
                } else {
                    if (!MetodosSueltos.validaNumeroEntero_Exp(disponibles)) {
                        errores += " - La disponibilidad no tiene el formato correcto \n";
                    }
                }

                if (edicion.isEmpty()) {
                    errores += " - La edicion no puede estar vacia \n";
                } else {
                    if (!MetodosSueltos.validaNumeroEntero_Exp(edicion)) {
                        errores += " - La edicion no tiene el formato correcto \n";
                    }
                }

                if (temas.isEmpty()) {
                    errores += " - Los temas no pueden estar vacios \n";
                }
                tipos1=tipo;
                if (tipos1.equals("1")) {
                    if (frecuencia.isEmpty()) {
                        errores += " - La frecuencia no puede estar vacia \n";
                    }
                    if (ejemplares.isEmpty()) {
                        errores += " - Los ejemplares no pueden estar vacios \n";
                    } else {
                        if (!MetodosSueltos.validaNumeroEntero_Exp(ejemplares)) {
                            errores += " - Los ejemplares no tienen el formato correcto \n";
                        }
                    }
                } else if (tipos1.equals("2")) {
                    if (area.isEmpty()) {
                        errores += " - El area no puede estar vacia \n";
                    }
                } else if (tipos1.equals("0")) {

                }

                if (errores.isEmpty()) {

                    Static.tipoAlmacenado[pos] = tipo;
                    Static.autorAlmacenado[pos] = autor;

                    Static.descripcionAlmacenado[pos] = descripcion;
                    Static.edicionAlmacenado[pos] = edicion;
                    Static.temasAlmacenados[pos] = temas;
                    Static.frecuenciaAlmacenado[pos] = frecuencia;
                    Static.ejemplaresAlmacenado[pos] = ejemplares;
                    Static.areaAlmacenado[pos] = area;
                    Static.copiasAlmacenado[pos] = copias;
                    Static.disponiblesAlmacenado[pos] = disponibles;

                    JOptionPane.showMessageDialog(modificar,
                            "Se ha modificado la bibliografia con exito",
                            "BIBLIOGRAFIA MODIFICADA",
                            JOptionPane.WIDTH);
                    autor1.setText("");
                    
                    descripcion1.setText("");
                    edicion1.setText("");
                    temas1.setText("");
                    frecuencia1.setText("");
                    ejemplares1.setText("");
                    area1.setText("");
                    copias1.setText("");
                    disponibles1.setText("");
                     buscar1.setText("");
                } else {
                    JOptionPane.showMessageDialog(modificar,
                            errores,
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        };
        modificar.addActionListener(eventoModificar);
    }

}
