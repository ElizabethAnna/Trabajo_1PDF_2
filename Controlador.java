/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Controlador implements ActionListener {

    Vista f;

    public Controlador() {
        f = new Vista();
        f.setVisible(true);
        f.btnCalcular.setVisible(true);
        f.btnCalcular.addActionListener(this);
        f.btnCalcular.setActionCommand("Calcular");

    }

    public void actionPerformed(ActionEvent e) {
        double uno = 0;
        double dos = 0;
        double bot1 = 0;
        double iva = 0;
        double con = 0;

        if (f.btnCalcular.isSelected()) {
            uno = Double.parseDouble(f.txtUnidades.getText());
            dos = Double.parseDouble(f.txtPrecio.getText());;
            bot1 = uno * dos;
            iva = (bot1 * .16);
            con = bot1 + (bot1 * .16);
        }
        f.etiTotalSinIva.setText(" " + bot1);
        f.etiIva.setText(" " + iva);
        f.etiTotalMasIva.setText(" " + con);
    }

    public static void main(String[] args) {
        Controlador r = new Controlador();
    }
}
