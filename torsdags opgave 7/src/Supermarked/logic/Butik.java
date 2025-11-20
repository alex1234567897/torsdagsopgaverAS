package Supermarked.logic;

import Supermarked.model.Vare;

import java.util.Collection;
import java.util.HashSet;

public class Butik {

    private Collection<Vare> alleVarer = new HashSet<>();
    private Collection<Vare> tilbudsVarer = new HashSet<>();

    public void tilføjVare(Vare vare) {
        alleVarer.add(vare);
    }

    public void tilføjTilbud(Vare vare) {
        tilbudsVarer.add(vare);
    }

    public Collection<Vare> getAlleVarer() {
        return alleVarer;
    }

    public Collection<Vare> getTilbudsVarer() {
        return tilbudsVarer;
    }
}
