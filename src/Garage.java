import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Garage {


    // Attributter

    private ArrayList<Bil> bilpark;
    private String garageName;

    // Constructor
    public Garage(String garageName) {
        bilpark = new ArrayList<>();
        this.garageName = garageName;
    }

    // Andre metoder

    public void tilfoejBil(Bil nyBil){
        bilpark.add(nyBil);
    }

    public void visGarage(){
        for (int i = 0; i < bilpark.size() ; i++) {
            System.out.println(bilpark.get(i).visBil());
        }
    }

    public void gemGarage(){

        PrintWriter outputStream = null;

        try {
            outputStream = new PrintWriter(new FileWriter("garagefil.txt"));
            ArrayList<String> outputStrings = new ArrayList<>();

            for (int i = 0; i < bilpark.size(); i++) {
                outputStrings.clear();
                bilpark.get(i).bygAttributListe(outputStrings);

                for (String attribute : outputStrings) {
                    outputStream.println(attribute);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    public void fyldGarage(){

        BufferedReader inputStream = null;

        String regNr="";
        String maerke="";
        String model="";
        int aargang=0;
        int antalDoere=0;
        int batteriKapacitetKwh=0;
        int maxKm=0;
        int oktantal=0;
        int kmL = 0;
        double motorStr=0.0;
        LocalDateTime partikelfilterSkiftet = LocalDateTime.of(2017, 1, 1,  0, 0);
        String dataValue = "";
        String dataType = "";


        try {
            inputStream = new BufferedReader(new FileReader("garagefil.txt"));
            String l;
            Bil nyBil = null;

            while ((l = inputStream.readLine()) != null) {
                String[] dataset;
                dataset = l.split(",");
                dataType = dataset[0];
                if (dataset.length > 1){
                    dataValue = dataset[1];
                }

                switch (dataType){

                    case Main.BRIK_ELBIL_START: {
                        break;
                    }
                    case Main.BRIK_ELBIL_SLUT: {
                        tilfoejBil(new Elbil(regNr,maerke,model,aargang,antalDoere,batteriKapacitetKwh,maxKm));
                        break;
                    }
                    case Main.BRIK_BENZINBIL_START: {
                        break;
                    }
                    case Main.BRIK_BENZINBIL_SLUT: {
                        tilfoejBil(new BenzinBil(regNr,maerke,model,aargang,antalDoere,oktantal,kmL,motorStr));
                        break;
                    }
                    case Main.BRIK_DIESELBIL_START: {
                        break;
                    }
                    case Main.BRIK_DIESELBIL_SLUT: {
                        tilfoejBil(new DieselBil(regNr,maerke,model,aargang,antalDoere,partikelfilterSkiftet));
                        break;
                    }
                    case Main.BRIK_REGNR:{
                        regNr = dataValue;
                        break;
                    }
                    case Main.BRIK_MAERKE: {
                        maerke = dataValue;
                        break;
                    }
                    case Main.BRIK_MODEL: {
                        model = dataValue;
                        break;
                    }
                    case Main.BRIK_AARGANG: {
                        aargang = Integer.parseInt(dataValue);
                        break;
                    }
                    case Main.BRIK_ANTALDOERE: {
                        antalDoere = Integer.parseInt(dataValue);
                        break;
                    }
                    case Main.BRIK_BATTERIKAPACITETKWH: {
                        batteriKapacitetKwh = Integer.parseInt(dataValue);
                        break;
                    }
                    case Main.BRIK_MAXKM: {
                        maxKm = Integer.parseInt(dataValue);
                        break;
                    }
                    case Main.BRIK_OKTANTAL: {
                        oktantal = Integer.parseInt(dataValue);
                    }
                    case Main.BRIK_KML: {
                        kmL = Integer.parseInt(dataValue);
                        break;
                    }
                    case Main.BRIK_MOTORSTR: {
                        motorStr = Double.parseDouble(dataValue);
                        break;
                    }
                    case Main.BRIK_PARTIKELFILTERSKIFTET: {
                        partikelfilterSkiftet = LocalDateTime.parse(dataValue);
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Hey makker - der mangler en fil");
            e.printStackTrace();
        } finally {
            if (inputStream != null)
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

}
