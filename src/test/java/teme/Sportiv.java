package teme;

public class Sportiv {
    public String numeleSportului;
    public String tipulSportului;
    public int numarulJucatori;
    public String numeJucator;
    public String pozitieTeren;
    public String numeEchipa;
    public int varstaJucator;
    public int numarInscrieri;
    public int numarTrofee;

    public Sportiv(String numeleSportului, String tipulSportului, int numarulJucatori, String numeJucator, String pozitieTeren, String numeEchipa, int varstaJucator) {
        this.numeleSportului = numeleSportului;
        this.tipulSportului = tipulSportului;
        this.numarulJucatori = numarulJucatori;
        this.numeJucator = numeJucator;
        this.pozitieTeren = pozitieTeren;
        this.numeEchipa = numeEchipa;
        this.varstaJucator = varstaJucator;
    }

    public Sportiv(String numeJucator, String pozitieTeren, String numeEchipa, int varstaJucator, int numarInscrieri, int numarTrofee) {
        this.numeJucator = numeJucator;
        this.pozitieTeren = pozitieTeren;
        this.numeEchipa = numeEchipa;
        this.varstaJucator = varstaJucator;
        this.numarInscrieri = numarInscrieri;
        this.numarTrofee = numarTrofee;
    }

    public void prezentareSportiv() {
        if (numeleSportului != null ) {
            System.out.println("Sportul prezentat este: " + numeleSportului);
        }
        if(tipulSportului != null){
            System.out.println("Sportul este: " + tipulSportului);
        }
        if (numarulJucatori != 0){
            System.out.println("Numarul de jucatori din echipa: " + numarulJucatori);
        }
        System.out.println("Numele jucatorului este: " + numeJucator);
        System.out.println("Pozitie pe teren: " + pozitieTeren);
        System.out.println("Echipa: " + numeEchipa);
        System.out.println("Varsta jucatorului: " + varstaJucator);

        if (numarInscrieri != 0){
            System.out.println("Numar inscrieri: " + numarInscrieri);
        }
        if (numarTrofee != 0){
            System.out.println("Numar trofee castigate: " +numarTrofee);
        }




    }
}




