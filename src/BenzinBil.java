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

    public BenzinBil(String regNr, String maerke, String model, int aargang, int oktantal, int kmL, double motorStr) {
        super(regNr, maerke, model, aargang);
        this.oktantal = oktantal;
        this.kmL = kmL;
        this.motorStr = motorStr;
    }

    @Override
    public String visBil(){
        return String.format("%s %s %s %d Oktan: %d kmL: %d motorStr: %.1f",
                super.getRegNr(), super.getMaerke(),super.getModel(),
                super.getAargang(),oktantal,kmL,motorStr);
    }



}
