package StenSaxPåse;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *@author Nemanja Gligorijevic Ilic
 * I den här klassen gör spelaren sitt val och resultat sparas efter spelet i en ArrayList
 */
public class Spelare {

    ArrayList <String> resultat = new ArrayList(); // skapas en ArrayList som ska innehålla resultat i form av String
    String [] stenSaxPåseArray = {"Sten", "Sax", "Påse"}; // Array som innehåller bara 3 element som används i spelet
    Scanner scanner = new Scanner(System.in); // ny scanner

    /**
     * Den här metoden används för att spelaren ska välja mellan sten, sax påse
     * @return String valElement. Returnerar spelarens val av element
     */
    public String spelarensVal(){
        int i = scanner.nextInt(); // man matar in sitt val 1 till 3
        int val = i - 1; // i - 1 används eftersom att index i array ligger mellan 0 och 2
        scanner.nextLine();
        String valElement = stenSaxPåseArray[val]; // väljer ut ett element från Array
        return valElement; // returnerar elementet
    }

    /**
     * Den här metoden sätter resultat i ArrayList i form av string
     * @param partietsResultat
     */
    public void setResultat(String partietsResultat){
        resultat.add(partietsResultat); // sätter ett nytt resultat i listan
    }

    /**
     * Den här metoden går genom ArrayList och skriver ut elementen som finns i ArrayList.
     */
    public void visaResultat(){
        for(String s : resultat){ // for-each loop för att skriva ut resultaten från ArrayLista
            System.out.println(s);
        }
        System.out.println();
    }
}
