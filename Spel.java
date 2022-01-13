package StenSaxPåse;
/**
 * @author Nemanja Gligorijevic Ilic
 * I den här klassen utförs spelet genom metoden nyttSpel()
 * @return null
 */
public class Spel {

    Spelare spelare = new Spelare(); // ny instans av klassen Spelare

    /**
     * Den här metoden anropar metoden från spelare instansen
     */
    public void visaResultat(){
        spelare.visaResultat();
    }

    /**
     * Den här metoden startar ett nytt spel. Dator och spelaren gör var sitt drag och efter det jämförs de och kontrolleras vem som har vunnit spelet
     * Efter det sätts resultatet i ArrayList genom att anropa metoden setResultat
     */
    public void nyttSpel(){
        Dator dator = new Dator(); // ny instans av Dator klass
        System.out.println("Vad väljer du?");
        System.out.println("1. Sten   2. Sax   3.Påse");
        String val = spelare.spelarensVal(); // man väljer ett element
        System.out.println("Du valde " + val);
        String datorsVal = dator.datorsVal(); // dator väljer ut ett slumpmässigt element
        System.out.println("Dators val var " + datorsVal);

        if((val.equalsIgnoreCase("Sten") && datorsVal.equalsIgnoreCase("Sax") // if-sats som kontrollerar om man har vunnit
        || (val.equalsIgnoreCase("Sax") && datorsVal.equalsIgnoreCase("Påse")
        || (val.equalsIgnoreCase("Påse") && datorsVal.equalsIgnoreCase("Sten"))))) {
            System.out.println("Du vann! Bra jobbat!");
            System.out.println();
            String resultat = "Vinst";
            spelare.setResultat(resultat); // sätter resultat i ArrayList
        } else if((datorsVal.equalsIgnoreCase("Sten") && val.equalsIgnoreCase("Sax") // if-sats som kontrollerar om dator har vunnit
                || (datorsVal.equalsIgnoreCase("Sax") && val.equalsIgnoreCase("Påse")
                || (datorsVal.equalsIgnoreCase("Påse") && val.equalsIgnoreCase("Sten"))))){
            System.out.println("Dator van denna gång!");
            System.out.println();
            String resultat = "Förlost";
            spelare.setResultat(resultat); // sätter resultat i ArrayList
        } else{
            System.out.println("Ni har samma val och paritet är oavgjort"); // om resultatet är inte något av de två ovanpå är partiet oavgjort
            String resultat = "Oavgjort";
            System.out.println();
            spelare.setResultat(resultat); // sätter resultat i ArrayList
        }
    }
}
