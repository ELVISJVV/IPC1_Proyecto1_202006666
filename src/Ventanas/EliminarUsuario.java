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
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Elvis
 */
public class EliminarUsuario extends JFrame {

    private JPanel panel;
    private JLabel nombre, apellido, usuario, rol, contrasena, confirmarContrasena;
    private JTextField cajaTexto;
    private JButton boton1;
    private JTextField buscar1, nombre1, apellido1, usuario1, rol1, contrasena1, confirmarContrasena1;
    private JButton buscar, cancelar, eliminar;

    public EliminarUsuario() {
        //setBounds (50,50,500,500);
        setTitle("Eliminar usuario");

        this.setSize(570, 600);  //tamano de la ventana
        setMinimumSize(new Dimension(570, 600)); // tamano minimo de ventana 
        setLocationRelativeTo(null);// posicion de la ventana en el centro
        this.setResizable(false);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarEiquetas();
        colocarCajasDeTexto();
        colocarBotones();
        eventoAccion();

        // colocarListassDespegables();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

    }

    private void colocarEiquetas() {

        nombre = new JLabel("Nombre");
        nombre.setBounds(50, 130, 200, 60);
        nombre.setFont(new Font("arial", 0, 20));
        nombre.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(nombre);

        apellido = new JLabel("Apellido");
        apellido.setBounds(50, 180, 200, 60);
        apellido.setFont(new Font("arial", 0, 20));
        apellido.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(apellido);

        usuario = new JLabel("Usuario");
        usuario.setBounds(50, 230, 200, 60);
        usuario.setFont(new Font("arial", 0, 20));
        usuario.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(usuario);

        rol = new JLabel("Rol");
        rol.setBounds(50, 280, 200, 60);
        rol.setFont(new Font("arial", 0, 20));
        rol.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(rol);

    }

    private void colocarCajasDeTexto() {
        buscar1 = new JTextField();
        buscar1.setBounds(300, 50, 200, 30);
        buscar1.setEditable(true);
        panel.add(buscar1);

        nombre1 = new JTextField();
        nombre1.setBounds(300, 130, 200, 30);
        nombre1.setEditable(false);
        panel.add(nombre1);

        apellido1 = new JTextField();
        apellido1.setBounds(300, 180, 200, 30);
        apellido1.setEditable(false);
        panel.add(apellido1);

        usuario1 = new JTextField();
        usuario1.setBounds(300, 230, 200, 30);
        usuario1.setEditable(false);
        panel.add(usuario1);

        rol1 = new JTextField();
        rol1.setBounds(300, 280, 200, 30);
        rol1.setEditable(false);
        panel.add(rol1);

        /*
        contrasena1 = new JTextField();
        contrasena1.setBounds(300, 300, 200, 30);
        panel.add(contrasena1);

        confirmarContrasena1 = new JTextField();
        confirmarContrasena1.setBounds(300, 350, 200, 30);
        panel.add(confirmarContrasena1); 
         */
    }

    private void colocarBotones() {

        buscar = new JButton();
        buscar.setText("Buscar");
        buscar.setBounds(50, 40, 120, 42);
        buscar.setFont(new Font("arial", Font.BOLD, 20));

        panel.add(buscar);

        eliminar = new JButton();
        eliminar.setText("Eliminar");
        eliminar.setBounds(120, 400, 120, 42);
        eliminar.setEnabled(true); // encendido o apagado del boton     
        //boton1.setForeground(Color.BLUE);
        eliminar.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(eliminar);

        cancelar = new JButton();
        cancelar.setText("Cancelar");
        cancelar.setBounds(330, 400, 120, 42);
        cancelar.setEnabled(true); // encendido o apagado del boton     
        //boton1.setForeground(Color.BLUE);
        cancelar.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(cancelar);

    }

    private void colocarListassDespegables() {

        String[] rol = {"Estudiante", "Catedratico"};
        JComboBox listadespegable1 = new JComboBox(rol);
        listadespegable1.setBounds(300, 250, 200, 30);

        //listadespegable1.addItem("argentina");//anadir objetos a tu lista despegable
        //listadespegable1.setSelectedItem("colombia");// seleccionar el primer objeto visto
        panel.add(listadespegable1);

        /*
           String estudiante = "Estudiante";
        String catedratico = "Catedratico";
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        JComboBox listaDesplegable = new JComboBox(modelo);

        modelo.addElement(estudiante);
        modelo.addElement(catedratico);

        listaDesplegable.setBounds(300, 250, 200, 30);
        panel.add(listaDesplegable);
        
        
         */
    }

