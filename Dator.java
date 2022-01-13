package StenSaxPåse;
/**
 *@author Nemanja Gligorijevic Ilic
 * I den här klassen gör dator sitt val
 * */
public class Dator {

    String[] stenSaxPåseArray = {"Sten", "Sax", "Påse"};// Array som innehåller bara 3 element som dator kan välja mellan i spelet
    int datorVal = (int)(Math.random() * 3); // ett slumpmässigt nummer

    /**
     * Den här metoden returnerar dators slumpmässigt val
     * @return val
     */
    public String datorsVal() {
        String val = stenSaxPåseArray[datorVal]; // väljer ut ett element från Array
        return val;// retunerar det
    }
}
