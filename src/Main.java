public class Main {

    public static void main(String[] args) {

        Garage avisBornholm = new Garage("AvisBornholm");

        avisBornholm.tilfoejBil(new BenzinBil("TD32634","Volvo","V70",2016,95,9,2.0));
        avisBornholm.tilfoejBil(new BenzinBil("AP33634","VW","Beetle II",1970,92,19,1.0));
        avisBornholm.tilfoejBil(new BenzinBil("RE12634","Skoda","Octavia",2010,95,15,1.6));
        avisBornholm.tilfoejBil(new Elbil("AP33636","Ford","A",1910,85,350));
        avisBornholm.tilfoejBil(new BenzinBil("YE12631","BMW","318",2013,95,9,1.8));
        avisBornholm.tilfoejBil(new Elbil("LP33638","Tesla","P85",2017,100,539));

        avisBornholm.visGarage();

    }
}
