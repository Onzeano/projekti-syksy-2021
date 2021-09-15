package com.example;

import javax.sound.sampled.SourceDataLine;
import java.util.Scanner;
import java.util.Random;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world..
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        Scanner pelaaja = new Scanner(System.in);
        int raha = 1000;
        int kanat = 0;

        Kana sulkanen = new Kana("Herra. Sulkanen", 200);
        Kana munanen = new Kana("Munanen", 80);
        Kana heyhonen = new Kana("Heyhönen", 120);
        Kana pellervo = new Kana("Pellervo", 90);
        Kana kukkonen = new Kana("kukkonen", 100);
        Kana pesänen = new Kana("Pesänen", 110); 
        Kana goldy = new Kana("Goldy", 200);
        Kana chica = new Kana("Chica", 90);
        Kana joe = new Kana("Joe", 170);     

        System.out.println("Tervetuloa kanalaan!");
        
    }
}
