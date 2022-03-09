package Ventanas;

import java.awt.Color;
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
import javax.swing.SwingConstants;

public class PantallaInicio extends JFrame {
    
    private JPanel panel;
    private JLabel vision, visionContenido;
    private JButton about, login, salir;
    
    public PantallaInicio() {
        
        setTitle("                                                                                                                        BIBLIOTECA FACULTAD DE INGENIERIA");
        
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
        colocarLabel();
        
        colocarBotones();
        eventoDeAccion();
    }
    
    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        this.add(panel);
        
    }
    
    private void colocarLabel() {
        vision = new JLabel("VISION");
        vision.setBounds(890, 256, 200, 60);
        vision.setFont(new Font("arial", 0, 27));
        vision.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(vision);
        
        visionContenido = new JLabel("<HTML><centr>Ser la unidad de información especializada y técnica, con estándares de Biblioteca Universitaria en beneficio del desarrollo de la ciencia y la tecnología del país.");
        
        visionContenido.setBounds(890, 230, 370, 300);
        visionContenido.setFont(new Font("Californian FB", 0, 20));
        visionContenido.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(visionContenido);
        
       final ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Imagenes/biblioteca.JFIF"));
        
       JLabel biblioteca = new JLabel();
       biblioteca.setBounds(0, 0, 1300, 160);
       biblioteca.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(biblioteca.getWidth(), biblioteca.getHeight(), Image.SCALE_SMOOTH)));
        
        panel.add(biblioteca);
        
        final ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/logo.PNG"));
        
        JLabel logo = new JLabel();
        logo.setBounds(23, 220, 788, 300);
        logo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH)));
        
        panel.add(logo);
    }
    
    private void colocarBotones() {
        about = new JButton();
        about.setText("About");
        about.setBounds(87, 615, 120, 42);
        about.setEnabled(true); // encendido o apagado del boton     
        //boton1.setForeground(Color.BLUE);
        about.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(about);
        
        login = new JButton();
        login.setText("Login");
        login.setBounds(1100, 57, 120, 42);
        login.setEnabled(true); // encendido o apagado del boton     
        //boton1.setForeground(Color.BLUE);
        login.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(login);
        
        salir = new JButton();
        salir.setText("Salir");
        salir.setBounds(1100, 615, 120, 42);
        salir.setEnabled(true); // encendido o apagado del boton     
        //boton1.setForeground(Color.BLUE);
        salir.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(salir);
        
    }
    
    private void eventoDeAccion() {
        ActionListener eventoAbout = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //JOptionPane.showMessageDialog(about,"  BIBLIOTECA FACULTAD INGENIERA, TODOS LOS DERECHOS RESERVADOS");
                JOptionPane.showMessageDialog(about,
                        "BIBLIOTECA FACULTAD DE INGENIERA, TODOS LOS DERECHOS RESERVADOS.",
                        "                                                       ABOUT",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        };
        
        about.addActionListener(eventoAbout);
        
        ActionListener eventoLogin = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Login ventanaLogin = new Login();
                ventanaLogin.setVisible(true);
                
                dispose();
            }
        };
        login.addActionListener(eventoLogin);
        
        ActionListener eventoSalir = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
                
            }
            
        };
        salir.addActionListener(eventoSalir);
    }
}