    private void eventoAccion() {

        ActionListener eventoCancelar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                UsuarioAdmin ventanaAdmin = new UsuarioAdmin();
                ventanaAdmin.setVisible(true);
                dispose();

            }
        };
        cancelar.addActionListener(eventoCancelar);

        ActionListener eventoBuscar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String buscarId = buscar1.getText();

                Static.idAlmacenado[Static.usuarioCreado] = Static.idAlmacenado[Static.usuarioCreado];
                int pos = -1;
                for (int i = 0; i < 100; i++) {
                    if (buscarId.equals(Static.idAlmacenado[i])) {
                        pos = i;
                    }

                }

                if (pos == -1) {
                    //System.out.println("No se encontro el usuario");
                    JOptionPane.showMessageDialog(buscar,
                            "NO SE ENCONTRÓ EL USUARIO",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    System.out.println("Si se encontro el suaurio");

                    nombre1.setText(Static.nombreAlmacenado[pos]);
                    apellido1.setText(Static.apellidoAlmacenado[pos]);
                    usuario1.setText(Static.usuarioAlmacenado[pos]);
                    rol1.setText(Static.rolAlmacenado[pos]);

                }

            }
        };

        buscar.addActionListener(eventoBuscar);

        ActionListener eventoEliminar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String buscarId = buscar1.getText();
                int pos = -1;
                for (int i = 0; i < 100; i++) {
                    if (buscarId.equals(Static.idAlmacenado[i])) {
                        pos = i;
                    }

                }
                if (pos == -1) {
                    //System.out.println("No se encontro el usuario");
                    JOptionPane.showMessageDialog(eliminar,
                            "Ingrese un usuario",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    System.out.println("Si se encontro el suaurio");

                    nombre1.setText(Static.nombreAlmacenado[pos]);
                    apellido1.setText(Static.apellidoAlmacenado[pos]);
                    usuario1.setText(Static.usuarioAlmacenado[pos]);
                    rol1.setText(Static.rolAlmacenado[pos]);
                    //mover id y eliminarlo
                    for (int i = pos; i < Static.idAlmacenado.length - 1; i++) {
                        Static.idAlmacenado[i] = Static.idAlmacenado[i + 1];

                    }

                    //mover nombre usuario
                    for (int i = pos; i < Static.nombreAlmacenado.length - 1; i++) {
                        Static.nombreAlmacenado[i] = Static.nombreAlmacenado[i + 1];

                    }
                    //mover apellido usario
                    for (int i = pos; i < Static.apellidoAlmacenado.length - 1; i++) {
                        Static.apellidoAlmacenado[i] = Static.apellidoAlmacenado[i + 1];

                    }

                    // Static.[Static.usuarioCreado] = rol;
                    //mover usuario almacenado 
                    for (int i = pos; i < Static.usuarioAlmacenado.length - 1; i++) {
                        Static.usuarioAlmacenado[i] = Static.usuarioAlmacenado[i + 1];

                    }

                    // mover contra almacenada
                    for (int i = pos; i < Static.contraAlmacenada.length - 1; i++) {
                        Static.contraAlmacenada[i] = Static.contraAlmacenada[i + 1];

                    }

                    // mover confirmarcontra almacenada
                    for (int i = pos; i < Static.confirmarcontraAlmacenada.length - 1; i++) {
                        Static.confirmarcontraAlmacenada[i] = Static.confirmarcontraAlmacenada[i + 1];

                    }

                    // mover rol alamacenado
                    for (int i = pos; i < Static.rolAlmacenado.length - 1; i++) {
                        Static.rolAlmacenado[i] = Static.rolAlmacenado[i + 1];

                    }
                    Static.usuarioCreado--;

                    nombre1.setText("");
                    apellido1.setText("");
                    usuario1.setText("");
                    rol1.setText("");
                    buscar1.setText("");
                    JOptionPane.showMessageDialog(eliminar,
                            "Se ha eliminado el usuario con exito",
                            "USUARIO ELIMINADO",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

        };
        eliminar.addActionListener(eventoEliminar);
    }
}
