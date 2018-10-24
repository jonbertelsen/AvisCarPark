import java.time.LocalDateTime;

public class Main {

    // Konstanter

    public static final String BRIK_REGNR = "RegNr";
    public static final String BRIK_MAERKE = "Maerke";
    public static final String BRIK_MODEL = "Model";
    public static final String BRIK_AARGANG = "Aargang";
    public static final String BRIK_BATTERIKAPACITETKWH = "batteriKapacitetKwh";
    public static final String BRIK_MAXKM = "maxKm";
    public static final String BRIK_OKTANTAL = "oktantal";
    public static final String BRIK_KML = "kmL";
    public static final String BRIK_MOTORSTR = "motorStr";
    public static final String BRIK_PARTIKELFILTERSKIFTET = "partikelfilterSkiftet";
    public static final String BRIK_ANTALDOERE = "antalDoere";
    public static final String BRIK_ELBIL_START = "ElBilStart";
    public static final String BRIK_BENZINBIL_START = "BenzinBilStart";
    public static final String BRIK_DIESELBIL_START = "DieselBilStart";
    public static final String BRIK_ELBIL_SLUT = "ElBilSlut";
    public static final String BRIK_BENZINBIL_SLUT = "BenzinBilSlut";
    public static final String BRIK_DIESELBIL_SLUT = "DieselBilSlut";

    public static void main(String[] args) {



        Garage avisBornholm = new Garage("AvisBornholm");

//        avisBornholm.tilfoejBil(new BenzinBil("TD32634","Volvo","V70",2016,4,95,9,2.0));
//        avisBornholm.tilfoejBil(new BenzinBil("AP33634","VW","Beetle II",1970,2,92,19,1.0));
//        avisBornholm.tilfoejBil(new BenzinBil("RE12634","Skoda","Octavia",2010,5,95,15,1.6));
//        avisBornholm.tilfoejBil(new Elbil("AP33636","Ford","A",1910,2,85,350));
//        avisBornholm.tilfoejBil(new BenzinBil("YE12631","BMW","318",2013,4,95,9,1.8));
//        avisBornholm.tilfoejBil(new Elbil("LP33638","Tesla","P85",2017,5,100,539));
//        avisBornholm.tilfoejBil(new DieselBil("TDK1221","VW","Passat",2018,4, LocalDateTime.of(2018, 1, 22,  0, 0)));
//        avisBornholm.tilfoejBil(new DieselBil("WIK2161","Peugeot","3008",2017,5, LocalDateTime.of(2017, 12, 3,  0, 0)));

        avisBornholm.fyldGarage();
        avisBornholm.visGarage();
        //avisBornholm.gemGarage();

    }
}
