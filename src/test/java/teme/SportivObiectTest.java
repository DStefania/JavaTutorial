package teme;

import org.testng.annotations.Test;

public class SportivObiectTest {

    @Test
    public void testMethod(){
        Sportiv sportivFotbal= new Sportiv("Fotbal","Sport de Echipa",11,"Lamine Yamal","Atacant",
                " FC Barcelona",18);
        sportivFotbal.prezentareSportiv();
        System.out.println();

        Sportiv sportivFotbalPerformanta= new Sportiv("Lamine Yamal","Atacant"," FC Barcelona",18,25,5);
        sportivFotbalPerformanta.prezentareSportiv();
        System.out.println();

        Sportiv sportivBasket= new Sportiv("Basketball","Sport de echipa",5,"LeBron James","Pivot",
                "Lakers",40);
        sportivBasket.prezentareSportiv();
        System.out.println();

        Sportiv sportivBasket2= new Sportiv("LeBron James","Pivot","Lakers",40,24,101);
        sportivBasket2.prezentareSportiv();
        System.out.println();

    }
}
