/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Elvis
 */
public class Login extends JFrame {

    private JPanel panel;
    private JLabel usuario, contrasena;
    private JTextField usuario1;
    private JButton ingresar, cancelar;
    private JPasswordField contrasena1;

    public Login() {

        setTitle("LOGIN");

        this.setSize(500, 500);  //tamano de la ventana
        setMinimumSize(new Dimension(570, 600)); // tamano minimo de ventana
        setMaximumSize(new Dimension(570, 600));

        setLocationRelativeTo(null);// posicion de la ventana en el centro
        this.setResizable(false);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarLabel();
        colocarCajasDeTexto();
        colocarBotones();
        eventoDeAccion();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

    }

    private void colocarLabel() {
        usuario = new JLabel("Usuario");
        usuario.setBounds(50, 190, 200, 60);
        usuario.setFont(new Font("arial", 0, 25));
        usuario.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(usuario);

        contrasena = new JLabel("Contraseña");
        contrasena.setBounds(50, 290, 200, 60);
        contrasena.setFont(new Font("arial", 0, 25));
        contrasena.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(contrasena);

        final ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/login.PNG"));

        JLabel imagenUsuario = new JLabel();
        imagenUsuario.setBounds(200, 30, 150, 150);
       imagenUsuario.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(imagenUsuario.getWidth(), imagenUsuario.getHeight(), Image.SCALE_SMOOTH)));

        panel.add(imagenUsuario);
    }

    private void colocarCajasDeTexto() {

        usuario1 = new JTextField();
        usuario1.setBounds(300, 200, 200, 35);
        panel.add(usuario1);

        contrasena1 = new JPasswordField();
        contrasena1.setBounds(300, 300, 200, 35);
        panel.add(contrasena1);

    }

    private void colocarBotones() {
        ingresar = new JButton();
        ingresar.setText("Ingresar");
        ingresar.setBounds(120, 450, 120, 42);
        ingresar.setEnabled(true); // encendido o apagado del boton     
        //boton1.setForeground(Color.BLUE);
        ingresar.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(ingresar);

        cancelar = new JButton();
        cancelar.setText("Cancelar");
        cancelar.setBounds(330, 450, 120, 42);
        cancelar.setEnabled(true); // encendido o apagado del boton     
        //boton1.setForeground(Color.BLUE);
        cancelar.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(cancelar);

    }

    private void eventoDeAccion() {
        ActionListener eventoIngresar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nombre = usuario1.getText();
                String pass = contrasena1.getText();
                /*
                si contrasena ingresada es igual a un array de contrasenas que se tendran entonces
                luego otro if para saber si es usuario normal o admin
                 */
                int pos = -1;
                for (int i = 0; i < 100; i++) {
                    if (nombre.equals(Static.usuarioAlmacenado[i])) {

                        pos = i;
                    }

                }

                if (nombre.equals("admin") && pass.equals("password")) {
                    UsuarioAdmin ventanaAdmin = new UsuarioAdmin();
                    ventanaAdmin.setVisible(true);
                    dispose();
                }else if(nombre.equals("admin") && !pass.equals("password")){    
                       JOptionPane.showMessageDialog(ingresar,
                        "Credenciales erroneas, por favor intente nuevamente",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                       
                } else if (pos != -1) {
                    if (nombre.equals(Static.usuarioAlmacenado[pos]) && pass.equals(Static.contraAlmacenada[pos])) {
                        Static.USUARIONORMAL= Static.usuarioAlmacenado[pos];
                        UsuarioNormal ventanUserNormal = new UsuarioNormal();
                        ventanUserNormal.setVisible(true);
                        dispose();
                        }else {
                           JOptionPane.showMessageDialog(ingresar,
                        "Credenciales erroneas, por favor intente nuevamente",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                    }
                } else  
                JOptionPane.showMessageDialog(ingresar,
                        "El  usuario no existe, por favor contactese con el administrador",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        };
        ingresar.addActionListener(eventoIngresar);

        ActionListener eventoCancelar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PantallaInicio ventanaInicio = new PantallaInicio();
                ventanaInicio.setVisible(true);
                dispose();

            }

        };
        cancelar.addActionListener(eventoCancelar);
    }
}
