import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    void Mashin_Moving_Door_closed_and_Mashin_Roshan() {
        //Given
        Mashin benz = new Mashin("benz");
        Mashin volvo = new Mashin("volvo");

        //When
        boolean ayaHarekatMikonad = benz.ayaMashinDarHalHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarekadMikonad = volvo.ayaMashinDarHalHarekatAst();

        //Then
        assertFalse(ayaHarekatMikonad);
        assertTrue(ayaVolvoHarekadMikonad);
        

        // object Mashin
        //new Mashin();
//        Mashin mashin = new Mashin();
//        mashin.bazKardanDar();
//        mashin.bastanDar();
//
//        System.out.println("aya dar mashin baz ast? " + mashin.ayaDarMashinBazAst);
//        mashin.harekat();
//
//        System.out.println("----------------------------------------");
//        Mashin peride = new Mashin("peride");
//        peride.roshan();
//        peride.bazKardanDar();
//        peride.harekat();

    }

    //Nested Class
    class Mashin{

      boolean ayaMashinRoshanAst;
      boolean ayaDarMashinBazAst;
      String mark;

      Mashin(){
            out.println("yek mashin bedon dade sakhteh shod.");
      }

      Mashin(String mark){
            this.mark = mark;
          out.println("yek mashin "+this.mark+" sakhteh shod.");
      }
      void roshan(){
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
      boolean ayaMashinDarHalHarekatAst(){
        if (!ayaDarMashinBazAst && ayaMashinRoshanAst) {
            out.println("mashin dar hal harekat ast.");
            return true;
        }else{
            out.println("mashin park ast.");
            return false;
        }
      }
    }
    String s;

    @Test
    void name() {

    }
}
