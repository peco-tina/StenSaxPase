package StenSaxPåse;
/**
 * @author Nemanja Gligorijevic Ilic
 * I den här klassen utförs main metod
 * Skapas en ny instans av klassen Meny och anropas metod startMeny()
 */
public class Main {
    /**
     * Startar spelet genom att skapa en ny instans av klassen Meny
     * @param args
     */
    public static void main(String[]args){
        Meny meny = new Meny(); // ny instans av klassen Meny
        meny.startMeny(); // anrop på metoden meny och början på spelet
    }
}
