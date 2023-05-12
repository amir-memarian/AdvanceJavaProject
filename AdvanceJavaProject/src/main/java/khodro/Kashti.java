package khodro;

import khodro.Khodro;

public class Kashti extends Khodro {

/*    @Override
    protected void protectedMethod(){
        System.out.println("We are in kashti class.");
    }
*/

    @Override
    public String toString() {
        return "Kashti{}";
//        return super.toString();
    }

    @Override
    public boolean ayaDarHalHarekatAst() {
        protectedMethod();
        Mashin mashin = new Mashin();
      //  mashin.noeDande = "XXX";

        return false;
    }

    @Override
    public String getMark() {
        return "khodro.Kashti";
    }

    public void printRefrence() {
        System.out.println(this.toString());
    }

    public void printRefrenceObject(Object object){
        System.out.println(object);
    }
}
