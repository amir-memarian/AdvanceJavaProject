package khodro;

public abstract class Khodro {

    protected final void protectedMethod(){
        System.out.println("This method is protected.");
    }
    public boolean ayaRoshanAst;

    public void roshan(){
        ayaRoshanAst = true;
    }
    void khamosh(){
        ayaRoshanAst = false;
    }

    public abstract boolean ayaDarHalHarekatAst();

    public abstract String getMark();
}
