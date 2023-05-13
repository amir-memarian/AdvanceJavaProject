package khodro.mashin;

import java.util.Comparator;

public class Mashincomparator implements Comparator<Mashin> {

    @Override
    public int compare(Mashin mashin_1, Mashin mashin_2) {
        return mashin_1.getMark().compareTo(mashin_2.getMark());
    }
}
