package structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {
    //structuri repetitive = for, while, foreach

    @Test

    public void testMethod() {
//afisareNumere();
//        afisareNUmereWhile();
//        afisareNUmerePare();
//        afisareNumerePareV2();
//        numarDivizibilCu3();
//        afisarePrimeleCinci();
        sumaCifre();
    }
    // afisam primele 50 de numere incepand de la 0
    public void afisareNumere() {
        for (int index = 0; index < 50; index++) {
            System.out.println("Valoarea curenta este " + index);
        }
    }

    public void afisareNUmereWhile() {
        int index = 0;
        while (index < 50) {
            System.out.println("Valoare curenta este " + index);
            index++;
        }
    }
    //asisam numerele pare de la 0 la 50
    public void afisareNUmerePare(){
        for (int index=0;index<50; index=index + 2){
            System.out.println("Numarul este par " + index);
        }
    }

    public void afisareNumerePareV2() {
        for (int index = 0; index < 50; index ++) {
            if (index % 2 == 0) {
                System.out.println("Numarul este par " + index);

            }
        }
    }

    //afisam numerele divizibile cu 3 de la 0 la 50
    public void numarDivizibilCu3(){
        int index = 0;
        while (index < 50) {
            if (index % 3 == 0) {
                System.out.println("Valoare curenta este divizibila cu 3 " + index);
            }
                index++;

        }
    }

    //Afisa primele 5 numere divizibile cu 5 de la 0 la 50
    public void afisarePrimeleCinci(){
        int counter = 0;
        for(int index=0;index<50;index++){
            if (index % 5 == 0){
                System.out.println("Numarul divizibil cu 5 " + index);
                counter++;
            }
            if (counter == 5){
                break;
            }
        }
    }

    //calculam suma cifrelor pana la 10
    public void sumaCifre (){
        int suma = 0;
        for ( int index=0; index<10;index++){
            suma=suma+index;
            //sau suma += index
                  }
        System.out.println("Suma este: " + suma);
    }
}

