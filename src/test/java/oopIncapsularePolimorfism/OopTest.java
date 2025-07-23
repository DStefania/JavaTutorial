package oopIncapsularePolimorfism;


import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OopTest {

    @Test
    public void testMethod() {
        List<String> dotariExterioareLogan = Arrays.asList("Senzori de ploaie", "Camera Video", "Jante");
        Dacia Logan = new Dacia("Dacia", "Logan", "Rosu", 120, 20000, dotariExterioareLogan);

        Logan.prezentareComandaDacia();

        Logan.setCuloare("mov");
        Logan.setModel("Sandero");

        Logan.prezentareComandaDacia();
        Logan.pornesteMotor();
        Logan.procesarePlata();
        Logan.procesarePlata(true);
        Logan.procesarePlata(5);
        //System.out.println();

//        List<String> dotariInterioareF1 = Arrays.asList("Incalzire in scaune", "Bord din piele");
//        List<String> dotariExterioareF1 = Arrays.asList("Senzori parcare", "Camera");
//        McLaren F1 = new McLaren("McLaren", "F1", "gri", 200, 120000, dotariInterioareF1, dotariExterioareF1);
//        F1.prezentareComandaMcLaren();
//        F1.pornesteMotor();

    }
}
