package StenSaxPåse;
import java.util.Scanner;
/**
 * @author Nemanja Gligorijevic Ilic
 * I den här klassen ligger två metoder som används för att hantera huvudmeny och meny som visas upp efter spelet.
 */
public class Meny {
    Spel spel = new Spel();

    /**
     * Den här metoden hanterar start meny på spelet
     */
    public void startMeny(){ // meny som visas i början av spelet
        Scanner scanner = new Scanner(System.in);

        while(true) { // itererar så länge man inte skriver in 3
            System.out.println("Skriv in ditt val!");
            System.out.println("1.Nytt spel \n2.Visa historik \n3.Avsluta spelet");
            int val = scanner.nextInt();
            scanner.nextLine();

            if(val == 1){
                while(true) {
                    spel.nyttSpel();
                    menyEfterSpelet();
                }
            }
            if(val == 2){
                spel.visaResultat();
            }
            if(val == 3){
                System.exit(0);
            }
        }
    }

    /**
     * Den här metoden hanterar meny som dyker upp efter att spelet är slut
     */
    public void menyEfterSpelet(){ // meny som visas efter ett spel
        Scanner scanner = new Scanner(System.in);
        while(true){ // itererar så länge man inte skriver in 1 eller 3
            System.out.println("Här väljer du om du vill gå tillbaka till huvudmeny, spela ett nytt spel eller avsluta spelet.");
            System.out.println("1.Huvudmeny \n2.Nytt spel \n3.Avsluta spelet");
            int val = scanner.nextInt();
            scanner.nextLine();

            if(val == 1){
                startMeny();
            }
            if(val == 2){
                spel.nyttSpel();
            }
            if(val == 3){
                System.exit(0);
            }
        }
    }
}
