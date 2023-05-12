import khodro.mashin.Dande;
import khodro.mashin.Mashin;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        for (int index = 0; index < args.length; index++) {
            out.println(args[index]);
        }
        String mark = args[0];
        String GonjayeshSandog = args[1];
        Dande noeDande = Dande.valueOf(args[2]);
        Mashin mashin = new Mashin(mark, parseInt(GonjayeshSandog), noeDande);
        if(mashin.ayaDarHalHarekatAst()){
            out.println("Mashin dar hal harekat ast.");
        }else{
            out.println("Mashin park ast.");
        }

        out.println(mashin.getMark());

        Scanner scanner = new Scanner(System.in);
        out.println("esm shoma chi ast?");
        String nam = scanner.nextLine();

        out.println("lotfan senne khod ra vared konid?");
        String senn = scanner.nextLine();

        out.println("dar che shahri zendegi mikonid?");
        String namShahrMahalTavalod = scanner.nextLine();

        out.println("man "+nam+ " hastam. " + senn + " salleh az " + namShahrMahalTavalod );

        out.printf("payan Ejra");

     }
}