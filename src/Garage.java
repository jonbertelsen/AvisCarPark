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

    // Gettere og settere

    // Andre metoder

    public void tilfoejBil(Bil nyBil){
        bilpark.add(nyBil);
    }

    public void visGarage(){
        for (int i = 0; i < bilpark.size() ; i++) {
            System.out.println(bilpark.get(i).visBil());
        }
    }

}
