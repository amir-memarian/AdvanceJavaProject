package khodro;

public class Mashin {
    boolean ayaRoshanAst;
    boolean ayaDarBazAst;
    String mark;
    Ranande ranande;
    public Mashin(){
    }
    public Mashin(String mark){
        this.mark = mark;
    }
    public void roshan(){
        ayaRoshanAst = true;
    }
    void khamosh(){
        ayaRoshanAst = false;
    }
    void bazKardanDar(){
        ayaDarBazAst = true;
    }
    void bastanDar(){
        ayaDarBazAst = false;
    }
    public boolean ayaDarHalHarekatAst(){
        if (!ayaDarBazAst && ayaRoshanAst) {
            return true;
        }else{
            return false;
        }
    }
}
