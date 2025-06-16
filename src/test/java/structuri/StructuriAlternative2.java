package structuri;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class StructuriAlternative2 {

    @Test
    public void testMethod(){
//        zileSaptamana(4);
//        zileSaptamana(9);

        cosFructe("banana");
        cosFructe("caisa");

    }
    //afisam o zi a saptamanii in functie de cifra introdusa
    public void zileSaptamana(int zi){
        switch (zi){
            case 1:
                System.out.println("Astazi este luni");
                break;
            case 2:
                System.out.println("Astazi este marti");
                break;
            case 3:
                System.out.println("Astazi este miercuri");
                break;
            case 4:
                System.out.println("Astazi este joi");
                break;
            case 5:
                System.out.println("Astazi este vineri");
                break;
            case 6:
                System.out.println("Astazi este sambata");
                break;
            case 7:
                System.out.println("Astazi este duminica");
                break;
            default:
                System.out.println("Nu exsita aceasta zi din saptamana");
        }
    }

    //afisam un fruct specific dintr-un cos cu fructe

    public void cosFructe(String fruct){
        switch (fruct){
            case "mar":
                System.out.println("In cosul cu fructe sunt mere");
                break;
            case "banana":
                System.out.println("in cosul cu fructe sunt banane");
                break;
            case "struguri":
                System.out.println("In cosul cu fructe sunt struguri");
                break;
            default:
                    System.out.println("Nu sunt fructe in cos");
        }
    }
}
