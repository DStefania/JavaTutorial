package teme.rehearsal;

import org.testng.annotations.Test;

public class StructuriAlternativeRehearsal {

    @Test
    public void testMethod() {
        //numar par si pozitiv sau negativ
        numarParv2(4);

        numarParv2(-4);

        numarParv2(3);

        numarParv2(-3);

        numarParv2(0);

    }

    public void numarParv2(int nr) {
        if (nr == 0) {
            System.out.println("Numarul este 0");
        } else if (nr % 2 == 0) {
            if (nr > 0) {
                System.out.println("Numarul " + nr + " este par si pozitiv");
            } else {
                System.out.println("Numarul " + nr + " este par si negativ");
            }
        } else { // nr este impar
            if (nr > 0) {
                System.out.println("Numarul " + nr + " este impar si pozitiv");
            } else {
                System.out.println("Numarul " + nr + " este impar si negativ");
            }
        }
    }
}
