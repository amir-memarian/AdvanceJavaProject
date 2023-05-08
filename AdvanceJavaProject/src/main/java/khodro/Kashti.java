package khodro;

import khodro.Khodro;

public class Kashti extends Khodro {

    @Override
    public boolean ayaDarHalHarekatAst() {
        Mashin mashin = new Mashin();
      //  mashin.noeDande = "XXX";

        return false;
    }

    @Override
    public String getMark() {
        return "khodro.Kashti";
    }
}
