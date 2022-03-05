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
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Elvis
 */
public class ModificarUsuario extends JFrame {

    private JPanel panel;
    private JLabel nombre, apellido, usuario, rol, contrasena, confirmarContrasena;
    private JTextField cajaTexto;
    private JComboBox listaDesplegable1, listadespegable1;
    private JTextField nombre1, apellido1, usuario1, rol1, buscar1;
    private JPasswordField contrasena1, confirmarContrasena1;
    private JButton cancelar, modificar, buscar;
    private DefaultComboBoxModel modelo;

    public ModificarUsuario() {
        //setBounds (50,50,500,500);
        setTitle("Modificar Usuario");

        this.setSize(570, 600);  //tamano de la ventana
        setMinimumSize(new Dimension(570, 600)); // tamano minimo de ventana 
        setLocationRelativeTo(null);// posicion de la ventana en el centro
        this.setResizable(false);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarBotones();
        colocarEiquetas();
        colocarCajasDeTexto();

        colocarListassDespegables();
        eventoAccion();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

    }

    private void colocarEiquetas() {

        nombre = new JLabel("Nombre");
        nombre.setBounds(50, 90, 200, 60);
        nombre.setFont(new Font("arial", 0, 20));
        nombre.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(nombre);

        apellido = new JLabel("Apellido");
        apellido.setBounds(50, 140, 200, 60);
        apellido.setFont(new Font("arial", 0, 20));
        apellido.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(apellido);

        usuario = new JLabel("Usuario");
        usuario.setBounds(50, 190, 200, 60);
        usuario.setFont(new Font("arial", 0, 20));
        usuario.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(usuario);

        rol = new JLabel("Rol");
        rol.setBounds(50, 240, 200, 60);
        rol.setFont(new Font("arial", 0, 20));
        rol.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(rol);

        contrasena = new JLabel("Contraseña");
        contrasena.setBounds(50, 290, 200, 60);
        contrasena.setFont(new Font("arial", 0, 20));
        contrasena.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(contrasena);

        confirmarContrasena = new JLabel("Confirmar contraseña");
        confirmarContrasena.setBounds(50, 340, 200, 60);
        confirmarContrasena.setFont(new Font("arial", 0, 20));
        confirmarContrasena.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(confirmarContrasena);

        /*
        ImageIcon imagen = new ImageIcon("ingenieria.PNG");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(10, 80, 600, 500);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));

        panel.add(etiqueta2);
         */
    }

    private void colocarCajasDeTexto() {
        buscar1 = new JTextField();
        buscar1.setBounds(300, 50, 200, 30);
        panel.add(buscar1);

        nombre1 = new JTextField();
        nombre1.setBounds(300, 100, 200, 30);
        panel.add(nombre1);

        apellido1 = new JTextField();
        apellido1.setBounds(300, 150, 200, 30);
        panel.add(apellido1);

        usuario1 = new JTextField();
        usuario1.setBounds(300, 200, 200, 30);
        panel.add(usuario1);
        /*
        rol1 = new JTextField();
        rol1.setBounds(300, 250, 200, 30);
        panel.add(rol1);
         */

        contrasena1 = new JPasswordField();
        contrasena1.setBounds(300, 300, 200, 30);
        panel.add(contrasena1);

        confirmarContrasena1 = new JPasswordField();
        confirmarContrasena1.setBounds(300, 350, 200, 30);
        panel.add(confirmarContrasena1);
    }

    private void colocarBotones() {

        buscar = new JButton();
        buscar.setText("Buscar");
        buscar.setBounds(50, 50, 200, 30);
        buscar.setEnabled(true); // encendido o apagado del boton     
        //boton1.setForeground(Color.BLUE);
        buscar.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(buscar);

        modificar = new JButton();
        modificar.setText("Modificar");
        modificar.setBounds(120, 450, 130, 42);
        modificar.setEnabled(true); // encendido o apagado del boton     
        //boton1.setForeground(Color.BLUE);
        modificar.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(modificar);

        cancelar = new JButton();
        cancelar.setText("Cancelar");
        cancelar.setBounds(330, 450, 130, 42);
        cancelar.setEnabled(true); // encendido o apagado del boton     
        //boton1.setForeground(Color.BLUE);
        cancelar.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(cancelar);

    }

    private void colocarListassDespegables() {

        String[] rol = {"Estudiante", "Catedratico"};
        listadespegable1 = new JComboBox(rol);
        listadespegable1.setBounds(300, 250, 200, 30);

        //listadespegable1.addItem("argentina");//anadir objetos a tu lista despegable
        //listadespegable1.setSelectedItem("colombia");// seleccionar el primer objeto visto
        panel.add(listadespegable1);
        /*
       

         */

 /*
           String estudiante = "Estudiante";
        String catedratico = "Catedratico";
        modelo = new DefaultComboBoxModel();
        listaDesplegable1 = new JComboBox(modelo);

        modelo.addElement(estudiante);
        modelo.addElement(catedratico);

        listaDesplegable1.setBounds(300, 250, 200, 30);
        panel.add(listaDesplegable1);
        
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

                    contrasena1.setText(Static.contraAlmacenada[pos]);
                    confirmarContrasena1.setText(Static.confirmarcontraAlmacenada[pos]);
                    //   Static.rolAlmacenado[pos].getSelectedItem();
                    //rocao1l.setText(Static.rolAlmacenado[pos]);
                    // listadespegable1.setText("");
                    //Object object=listadespegable1.getSelectedItem();
                    //   String rol = String.valueOf(object); 

                    // Object obj=Static.rolAlmacenado[pos];
                    listadespegable1.setSelectedItem(Static.rolAlmacenado[pos]);

                }

            }
        };
        buscar.addActionListener(eventoBuscar);

        ActionListener eventoModificar = new ActionListener() {
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
                
                // guardando los valores de las modificaciones en nuevas variables
                String nombre = nombre1.getText();
                String apellido = apellido1.getText();
                String usuario = usuario1.getText();
                String contraseña = contrasena1.getText();
                String confirmarContraseña = confirmarContrasena1.getText();
                Object object = listadespegable1.getSelectedItem();
                String rol = String.valueOf(object);

                String errores = "";

                if (nombre.isEmpty()) {
                    errores += " - El nombre no puede estar vacio \n";
                }

                if (apellido.isEmpty()) {
                    errores += " - El apellido no puede estar vacio \n";
                }

                if (usuario.isEmpty()) {
                    errores += " - El usuario no puede estar vacia \n";
                }

                if (contraseña.isEmpty()) {
                    errores += " - La contraseña no puede estar vacia \n";
                }
                if (confirmarContraseña.isEmpty()) {
                    errores += " - Debe confirmar la contraseña \n";
                }

                if (!contraseña.equals(confirmarContraseña)) {
                    errores += " - Las contraseñas no coinciden \n";
                }

                if (errores.isEmpty()) {

                    Static.nombreAlmacenado[pos] = nombre;
                    Static.apellidoAlmacenado[pos] = apellido;
                    Static.usuarioAlmacenado[pos] = usuario;
                    Static.contraAlmacenada[pos] = contraseña;
                    Static.confirmarcontraAlmacenada[pos] = confirmarContraseña;
                    Static.rolAlmacenado[pos] = rol;

                    JOptionPane.showMessageDialog(modificar, "Usuario Modificado Con Exito", "     Usuario", WIDTH);

                    //System.out.println(Static.usuarioCreado);
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
