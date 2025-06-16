package teme;

import org.testng.annotations.Test;

public class Masina {

    public String brand;
    public String model;
    public int an;
    public String culoare;
    public int nrUsi;
    public boolean esteAutomata;
    public float motor;
    public String versiune;
    public String motorizare;
    public String sasiu;
    public float consum;

@Test
    public void prezentareMasina(){
    brand = "Peugeot";
    model = "2008";
    an = 2021;
    culoare = "Gri";
    nrUsi = 5;
    esteAutomata = true;
    motor = 1.5f;
    versiune = "BlueHDI STT EAT8 GT Line";
    motorizare = "Diesel";
    sasiu= "VR3UDYHZSMJ892041";
    consum = 5.2f;

    System.out.println("Marca este "+brand);
    System.out.println("Modelul este "+model);
    System.out.println("An fabriacatie "+an);
    System.out.println("Culoarea este: "+culoare);
    System.out.println("Numar usi: "+nrUsi);
    System.out.println("Este Automata? "+esteAutomata);
    System.out.println("Motor: "+motor);
    System.out.println("Versiunea este: "+ versiune);
    System.out.println("Motorizare: "+motorizare);
    System.out.println("Consum: "+consum);

}


}
