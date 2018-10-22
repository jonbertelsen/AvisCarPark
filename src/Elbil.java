public class Elbil extends Bil {

    // Attributter

    private int batteriKapacitetKwh = 0;
    private int maxKm = 0;

    public Elbil(int batteriKapacitetKwh, int maxKm) {
        this.batteriKapacitetKwh = batteriKapacitetKwh;
        this.maxKm = maxKm;
    }

    public Elbil(String regNr, String maerke, String model, int aargang, int batteriKapacitetKwh, int maxKm) {
        super(regNr, maerke, model, aargang);
        this.batteriKapacitetKwh = batteriKapacitetKwh;
        this.maxKm = maxKm;
    }

    @Override
    public String visBil(){
        return String.format("%s %s %s %d Kwh: %d MaxKm: %d",
                super.getRegNr(), super.getMaerke(),super.getModel(),
                super.getAargang(),batteriKapacitetKwh,maxKm);
    }


}
