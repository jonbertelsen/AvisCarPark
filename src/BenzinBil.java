import java.util.ArrayList;

public class BenzinBil extends Bil  {

    // Attributter

    private int oktantal = 0;
    private int kmL = 0;
    private double motorStr = 0.0;

    public BenzinBil(int oktantal, int kmL, double motorStr) {
        this.oktantal = oktantal;
        this.kmL = kmL;
        this.motorStr = motorStr;
    }

    public BenzinBil(String regNr, String maerke, String model, int aargang, int antalDoere, int oktantal, int kmL, double motorStr) {
        super(regNr, maerke, model, aargang, antalDoere);
        this.oktantal = oktantal;
        this.kmL = kmL;
        this.motorStr = motorStr;
    }

    @Override
    public String visBil(){
        return String.format("%s %s %s %d Antal døre: %d Oktan: %d kmL: %d motorStr: %.1f",
                super.getRegNr(), super.getMaerke(),super.getModel(),
                super.getAargang(), super.getAntalDoere(), oktantal,kmL,motorStr);
    }

    @Override
    public void bygAttributListe(ArrayList<String> attributListe) {
        attributListe.add(Main.BRIK_BENZINBIL_START);
        super.bygAttributListe(attributListe);
        attributListe.add(Main.BRIK_OKTANTAL + "," + Integer.toString(oktantal));
        attributListe.add(Main.BRIK_KML + "," + Integer.toString(kmL));
        attributListe.add(Main.BRIK_MOTORSTR + "," + Double.toString(motorStr));
        attributListe.add(Main.BRIK_BENZINBIL_SLUT);
    }
}
