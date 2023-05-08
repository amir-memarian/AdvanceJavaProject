package khodro;

public abstract class Khodro {
    boolean ayaRoshanAst;

    public void roshan(){
        ayaRoshanAst = true;
    }
    void khamosh(){
        ayaRoshanAst = false;
    }

    public abstract boolean ayaDarHalHarekatAst();

    public abstract String getMark();
}
