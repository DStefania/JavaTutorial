package staticConcept;

import org.testng.annotations.Test;

public class StaticTest {

    @Test

    public void testMethod(){
        Elev Mihai = new Elev( "Mihai", "Popescu" );
        Mihai.prezentareElev();

//        Elev.scoala = "Mihai Eminescu";

        Elev Andrei = new Elev("Andrei", "Ionescu");
        Andrei.prezentareElev();

        Elev Stefania = new Elev ("Stefania", "David");
        Stefania.prezentareElev();
    }

}
