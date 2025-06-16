package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    //acesta este un comentariu
    //clasa=sablon specific unei entitati care contine variabile si metode
    //intr-un fisier Java recunoastem o clasa dupa cuvantul "class"
    //o clasa trebuie sa aiba un nume
    //variabilele/metodele unei clase se regasesc intre acolade
    //intr-un fisier java putem avea mai multe clase diferentiate prin nume
    //nu este un practice bun sa avem mai multe clase in acelasi fisier java
    //variabila= proprietatea unei clase
    //variabilele pot sa fie de 2 feluri:globale si locale
    //variabila GLOBALA=variabila care este prezente peste tot in fisierul java
    //variabila GLOBALA= public tipVariabila numeVariabila
    //o variabila poate sau nu sa primeasca o valoare
    //variabila locala= variabila care este prezenta doar in locul in care a fost definita
    //variabila locala= tipVariala numeVariala
    //METODA=actiunea unei clase
    //metodele pot sa fie de 2 feluri: void si return
    //metoda VOID= metoda care afiseaza rezultatul codului scris
    //metoda VOID=  public void numeMetoda(){}

    public String nume;
    public String prenume;
    public int varsta;
    public String adresa;
    public double inaltime;
    public float greutate;
    public char sex;
    public boolean areBursa;

    @Test
    public void prezentareStudent() {
        nume = "Danila";
        prenume = "Stef";
        varsta = 35;
        adresa = "Intr. Mesteacanului 10P1";
        inaltime = 1.55;
        greutate = 52.7f;
        sex = 'F';
        areBursa = true;

        System.out.println("Numele este"+ " " +nume);
        System.out.println("Prenumele este "+prenume);
        System.out.println("Varsta este "+varsta);
        System.out.println("Adresa este "+adresa);
        System.out.println("Inaltimea este "+inaltime);
        System.out.println("Greutatea este "+greutate);
        System.out.println("Sex: "+sex);
        System.out.println("Are bursa? "+areBursa);
    }
}
//clasa cu 10 variabile si o metoda de test si de afisat cu system out