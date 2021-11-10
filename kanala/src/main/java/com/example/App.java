package com.example;

import javax.sound.sampled.SourceDataLine;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/**
 * Hello world!
 */
public final class App {
    private static int munat = 0;
    private static int paiva = 0;
    private static ArrayList<Kana> kanalista = new ArrayList<Kana>();
    private static int raha = 1000;

    private App() {
    }

    /**
     * Says hello to the world..
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        Scanner pelaaja = new Scanner(System.in);
        Random rand = new Random();

        

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

        while (true) {

            System.out.println("");
            System.out.println("Valitse toiminto: ");
            System.out.println("Laske rahat, listaa kanat, laske munat, myy munia, osta kana, odota.");
            //System.out.println("Sinulla on " + raha + " euroa, " + munat + " munaa ja " + kanalista.size() + " kanaa:");

            String vastau = pelaaja.nextLine();
            
            if (vastau.toLowerCase().equals("listaa kanat")) {
                for (Kana kana : kanalista) {
                    System.out.println(kana.getNimi());
                }

            }  

            if (vastau.toLowerCase().equals("laske rahat")) {
                System.out.println("Sinulla on " + raha + " euroa.");
            }

            if (vastau.toLowerCase().equals("laske munat")) {
                System.out.println("Sinulla on " + munat + " munaa.");
            }

            if (vastau.toLowerCase().equals("osta kana")) {
                Kana ostokana = kanakauppa.get(rand.nextInt(kanakauppa.size()));
                System.out.println("");
                System.out.println("Haluatko ostaa kanan " + ostokana.getNimi() + " (Maksaa " + ostokana.getHinta()
                        + " euroa)" + " joo/ei");
                String vastaus = pelaaja.nextLine();
    
                if (vastaus.toLowerCase().equals("joo") || vastaus.toLowerCase().startsWith("kyl")) {
                    if (raha >= ostokana.getHinta()) {
                        raha = raha - ostokana.getHinta();
                        kanalista.add(ostokana);
                        kanakauppa.remove(ostokana);
                    }
    
                }
            }

            if (vastau.toLowerCase().equals("myy munia")) {
                System.out.println("Montako myydään?");
                Integer monta = pelaaja.nextInt();
                myyMunia(monta);
            }
            
            if (vastau.toLowerCase().equals("odota")) {
                odota();
            }

            else if (vastau.toLowerCase().equals("lopeta")) {
                break;
            }
            
            // System.out.println(sulkanen.muni());
        }

        // kanakauppa.size()
        // kanakauppa.get()

    }

    private static void odota() {
        paiva ++;
        for (Kana kana : kanalista) {
            munat = munat + kana.muni();
        }

    }

    private static void myyMunia(int montako) {
        munat = munat - montako;
        raha = raha + montako * 5;
    }
}
