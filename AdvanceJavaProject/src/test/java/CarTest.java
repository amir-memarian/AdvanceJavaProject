import org.junit.jupiter.api.Test;

public class CarTest {
    //Nested Class
    class Mashin{

      boolean ayaMashinRoshanAst;
      boolean ayaDarMashinBazAst;
      double toul;
      double aez;
      String mark;

      void roshan(){
          System.out.println("mashin roshan ast.");
          ayaMashinRoshanAst = true;
      }
      void khamosh(){
          System.out.println("mashin khamosh ast.");
          ayaMashinRoshanAst = false;
      }
      void bazKardanDar(){
          System.out.println("Dar baz ast.");
          ayaDarMashinBazAst = true;
      }
      void bastanDar(){
          System.out.println("Dar baste shod.");
          ayaDarMashinBazAst = false;
      }
      void harekat(){
        if (!ayaDarMashinBazAst && ayaMashinRoshanAst) {
            System.out.println("mashin dar hal harekat ast.");
        }else{
            System.out.println("mashin park ast.");
        }
      }
    }
    String s;

    @Test
    void name() {

    }
}
