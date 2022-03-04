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
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Elvis
 */
public class CrearUsuario extends JFrame {

    private JPanel panel;
    private JLabel ID, nombre, apellido, usuario, rol, contrasena, confirmarContrasena;
    private JButton cancelar, crear;
    private JTextField cajaTexto;
    private JButton boton1;
    private JTextField ID1, nombre1, apellido1, usuario1, rol1;
    private JPasswordField contrasena1, confirmarContrasena1;
    private JComboBox listadespegable1;

    public CrearUsuario() {
        //setBounds (50,50,500,500);
        setTitle("Crear Usuario");

        this.setSize(570, 600);  //tamano de la ventana
        setMinimumSize(new Dimension(570, 600)); // tamano minimo de ventana 
        //setMaximumSize(new Dimension(100,40));
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
        colocarListassDespegables();
        eventoDeAccion();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

    }

    private void colocarEiquetas() {
        ID = new JLabel("ID");
        ID.setBounds(50, 40, 200, 60);
        ID.setFont(new Font("arial", 0, 20));
        ID.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(ID);

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
        ID1 = new JTextField();
        ID1.setBounds(300, 50, 200, 30);
        panel.add(ID1);

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
        crear = new JButton();
        crear.setText("Crear");
        crear.setBounds(120, 450, 120, 42);
        crear.setEnabled(true); // encendido o apagado del boton     
        //boton1.setForeground(Color.BLUE);
        crear.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(crear);

        cancelar = new JButton();
        cancelar.setText("Cancelar");
        cancelar.setBounds(330, 450, 120, 42);
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

    private void eventoDeAccion() {
        ActionListener eventoCancelar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                UsuarioAdmin ventanaAdmin = new UsuarioAdmin();
                ventanaAdmin.setVisible(true);
                dispose();

            }
        };
        cancelar.addActionListener(eventoCancelar);

        ActionListener eventoGuardar;
        eventoGuardar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                String errores = "";
                String id = ID1.getText();
                String nombre = nombre1.getText();
                String apellido = apellido1.getText();
                String usuario = usuario1.getText();

                String contraseña = contrasena1.getText();
                String confirmarContraseña = confirmarContrasena1.getText();
                Object object = listadespegable1.getSelectedItem();
                String rol = String.valueOf(object);

                //  String rol = "", rol2 ="" ;
                if (nombre.isEmpty()) {
                    errores += " - El nombre no puede estar vacio \n";
                }

                if (apellido.isEmpty()) {
                    errores += " - El apellido no puede estar vacio \n";
                }

                if (usuario.isEmpty()) {
                    errores += " - El usuario no puede estar vacia \n";
                }

                if (id.isEmpty()) {
                    errores += " - El ID no puede estar vacia \n";
                } else {
                    if (!MetodosSueltos.validaNumeroEntero_Exp(id)) {
                        errores += " - El ID no tiene el formato correcto \n";
                    }
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
                String validacion = "";
                for (int i = 0; i < Static.usuarioCreado; i++) {
                    if (id.equals(Static.idAlmacenado[i])) {
                        errores += " - Este usuario ya existe en el sistema \n";
                        validacion = "error";
                        //System.out.println(Static.usuarioCreado);
                    }

                }

                if (errores.isEmpty()) {

                    Static.idAlmacenado[Static.usuarioCreado] = id;
                    Static.nombreAlmacenado[Static.usuarioCreado] = nombre;
                    Static.apellidoAlmacenado[Static.usuarioCreado] = apellido;
                    Static.usuarioAlmacenado[Static.usuarioCreado] = usuario;
                    Static.contraAlmacenada[Static.usuarioCreado] = contraseña;
                    Static.confirmarcontraAlmacenada[Static.usuarioCreado] = confirmarContraseña;
                    Static.rolAlmacenado[Static.usuarioCreado] = rol;

                    Static.usuarioCreado++;
                    JOptionPane.showMessageDialog(crear, "Usuario Creado Con Exito", "     Usuario", WIDTH);

                    int matriz[] = new int[Static.usuarioCreado];
                    for (int i = 0; i < matriz.length; i++) {
                        System.out.println("nombre usuario " + Static.nombreAlmacenado[i] + "  rol " + Static.rolAlmacenado[i] + " numeri id " + Static.idAlmacenado[i]);
                    }

                    ID1.setText("");
                    nombre1.setText("");
                    apellido1.setText("");
                    usuario1.setText("");
                    contrasena1.setText("");
                    confirmarContrasena1.setText("");

                    //System.out.println(Static.usuarioCreado);
                } else {
                    JOptionPane.showMessageDialog(crear,
                            errores,
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            }

        };
        crear.addActionListener(eventoGuardar);
    }
}
