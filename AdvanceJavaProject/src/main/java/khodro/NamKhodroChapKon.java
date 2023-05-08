package khodro;

public class NamKhodroChapKon {
    Khodro[] khodroha;
    public NamKhodroChapKon(Khodro[] khodroha){
        this.khodroha = khodroha;
    }
    public String execute(){
        String namKhodroha = "";

        for (int neshangar = 0;neshangar <khodroha.length;neshangar++){
            Khodro khodro = khodroha[neshangar];
            if (neshangar != khodroha.length - 1) {
                namKhodroha = namKhodroha + khodro.getMark() + "-";
            }else{
                namKhodroha = namKhodroha + khodro.getMark();
            }
        }
        return namKhodroha;
    }
}
