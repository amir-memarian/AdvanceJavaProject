package khodro;

public class Motor {
    boolean ayaRoshanAst;

    public void roshan(){
        ayaRoshanAst = true;
    }
    void khamosh(){
        ayaRoshanAst = false;
    }
    public boolean ayaDarHalHarekatAst() {
        return ayaRoshanAst;
    }

}
