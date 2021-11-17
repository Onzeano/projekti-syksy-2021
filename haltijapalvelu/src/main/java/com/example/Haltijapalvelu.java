package com.example;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Hello world!
 */
public final class Haltijapalvelu {
    private Haltijapalvelu() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        //Ikkunan luonti
        JFrame ikkuna = new JFrame();
        ikkuna.setTitle("Haltijapalvelu");
        ikkuna.setSize(200,400);
        ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ikkuna.setVisible(true);
        ikkuna.getContentPane().setBackground(Color.cyan);

        //Ikkunaan lisäys
        JLabel etiketti = new JLabel();
        ikkuna.add(etiketti);
        JButton nappi = new JButton();
        ikkuna.add(nappi);
    }   
}
