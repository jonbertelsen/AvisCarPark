import java.util.ArrayList;

public abstract class Bil {

    // Attributter

    private String regNr;
    private String maerke;
    private String model;
    private int aargang;
    private int antalDoere;

    // Metoder

    // Constructor

    public Bil(){
        this.regNr = "";
        this.maerke = "";
        this.model = "";
        this.aargang = 0;
        this.antalDoere = 0;
    }

    public Bil(String regNr, String maerke, String model, int aargang, int antalDoere){
        this.regNr = regNr;
        this.maerke = maerke;
        this.model = model;
        this.aargang = aargang;
        this.antalDoere = antalDoere;
    }

    // Gettere og settere


    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getMaerke() {
        return maerke;
    }

    public void setMaerke(String maerke) {
        this.maerke = maerke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAargang() {
        return aargang;
    }

    public void setAargang(int aargang) {
        this.aargang = aargang;
    }

    public int getAntalDoere() {
        return antalDoere;
    }

    public String visBil(){
        return String.format("%s %s %s %d",regNr,maerke,model,aargang, antalDoere);
    }

    public void bygAttributListe(ArrayList<String> attributListe){
        attributListe.add(Main.BRIK_REGNR + "," + regNr);
        attributListe.add(Main.BRIK_MAERKE + "," + maerke);
        attributListe.add(Main.BRIK_MODEL + "," + model);
        attributListe.add(Main.BRIK_AARGANG + "," + Integer.toString(aargang));
        attributListe.add(Main.BRIK_ANTALDOERE + "," + Integer.toString(antalDoere));
    }

}
