package Supermarked;


import Supermarked.data.KurveVare;
import Supermarked.data.CSVLoader;
import Supermarked.logic.Butik;
import Supermarked.logic.KasseApparat;
import Supermarked.model.Vare;
import Supermarked.util.Robot;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {


        Butik butik = new Butik();

        Collection<Vare> alleVarer = CSVLoader.læsVarerFraFil("data/varer.csv");

        for (Vare v : alleVarer) {
            butik.tilføjVare(v);
        }

        // 2. HENT TILBUDSVARER
        Collection<Vare> tilbudVarer = CSVLoader.læsVarerFraFil("data/tilbud.csv");

        for (Vare v : tilbudVarer) {
            butik.tilføjTilbud(v);
        }

        // 3. Robotten laver en kurv ud fra ALLE varer
        Robot robot = new Robot();
        Collection<Vare> kurv = robot.fyldIKurv(alleVarer);

        // 4. Kasseapparat scanner varer fra kurven
        KasseApparat kasse = new KasseApparat();

        for (Vare v : kurv) {
            kasse.scanVare(v);
        }

        // 5. Sorter kurven
        Collection<KurveVare> aggregat = kasse.aggregérKurv();

        // 6. Print bon
        kasse.printBon(aggregat, tilbudVarer);
    }
}