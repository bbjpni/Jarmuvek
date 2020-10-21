package com.bzsomi;

public class Robogo extends Jarmu implements KisGepjarmu{

    private int maxSebesseg;

    public Robogo(String rendszam, int sebesseg, int maxSebesseg) {
        super(rendszam, sebesseg);
        this.maxSebesseg = maxSebesseg;
    }

    @Override
    public boolean haladhatItt(int sebesseg) { return this.maxSebesseg > sebesseg; }

    @Override
    public boolean gyorshajtottE(int sebessegkorlat) { return this.sebesseg>sebessegkorlat; }

    @Override
    public String toString() {
        return String.format("Robogo: %s",super.toString());
    }
}
