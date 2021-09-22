package com.example;

import javax.sound.sampled.SourceDataLine;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList; 

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
        Random rand = new Random();

        int raha = 1000;
        int kanat = 0;

        Kana sulkanen = new Kana("Herra. Sulkanen", 200);
        Kana munanen = new Kana("Munanen", 130);
        Kana heyhonen = new Kana("Heyhönen", 120);
        Kana pellervo = new Kana("Pellervo", 90);
        Kana kukkonen = new Kana("kukkonen", 100);
        Kana pesänen = new Kana("Pesänen", 110); 
        Kana goldy = new Kana("Goldy", 200);
        Kana kananen = new Kana("Kananen", 90);
        Kana Siemenen = new Kana("Siemenen", 170);     

        System.out.println("Tervetuloa kanalaan!");
        System.out.println("");

        ArrayList<Kana> kanalista = new ArrayList<Kana>();
        ArrayList<Kana> kanakauppa = new ArrayList<Kana>();
        kanakauppa.add(sulkanen);
        kanakauppa.add(munanen);
        kanakauppa.add(heyhonen);
        kanakauppa.add(pellervo);
        kanakauppa.add(kukkonen);
        kanakauppa.add(pesänen);
        kanakauppa.add(goldy);
        kanakauppa.add(kananen);
        kanakauppa.add(Siemenen);
        
        System.out.println("Sinulla on " + raha + " euroa ja " + kanalista.size() + " kanaa." );
        Kana ostokana = kanakauppa.get(rand.nextInt(kanakauppa.size()));
        System.out.println("Haluatko ostaa kanan " + ostokana.getNimi() + " kyllä/ei");
        String vastaus = pelaaja.nextLine();
        
        if (vastaus == "kyllä") {
            

        }
        
        //kanakauppa.size()
        //kanakauppa.get()
         
    }
}
