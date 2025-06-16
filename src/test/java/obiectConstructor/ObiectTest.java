package obiectConstructor;

import org.testng.annotations.Test;

public class ObiectTest {

    @Test
    public void testMethod(){
        Masina stefaniaSkoda= new Masina("Skoda","Karoc","6.5l/100km","gri",
                120,3000,"150 km");
        stefaniaSkoda.prezentareComandaMasina();
        stefaniaSkoda.taxaGreutate();
        System.out.println();

        Masina stefaniaMercedes= new Masina("Mercedes","CLS","10.5l/100km","rosu",
                180,5000,"1500 km");
        stefaniaMercedes.prezentareComandaMasina();
        stefaniaMercedes.taxaGreutate();
        stefaniaMercedes.culoare="verde";
        stefaniaMercedes.model="S";
        stefaniaMercedes.prezentareComandaMasina();
        stefaniaMercedes.taxaGreutate();
        System.out.println();

        Masina stefaniaOpel= new Masina("Opel","Astra","7.5l/100km","negru",
                100,1000,"35000 km",17500);
        stefaniaOpel.prezentareComandaMasina();
        stefaniaOpel.taxaGreutate();
    }
}
