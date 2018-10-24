import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DieselBil extends Bil {


    private LocalDateTime partikelfilterSkiftet;

    public DieselBil(LocalDateTime partikelfilterSkiftet) {
        this.partikelfilterSkiftet = partikelfilterSkiftet;
    }

    public DieselBil(String regNr, String maerke, String model, int aargang, int antalDoere, LocalDateTime partikelfilterSkiftet) {
        super(regNr, maerke, model, aargang, antalDoere);
        this.partikelfilterSkiftet = partikelfilterSkiftet;
    }

    @Override
    public String visBil() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = partikelfilterSkiftet.format(formatter);

        return String.format("%s %s %s %d Antal døre: %d Partikelfilter skiftet: %s",
                super.getRegNr(), super.getMaerke(),super.getModel(),
                super.getAargang(), super.getAntalDoere(), formattedDate);
    }

    @Override
    public void bygAttributListe(ArrayList<String> attributListe) {
        attributListe.add(Main.BRIK_DIESELBIL_START);
        super.bygAttributListe(attributListe);
        attributListe.add(Main.BRIK_PARTIKELFILTERSKIFTET + "," + partikelfilterSkiftet.toString());
        attributListe.add(Main.BRIK_DIESELBIL_SLUT);
    }
}
