package Supermarked.data;

import Supermarked.model.Vare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;

public class CSVLoader {

    public static Collection<Vare> læsVarerFraFil(String filnavn) {

        Collection<Vare> varer = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filnavn))) {

            String linje = br.readLine(); // spring header over

            while ((linje = br.readLine()) != null) {

                String[] dele = linje.split(";"); // eller "," afhængig af filen

                String varenummer = dele[0];
                String navn = dele[1];
                double pris = Double.parseDouble(dele[3]);

                Vare v = new Vare(varenummer, navn, pris);

                varer.add(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return varer;
    }
}