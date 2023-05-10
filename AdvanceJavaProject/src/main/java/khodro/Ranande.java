package khodro;
//Outer Class
public class Ranande {

    private String noeGavahiname = "Paye 1"; // Run Time
    private static String Name = "Amir"; // Compile Time


    //Non-Static Nested Class : inner Class
    public class Gavahiname{
        public void print(){
            System.out.println("Class Non Static");
            System.out.println(noeGavahiname);
            System.out.println(Name);
        }

    }
    //Static Nasted Class
    public static class staticGavahiname{
        public void print(){
            System.out.println("Class Static");
            //System.out.println(noeGavahiname);
            System.out.println(Name);
        }

    }

}
