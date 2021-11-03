package com.example;

import java.util.Random;

public class Kana {
    private String nimi;
    private int hinta;
    private int muna;
    private Random noppa; 
    

    public Kana() {
        this.nimi = "Herra. Sulkainen";
        this.hinta = 100;
    }

    public Kana(String nimi, int hinta) {
        this.nimi = nimi;
        this.hinta = hinta;
        this.noppa = new Random();
    }
    
    public String getNimi () {
        return this.nimi;
    }

    public int getHinta () {
        return this.hinta;
    }
    
    public int muni() {
        
        return this.noppa.nextInt(10) + 1;
    }



    public void setNimi(String uusiNimi) {
        this.nimi = uusiNimi;
    }
}
