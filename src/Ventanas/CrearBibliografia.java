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
import javax.swing.SwingConstants;

/**
 *
 * @author Elvis
 */
public class CrearBibliografia extends JFrame {

    private JPanel panel;
    private JLabel cargaIndividual, cargaMasiva;
    private JButton btnCargaIndividual, btnCargaMasiva;
  
    public CrearBibliografia() {
        setTitle("Crear Bibliografia");

        this.setSize(500, 500);  //tamano de la ventana
        setMinimumSize(new Dimension(570, 570)); // tamano minimo de ventana
        setMaximumSize(new Dimension(570, 570));
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
        this.add(panel);

    }

    private void colocarLabel() {
        cargaIndividual = new JLabel("Carga Individual");
        cargaIndividual.setBounds(50, 100, 200, 60);
        cargaIndividual.setFont(new Font("arial", 0, 25));
        cargaIndividual.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(cargaIndividual);

        cargaMasiva = new JLabel("Carga Masiva");
        cargaMasiva.setBounds(50, 290, 200, 60);
        cargaMasiva.setFont(new Font("arial", 0, 25));
        cargaMasiva.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(cargaMasiva);

    }

    private void colocarBotones() {
        btnCargaIndividual = new JButton();
        btnCargaIndividual.setText("Carga Individual");
        btnCargaIndividual.setBounds(300, 100, 200, 42);
        btnCargaIndividual.setEnabled(true); // encendido o apagado del boton     
        //boton1.setForeground(Color.BLUE);
        btnCargaIndividual.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(btnCargaIndividual);

        btnCargaMasiva = new JButton();
        btnCargaMasiva.setText("Carga Masiva");
        btnCargaMasiva.setBounds(300, 290, 200, 42);
        btnCargaMasiva.setEnabled(true); // encendido o apagado del boton     
        //boton1.setForeground(Color.BLUE);
        btnCargaMasiva.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(btnCargaMasiva);

    }

    private void eventoDeAccion() {
        ActionListener eventoIngresar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                CargaIndividual eventoIndividual = new CargaIndividual();
                eventoIndividual.setVisible(true);
                dispose();
            }

        };
        btnCargaIndividual.addActionListener(eventoIngresar);

        ActionListener evntoCargaMasiva = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                CargaMasiva ventanaCargaMasiva = new CargaMasiva();
                ventanaCargaMasiva.setVisible(true);
                dispose();

            }

        };
        btnCargaMasiva.addActionListener(evntoCargaMasiva);
    }
}
