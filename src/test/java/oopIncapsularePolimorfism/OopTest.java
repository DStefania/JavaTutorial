package oopIncapsularePolimorfism;


import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

public class OopTest {

    @Test
    public void testMethod() {
        List<String> dotariExterioareLogan = Arrays.asList("Senzori de ploaie", "Camera Video", "Jante");
        Dacia Logan = new Dacia("Dacia", "Logan", "Rosu", 120, 20000, dotariExterioareLogan);

        Logan.prezentareComandaDacia();
        System.out.println();

        Logan.model="Sandero";
        Logan.culoare='Gri';
        Logan.pret='10';



//        List<String> dotariInterioareF1 = Arrays.asList("Incalzire in scaune", "Bord din piele");
//        List<String> dotariExterioareF1 = Arrays.asList("Senzori parcare", "Camera");
//        McLaren F1 = new McLaren("McLaren", "F1", "gri", 200, 120000, dotariInterioareF1, dotariExterioareF1);
//        F1.prezentareComandaMcLaren();
    }
}
