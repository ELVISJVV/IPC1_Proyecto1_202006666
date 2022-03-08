/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Elvis
 */
public class ReporteBibliografia extends JFrame {

    public JPanel plCarga;
    public JTextArea txaEntrada;
    public JScrollPane scpScroll;
    public JButton bttCargar, btnsalir;

    public ReporteBibliografia() {
        definirPropiedades(); //Definir propiedades de esta ventana por separado
        construirComponentes(); //I
    }

    private void definirPropiedades() {
        setTitle("                                                                                                      REPORTE BIBLIOGRAFIAS");
        setSize(1100, 800);
        //setBackground(Color.gray);
        this.setResizable(false);
        setLayout(null);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void construirComponentes() {
        //Definición del panel
        plCarga = new JPanel();
        plCarga.setBounds(0, 0, 1100, 800);
        // plCarga.setBackground(Color.gray);
        plCarga.setLayout(null);
        add(plCarga);

        String primeraPrte = "<!DOCTYPE html>\n"
                + "<html lang =\"en\">\n"
                + " <head>\n"
                + "     <title> Prestamos</title>\n"
                + " </head>\n"
                + " <body>\n"
                + "     <table border=\"\">\n";

        String columnas = "         <tr>\n"
                + "             <th>Temas.</th>\n"
                + "             <th>Cantidad</th>\n"
                
                + "         </tr>\n"
                + "           <tr>\n";
        
        String parteFinal = "         </tr>\n"
                + "       </table>\n"
                + " </body>\n"
                + "</html>";

        //Definición de area de texto
        txaEntrada = new JTextArea();
        txaEntrada.setFont(new Font("arial", Font.BOLD, 20));
        //Definición del panel
        scpScroll = new JScrollPane(txaEntrada);
        scpScroll.setBounds(55, 50, 990, 570);

        txaEntrada.setText(primeraPrte + columnas);
        int contadorTemas=0;
        for (int i = 0; i < Static.temasAlmacenados.length; i++) {
            String  lineasTexto = Static.temasAlmacenados[i];
             String [] linea =lineasTexto.split(",");
            if (rootPaneCheckingEnabled) {
                
            }
        }
        for (int i = 0; i < Static.prestamoRealizado; i++) {
            String numCadena = String.valueOf(i);

            txaEntrada.append("    <tr>\n");
            txaEntrada.append("        <td>");
            txaEntrada.append(numCadena);
            txaEntrada.append("         </td>\n");
            txaEntrada.append("         <td>");
            txaEntrada.append(Static.usuarioPrestamo[i] + "");
            txaEntrada.append("         </td>\n");
            txaEntrada.append("         <td>");
            txaEntrada.append(Static.tituloPrestamo[i] + "");
            txaEntrada.append("         </td>\n");
            txaEntrada.append("         <td>");
            txaEntrada.append(Static.hora[i] + "");
            txaEntrada.append("         </td>\n");
            txaEntrada.append("     </tr>\n");

        }
        txaEntrada.append(parteFinal);
        plCarga.add(scpScroll);

        btnsalir = new JButton(" Atras ");
        btnsalir.setBounds(900, 650, 150, 42);
        btnsalir.setFont(new Font("arial", Font.BOLD, 20));
        btnsalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UsuarioAdmin ventanaAdmin = new UsuarioAdmin();
                ventanaAdmin.setVisible(true);
                dispose();
            }
        });
        plCarga.add(btnsalir);

    }

}
