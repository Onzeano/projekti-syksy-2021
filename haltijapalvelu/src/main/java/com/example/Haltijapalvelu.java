package com.example;

import java.awt.Color;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
        ImageIcon kuva = new ImageIcon("picture.png");
        File kuvatiedosto = new File("picture.png");
        System.out.println(kuvatiedosto.exists());
        System.out.println(kuvatiedosto.getAbsolutePath());
        JButton nappi = new JButton("Tilaa haltija.");
        nappi.setIcon(kuva);
        ikkuna.add(nappi);
    }   
}
