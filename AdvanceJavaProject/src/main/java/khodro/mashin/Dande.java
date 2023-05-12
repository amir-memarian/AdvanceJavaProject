package khodro.mashin;

import static java.lang.System.out;

public enum Dande {
    AUTOMATIC("Otomatic","Automatiqu"),
    MANUAL("Dasti","Manual");
    private final String toPersian;
    private final String toFerench;

    Dande(String toPersian,String toFerench) {
        this.toPersian = toPersian;
        this.toFerench = toFerench;
    }

    public static void print() {
        Dande[] values = Dande.values();
        for (int index = 0; index < values.length; index++) {
            out.println(values[index]);
        }
    }

    public static void printToPersian() {
        Dande[] values = Dande.values();
        for (int index = 0; index < values.length; index++) {
            out.println(values[index].toPersian);
        }
    }

    public static void printToFerench() {
        Dande[] values = Dande.values();
        for (int index = 0; index < values.length; index++) {
            out.println(values[index].toFerench);
        }
    }

    public String getToPersian() {
        return toPersian;
    }

    public String getToFerench() {
        return toFerench;
    }
}
