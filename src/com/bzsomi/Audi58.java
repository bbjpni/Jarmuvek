package com.bzsomi;

public class Audi58 extends Jarmu{
    private boolean lezerblokolo;

    public Audi58(String rendszam, int sebesseg, boolean lezerblokolo) {
        super(rendszam, sebesseg);
        this.lezerblokolo = lezerblokolo;
    }

    @Override
    public boolean gyorshajtottE(int sebessegkorlat) { return this.sebesseg>sebessegkorlat; }

    @Override
    public String toString() {
        return String.format("Audi: %s",super.toString());
    }
}
