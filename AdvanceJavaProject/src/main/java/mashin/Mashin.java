package mashin;

import static java.lang.System.out;

public class Mashin {
    boolean ayaMashinRoshanAst;
    boolean ayaDarMashinBazAst;
    String mark;

    public Mashin(){
        out.println("yek mashin bedon dade sakhteh shod.");
    }

    public Mashin(String mark){
        this.mark = mark;
        out.println("yek mashin "+this.mark+" sakhteh shod.");
    }
    public void roshan(){
        out.println("mashin roshan ast.");
        ayaMashinRoshanAst = true;
    }
    void khamosh(){
        out.println("mashin khamosh ast.");
        ayaMashinRoshanAst = false;
    }
    void bazKardanDar(){
        out.println("Dar baz ast.");
        ayaDarMashinBazAst = true;
    }
    void bastanDar(){
        out.println("Dar baste shod.");
        ayaDarMashinBazAst = false;
    }
    public boolean ayaMashinDarHalHarekatAst(){
        if (!ayaDarMashinBazAst && ayaMashinRoshanAst) {
            out.println("mashin dar hal harekat ast.");
            return true;
        }else{
            out.println("mashin park ast.");
            return false;
        }
    }
}
