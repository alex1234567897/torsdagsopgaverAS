package Supermarked.logic;


import Supermarked.data.KurveVare;
import Supermarked.model.Vare;

import java.util.*;

public class KasseApparat {

    // Kurven som en Collection
    private Collection<Vare> kurv = new ArrayList<>();

    // Tilføj vare til kurven
    public void scanVare(Vare vare) {
        kurv.add(vare);
    }

    // Hent kurven
    public Collection<Vare> getKurv() {
        return kurv;
    }

    public Collection<KurveVare> aggregérKurv() {
        Collection<KurveVare> aggregat = new ArrayList<>();

        for (Vare v : kurv) {
            boolean fundet = false;
            // Tjek om varen allerede er i kurven
            for (KurveVare a : aggregat) {
                if (a.getVare().getVarenummer().equals(v.getVarenummer())) {
                    a.increment(); // øg antal
                    fundet = true;
                    break;
                }
            }
            // Hvis ikke fundet, tilføj ny var til kurven
            if (!fundet) {
                aggregat.add(new KurveVare(v));
            }
        }
        return aggregat;
    }

    public void printBon(Collection<KurveVare> aggregat, Collection<Vare> tilbudsVarer) {
        double totalPris = 0;
        double totalRabat = 0;

        System.out.println("------ KASSEBON ------");

        for (KurveVare a : aggregat) {
            Vare vare = a.getVare();
            int antal = a.getAntal();
            double pris = vare.getPris(); // normalpris
            double rabat = 0;

            // Tjek om varen er på tilbud
            for (Vare t : tilbudsVarer) {
                if (t.getVarenummer().equals(vare.getVarenummer())) {
                    rabat = (pris - t.getPris()) * antal; // beregn rabat
                    pris = t.getPris(); // brug tilbudspris
                    break;
                }
            }

            double linjePris = pris * antal;
            totalPris += linjePris;
            totalRabat += rabat;

            // Udskriv vare og linjepris
            System.out.println(vare.getNavn());
            System.out.println("  " + antal + " x " + String.format("%.2f", pris) + " = " + String.format("%.2f", linjePris));

            // Udskriv rabat, hvis der er nogen
            if (rabat > 0) {
                System.out.println("  Rabat: -" + String.format("%.2f", rabat));
                totalPris += -rabat; // træk rabatten fra total
            }
        }

        double moms = totalPris * 0.25;

        System.out.println("----------------------");
        System.out.println("Total: " + String.format("%.2f", totalPris));
        System.out.println("Moms: " + String.format("%.2f", moms));
        System.out.println("----------------------");
    }
}