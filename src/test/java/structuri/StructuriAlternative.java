package structuri;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class StructuriAlternative {

    //structuri alternative= If (conditie 1.. conditie n) Then ... Else, Switch..Case
    //putem avea mai multe conditii intre parantezecare se delimiteaza folosind operatorii logici: &&, ||, !
    //nu este obligatriu ca un if sa aibe else
    //putem adauga maimulte structuri de tipul IF cu ajutorul lui Else folosind Else/IF

    @Test
    public void testMethod() {
//        celMaiMareNumar(15,34);
//        celMaiMareNumar(0,-1);
//        celMaiMareNumar(11,11);
//        celMaiMareNumar(-2,-8);

//        numarPar(5);
//        numarPar(2);
//        numarPar(0);
//        numarPar(-7);

//        numarParv2(5);
//        numarParv2(2);
//        numarParv2(0);
//        numarParv2(-7);
//        numarParv2(-13);
//        numarParv2(-8);
//        numarParv2(9);

//        lungimeaParolei("kjsjalal");
//        lungimeaParolei("kjsjala");
//        lungimeaParolei("kjsjalal125415");
//        lungimeaParolei("kjsjalal1254157");
//        lungimeaParolei("kjsjalal12547894");
//        lungimeaParolei("");

        lungimeParolav2("sdft$");
        lungimeParolav2("1234567890@1");
        lungimeParolav2("1234s&ytA");

    }

    //verificam care este numarul cel mai mare dintre 2 valori
    public void celMaiMareNumar(int nr1, int nr2) {
        if (nr1 > nr2) {
            System.out.println("Cel mai mare numar dintre " + nr1 + " si " + nr2 + " este " + nr1);
        } else {
            System.out.println("Cel mai mare dintre  " + nr1 + " si " + nr2 + " este :" + nr2);
        }
    }

    //verificam daca un numar este par
    //daca vrem sa lucram cu catul unei impartiri folosim / (divide div)
    //daca vrem sa lucram cu restul unei impartiri folosim % (modulo)
    public void numarPar(int nr) {
        if (nr % 2 == 0) {
            System.out.println("Numarul " + nr + " este par");
        } else {
            System.out.println("Numarul " + nr + " este impar ");
        }

    }

    //verificam daca un numar este par si pozitiv
    public void numarParv2(int nr) {
        if (nr % 2 == 0) {
            if (nr > 0) {
                System.out.println("Numarul " + nr + " este par si pozitiv");
            } else {
                System.out.println("Numarul " + nr + " este par si negativ");
            }

        } else if (nr % 2 != 0) {
            if (nr > 0) {
                System.out.println("Numarul " + nr + " este impar si pozitiv");
            } else {
                System.out.println("Numarul " + nr + " este impar si negativ");
            }
        } else {
            System.out.println("Numarul  este 0"); //verifica inregistrarea ca nu a mers cum trebuie
        }
    }


    // verificam daca lungimea unei parole este cuprinsa intre 8 si 15 caractere
    public void lungimeaParolei(String parola) {
        if (parola.length() >= 8 && parola.length() <= 15) {
            System.out.println("Parola " + parola + " are lungimea intre 8 si 15 caractere");
        } else {
            System.out.println("Parola " + parola + " nu are lungimea intre 8 si 15 caractere");
        }

    }

//    adaugam extra verificari legat de continutul parolei
//    aceste verificari se focuseaza pe faptul ca parola trebuie sa contina: 1 caracter mare, 1 caracter special, 1 cifra

    public void lungimeParolav2(String parola) {
        if (parola.length() >= 8 && parola.length() <= 15) {
            if (parola.matches(".*[0-9].*") &&
                    parola.matches(".*[!@#$%^&*()\"{}\\[\\]||].*") &&
                    parola.matches(".*[A-Z].*")) {
                System.out.println("Parola "+parola+"este validă și respectă toate criteriile.");
            } else {
                System.out.println("Parola "+parola+" trebuie să conțină cel puțin o cifră, un caracter special (!@#$%^&*()\"{}[]||) și o literă mare.");
            }
        } else {
            System.out.println("Parola "+parola+"nu are lungimea între 8 și 15 caractere.");
        }
    }

}
//ctrl+alt+l sa se faca codul frumos







