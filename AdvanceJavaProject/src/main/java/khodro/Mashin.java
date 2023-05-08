package khodro;

public class Mashin extends Khodro implements SandoghDar, GearBox {
    boolean ayaDarBazAst;
    String mark;
    Ranande ranande;
    public Mashin(){
    }
    public Mashin(String mark){
        this.mark = mark;
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

    @Override
    public String typeDande() {
        return "Automatic";
    }

    @Override
    public int gonjayeshSandogh() {
        return 100;
    }
}
