package exceptii;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptii {

    //sunt 2 tipuri de exceptii: checked si unchecked

    @Test
    public void testMethod() throws FileNotFoundException {
//        printFileContent();
//        printStudents();
//        printNoTobacco();
        printFileContentV2();
    }

    //citim continutul dintr-un fisier
    public void printFileContent() {
        String pathFile = "path-ulcatrefisier";
        File file = new File(pathFile);
        try {
            FileInputStream fileContent = new FileInputStream(file);
            System.out.println("A intrat in try");
        } catch (FileNotFoundException e) {
            System.out.println("A intrat in catch");
        } finally {
            System.out.println("A intrat in finally");
        }
    }

    //definim o lista de cursanti

    public void printStudents(){
        String [] colegi = new String[2];
        colegi [0] = "Andrei";
        colegi [1]="Bianca";
        colegi [2] = "Maria";

        for ( int index=0; index< colegi.length; index++){
            System.out.println(colegi[index]);
        }
    }

    // facem o regula de a nu vinde tigari la minori
    public void printNoTobacco(){
        int varsta = 15;
        if (varsta < 18){
            throw new RuntimeException("Nu vindem tigari minorilor");
        }else{
            System.out.println("Persoana este majora");
        }
    }

    // print content file v2
    public void printFileContentV2() throws FileNotFoundException {
        String pathFile = "path-ulcatrefisier";
        File file = new File(pathFile);
        FileInputStream fileContent = new FileInputStream(file);
    }

}
