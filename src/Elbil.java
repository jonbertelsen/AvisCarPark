import java.util.ArrayList;

public class Elbil extends Bil {

    // Attributter

    private int batteriKapacitetKwh = 0;
    private int maxKm = 0;

    public Elbil(int batteriKapacitetKwh, int maxKm) {
        this.batteriKapacitetKwh = batteriKapacitetKwh;
        this.maxKm = maxKm;
    }

    public Elbil(String regNr, String maerke, String model, int aargang, int antalDoere, int batteriKapacitetKwh, int maxKm) {
        super(regNr, maerke, model, aargang, antalDoere);
        this.batteriKapacitetKwh = batteriKapacitetKwh;
        this.maxKm = maxKm;
    }

    @Override
    public String visBil(){
        return String.format("%s %s %s %d Antal døre: %d Kwh: %d MaxKm: %d",
                super.getRegNr(), super.getMaerke(),super.getModel(),
                super.getAargang(), super.getAntalDoere(),batteriKapacitetKwh,maxKm);
    }

    @Override
    public void bygAttributListe(ArrayList<String> attributListe) {
        attributListe.add(Main.BRIK_ELBIL_START);
        super.bygAttributListe(attributListe);
        attributListe.add("batteriKapacitetKwh," + Integer.toString(batteriKapacitetKwh));
        attributListe.add("maxKm," + Integer.toString(maxKm));
        attributListe.add(Main.BRIK_ELBIL_SLUT);
    }

}
