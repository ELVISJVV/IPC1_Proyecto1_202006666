/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Utilidades.MetodosSueltos;
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
        int contadorTemas = 0;
        String[] temas = new String[300];
        //
        String[] temasTotaleds = new String[300];
        String lineasTexto;
        String[] linea;
        //for (int i = 0; i < Static.temasAlmacenados.length; i++) {
        //lineasTexto = Static.temasAlmacenados[i];
        //String [] linea =lineasTexto.split(",");
        // temas=Static.temasAlmacenados[i].split(",");
        //System.out.println(temas);
        // for (int j = 0; j <contadorTemas; j++) {
        //    lineasTexto = Static.temasAlmacenados[j];
        //    linea =lineasTexto.split(",");
        ///   // System.out.println(temas+"\n");
        //     System.out.println(linea + "\n");
        //    contadorTemas++;
        // }
        //if (rootPaneCheckingEnabled) {

        //}
        //}
        String temass = String.join(",", Static.temasAlmacenados);
        System.out.println("temass = " + temass);
        String[] temasSplit = temass.split(",");
        int a = 0;
        
        String aux;
        /*
          for(int i=1; i<=temasSplit.length; i++) {  
            for(int j=0; j<temasSplit.length-i; j++) { 
                if( temasSplit[j].compareTo( temasSplit[j+1] ) > 0 ) { 
                    aux   = temasSplit[j]; 
                    temasSplit[j]  = temasSplit[j+1]; 
                    temasSplit[j+1]= aux; 
                }    
            } 
        }
        */
       
         MetodosSueltos.ordenamiento(temasSplit);
         for (int i = 0; i < temasSplit.length; i++) {
             System.out.println(temasSplit[i]);
        }
      
         //for(int i=0; i<temasSplit.length; i++) 
             
      // {
         //   if (temasSplit[i].equals("null")) {
          //      break;
          //  }
          //  System.out.println( " A[" + i + "] = " + temasSplit[i] ); }
        
         
         int contador=0;
         String auxiliar =temasSplit[0];
         for (int i = 0; i < temasSplit.length; i++) {
            if (temasSplit[i].equals("null")) {
                break;
            }
            if (auxiliar.equals(temasSplit[i])){
                contador ++;
            }else{
                String az= String.valueOf(contador);
              txaEntrada.append("    <tr>\n");
            txaEntrada.append("        <td>");
            txaEntrada.append(auxiliar);
            txaEntrada.append("         </td>\n");
            txaEntrada.append("         <td>");
            txaEntrada.append(az);
            txaEntrada.append("         </td>\n");
           // txaEntrada.append("     </tr>\n");
                contador=1;
                auxiliar=temasSplit[i];
            }
            
                
        }
          String az= String.valueOf(contador);
         txaEntrada.append("    <tr>\n");
            txaEntrada.append("        <td>");
            txaEntrada.append(auxiliar);
            txaEntrada.append("         </td>\n");
            txaEntrada.append("         <td>");
            txaEntrada.append(az);
            txaEntrada.append("         </td>\n");
            txaEntrada.append("     </tr>\n");
         /*
        for (int i = 0; i < temasSplit.length; i++) {
             String numCadena = String.valueOf(i);
             int contador=0;
            if (temasSplit[i].equals("null")) {
                break;
            }
            
            for (int j = 0; j < temasSplit.length; j++) {
                if (temasSplit[i].equals(temasSplit[j])) {
                    contador++;
                    
                }
            }
            for (int j = 0; j < temasSplit.length; j++) {
                if (!temasSplit[i].equals(temasSplit[j])) {
                    
            String az= String.valueOf(contador);
              txaEntrada.append("    <tr>\n");
            txaEntrada.append("        <td>");
            txaEntrada.append(temasSplit[i]);
            txaEntrada.append("         </td>\n");
            txaEntrada.append("         <td>");
            txaEntrada.append(az);
            txaEntrada.append("         </td>\n");
            txaEntrada.append("     </tr>\n");
                    break;
                }
            }
            
            
            //a++;
            System.out.println(temasSplit[i]);

        }
        */
        
        /*
        String newMatriz[] =new String[a];
        for (int i = 0; i < temasSplit.length; i++) {
            if (temasSplit[i].equals("null")) {
                break;
              

            }
            newMatriz[i]=temasSplit[i];

        }
        //for (int i = 0; i < a; i++) {
            System.out.println(newMatriz);
      //  }

        for (int i = 0; i < Static.prestamoRealizado; i++) {
            String numCadena = String.valueOf(i);

            txaEntrada.append("    <tr>\n");
            txaEntrada.append("        <td>");
            txaEntrada.append(numCadena);
            txaEntrada.append("         </td>\n");
            txaEntrada.append("         <td>");
            txaEntrada.append(Static.usuarioPrestamo[i] + "");
            txaEntrada.append("         </td>\n");
            
            txaEntrada.append("     </tr>\n");

        }
        */
        
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
