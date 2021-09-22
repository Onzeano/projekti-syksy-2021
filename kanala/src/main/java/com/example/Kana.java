package com.example;

public class Kana {
    private String nimi;
    private int hinta;
    
    public Kana() {
        this.nimi = "Herra. Sulkainen";
        this.hinta = 100;
    }

    public Kana(String nimi, int hinta) {
        this.nimi = nimi;
        this.hinta = hinta;
    }
    
    public String getNimi () {
        return this.nimi;
    }

    public int getHinta () {
        return this.hinta;
    }
}
