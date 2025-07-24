package oopAbstractizare;

import org.testng.annotations.Test;

public class AbstractizareTest

{
    @Test
    public void methodTest(){
        AngajatFullTIme stefi = new AngajatFullTIme("Danila","Stef", 20,"Mindit");
        stefi.mergeInConcediu();

        AngajatPartTime stef = new AngajatPartTime("David", "Stefa",30, "PFA");
        stef.mergeInConcediu();

    }
}
