/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo1;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
public class Vista extends JFrame{
    JTextField  txtUnidades, txtPrecio;
    JLabel  etiTotalSinIva,  etiIva, etiTotalMasIva;
    JButton  btnCalcular; 

    public Vista() {
        this.setTitle(" Ejercicio1");
        this.setSize(500, 500);
        this.setResizable(false);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    etiTotalSinIva = new JLabel();
    this.getContentPane().add(etiTotalSinIva, new AbsoluteConstraints(30, 100, 270, 20));
     etiIva = new JLabel(); 
    this.getContentPane().add( etiIva, new AbsoluteConstraints(30, 150, 270, 20));
     etiTotalMasIva= new JLabel(); 
    this.getContentPane().add( etiTotalMasIva, new AbsoluteConstraints(30, 190, 270, 20));
    btnCalcular= new JButton("Calcular"); 
    this.getContentPane().add( btnCalcular, new AbsoluteConstraints(50, 60, 270, 20));

       
        
        txtUnidades = new JTextField();
        this.getContentPane().add(txtUnidades, new AbsoluteConstraints(10, 20, 170, 20));
        txtPrecio = new JTextField();
        this.getContentPane().add(txtPrecio, new AbsoluteConstraints(200, 20, 170, 20));
        
        
    }
    
    public static void main(String[] args) {
        Vista f = new Vista();
        f.setVisible(true);
    }

    JButton getSource() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
