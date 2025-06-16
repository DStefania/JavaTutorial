package teme;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Reteta {

    public String nume;
    public String aliment1;
    public double gramaj1;
    public char unitateMasura;
    public String aliment2;
    public double gramaj2;
    public String unitateMasura2;


    @Test
    public void testMethod() {
        prezentareReteta("Budinca cu gris","Gris",100,'g',"Lapte",200,"ml");
        extraAlimente();
        System.out.println();
        prezentareReteta("Porridge","Fulgi de Ovaz",50,'g',"Lapte de migdale",200,"ml");
    }

    public void prezentareReteta(String param1,String param2,double param3,char param4,String param5,double param6,String param7) {
        nume = param1;
        aliment1 = param2;
        gramaj1 = param3;
        unitateMasura = param4;
        aliment2 = param5;
        gramaj2 = param6;
        unitateMasura2 = param7;

        System.out.println("Reteta prezentata este "+nume);
        System.out.println("Primul incredient este: "+aliment1);
        System.out.println("Grame: " + gramaj1);
        System.out.println("Unitatea de masura: " + unitateMasura);
        System.out.println("Urmatorul incredient este: " +aliment2);
        System.out.println("Gramaj: "+gramaj2);
        System.out.println("Unitatea de masura este: "+unitateMasura2);
    }

//variabila locala
    public void extraAlimente(){
        int extra=20;
        System.out.println("Cantitatea initiala este: "+gramaj1);
        double gramajFinal=gramaj1-(gramaj1*extra)/100;
        System.out.println("Noul gramaj este: "+gramajFinal);
    }





}
