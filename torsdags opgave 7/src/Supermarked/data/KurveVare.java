package Supermarked.data;

import Supermarked.model.Vare;

public class KurveVare {
    private Vare vare;  // referencer til original vare
    private int antal;  // hvor mange gange varen er i kurven

    public KurveVare(Vare vare) {
        this.vare = vare;
        this.antal = 1;
    }

    public void increment() {
        antal++;
    }

    public int getAntal() {
        return antal;
    }

    public Vare getVare() {
        return vare;
    }
}