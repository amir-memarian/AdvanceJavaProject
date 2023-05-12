package khodro.mashin;
import khodro.*;

public class Mashin extends Khodro implements SandoghDar, GearBox {

    public static int tedadForosh;
    private boolean ayaDarBazAst;
    private String mark;
    int gonjayeshSandogh;
    private Dande noeDande;
    private Ranande ranande;
    public Mashin(){
    }
    public Mashin(String mark){
        this.mark = mark;
    }

    public Mashin(String mark, int gonjayeshSandogh, Dande noeDande) {
        this.mark = mark;
        this.gonjayeshSandogh = gonjayeshSandogh;
        this.noeDande = noeDande;
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
    public String getMark() {
        return mark;
    }

    @Override
    public Dande typeDande() {
        return noeDande;
    }

    @Override
    public int gonjayeshSandogh() {
        return 100;
    }

    @Override
    public String toString() {
        return "Mashin{" +
                "ayaDarBazAst=" + this.ayaDarBazAst +
                ", mark='" + this.mark + '\'' +
                ", gonjayeshSandogh=" + this.gonjayeshSandogh +
                ", noeDande='" + this.noeDande.getToPersian() + '\'' +
                ", ranande=" + this.ranande +
                '}';
    }
}
