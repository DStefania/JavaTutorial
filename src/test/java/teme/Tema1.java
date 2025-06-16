package teme;

import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.Test;

public class Tema1 {

    public String mesaj;
    public int varsta;
    public String nume;
    public String prenume;
    public String caracterFinal;
    public String caracterInceput;
    public String text;
    public char caracterZ;
    public String textFinal;


    @Test
    public void testMethod() {

        tema1();

    }

    public void tema1() {
        mesaj = "Hello World";
        varsta = 35;
        nume = "Stefania";
        prenume = "Danila";
        caracterFinal = "Salut";
        caracterInceput = "Hello";
        text = "Ana are mere,pere,prune";
        caracterZ = 'Z';
        textFinal=" Poti pleca acasa dupa ce iti verific munca!";


        //1. Hello World
        System.out.println(mesaj);

        //2. Varsta ta (numar)
        System.out.println("Varsta este:" + varsta);

        //3. Numele si prenumele pe 2 randuri
        System.out.println("Nume:" + nume);
        System.out.println("Prenume:" + prenume);

        //4. Adauga la "Salut" caracterul "M" la final
        System.out.println(caracterFinal + "M");

        //5. Adauga la "Hello" caracterul "H" la inceput
        System.out.println("H" + caracterInceput);

//    //6. Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la finalul cuvantului caracterul "Z"
        System.out.println("Adaug Z dupa fiecare vocala: " + "A" + caracterZ + "na" + caracterZ + " " + "a" + caracterZ + "re" + caracterZ + " " + "me" + caracterZ + "re" + caracterZ + "," + "pe" + caracterZ + "re" + caracterZ + "," + "pru" + caracterZ + "ne" + caracterZ);

        //7.Adauga la toate rezultatele obtinute " Poti pleca acasa dupa ce iti verific munca!"
        System.out.println(nume+ textFinal);
        System.out.println(prenume+ textFinal);
        System.out.println(varsta+ textFinal);
        System.out.println(caracterFinal + "M" + textFinal);
        System.out.println("H" + caracterInceput + textFinal);
        System.out.println( "A" + caracterZ + "na" + caracterZ + " " + "a" + caracterZ + "re" + caracterZ + " " + "me" + caracterZ + "re" + caracterZ + "," + "pe" + caracterZ + "re" + caracterZ + "," + "pru" + caracterZ + "ne" + caracterZ + textFinal);

        //8. Afisam in consola salariul unui angajat daca acesta are prenumele Andrei;
        //9. Afisam in consola ID de angajat si Departamentul din care face parte un angajat daca numele acestuia este "Popescu"
        //10. Utilizand o metoda cu parametrii afisati numarul unui departament daca acesta este mai mare de 287;


        //! BONUS !
        //Afisati in consola rezultatul ecuatiei:[2+(3*4)-3]/3 ?
        //  Rezultatul corect este: {rezultatul}

    }
}


