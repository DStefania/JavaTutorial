package multimi;

import org.testng.annotations.Test;

import java.util.*;

public class Multimi {
// Multimi= array, list (arrayList), map

    @Test
    public void testMethod() {
//        colegiCurs();
//        multimeFructe();
//        multimeFructeLista();
//        colegiCursLista();
//        obiectiveTuristice();
        obiectiveTuristiceV2();
//        obiectiveTuristicev4();
    }

    //afisam numele colegilor de la curs
    public void colegiCurs() {
        String[] colegi = new String[10];
        colegi[0] = "Mihai";
        colegi[1] = "Roxana";
        colegi[2] = "Alex";
        colegi[3] = "Radu";
        colegi[4] = "Virgil";
        for (int index = 0; index < colegi.length; index++) {
            System.out.println("Numele colegului este " + colegi[index]);
        }
    }


    //afisam colegii cu lista
    public void colegiCursLista() {
        List<String> colegi = new ArrayList<>();
        colegi.add("Claudiu");
        colegi.add("Cozmin");
        colegi.add("Ioana");
        for (int index = 0; index < colegi.size(); index++) {
            System.out.println("Numele colegului este " + colegi.get(index));
        }
    }

    //afisam o multime de fructe
    public void multimeFructe() {
        String[] fructe = new String[5];
        fructe[0] = "Mar";
        fructe[1] = "Para";
        fructe[2] = "Banana";
        fructe[3] = "Cirese";
        fructe[4] = "Piersica";
        for (int index = 0; index < fructe.length; index++) {
            System.out.println("Numele fructului este " + fructe[index]);
        }
    }

    //afisam o multime de fructe - lista
    public void multimeFructeLista() {
        List<String> fructe = new ArrayList<>();
        fructe.add("Mar");
        fructe.add("Para");
        fructe.add("Banana");
        fructe.add("Cirese");
        fructe.add("Piersica");
        for (int index = 0; index < fructe.size(); index++) {
            System.out.println("Numele fructului este " + fructe.get(index));
        }

    }

    //afisam niste obiective turistice alaturi de orasele in care se afla
    //map=key-value
    public void obiectiveTuristice() {
        Map<String, String> obiective = new HashMap<>();
        obiective.put("Paris", "Turnul Eifel");
        obiective.put("Constanta", "Casino");
        obiective.put("Brasov", "Piata Sfatului");
        obiective.put("Roma", "Fontana di Trevi");
        obiective.put("Barcelna", "Sagrada Familia");
        obiective.put("Berlin", "Zidul Berlinului");
        for (String key : obiective.keySet()) {
            System.out.println("Orasul curent este: " + key);
            System.out.println("Obiectivul din oras este: " + obiective.get(key));
        }
    }


    public void obiectiveTuristiceV2() {
        Map<String, List<String>> obiective = new LinkedHashMap<>();
        obiective.put("Paris", Arrays.asList("Turnul Eifel", "Notre Dame", "Luvru"));
        obiective.put("Constanta", Arrays.asList("Casino"));
        obiective.put("Brasov", Arrays.asList("Piata Sfatului", "Biserica Neagra"));
        obiective.put("Roma", Arrays.asList("Fontana di Trevi", "Coloseum"));
        obiective.put("Barcelna", Arrays.asList("Sagrada Familia"));
        obiective.put("Berlin", Arrays.asList("Zidul Berlinului"));
        for (String key : obiective.keySet()) {
            System.out.println("Orasul curent este: " + key);
            System.out.println("Obiectivele din oras sunt: " + obiective.get(key));
        }

    }

    public void obiectiveTuristicev4() {
        Map<String, Map<String, List<String>>> obiective = new LinkedHashMap<>();

        Map<String, List<String>> oraseObiectiveFranta = new LinkedHashMap<>();
        oraseObiectiveFranta.put("Paris", Arrays.asList("Turn Efel", "Sacre Cour", "Louvre"));
        oraseObiectiveFranta.put("Lyon", Arrays.asList("f2"));
        oraseObiectiveFranta.put("Nice", Arrays.asList("f3", "f4"));

        Map<String, List<String>> oraseObiectiveItalia = new LinkedHashMap<>();
        oraseObiectiveItalia.put("Roma", Arrays.asList("Coloseum", "Forul Roman", "Fontana di Trevi"));
        oraseObiectiveItalia.put("Milano", Arrays.asList("Domul din Milano"));

        Map<String, List<String>> oraseObiectiveSpania = new LinkedHashMap<>();
        oraseObiectiveSpania.put("Barcelona", Arrays.asList("Sagrada Famiglia", "Mondjouc", "Parc Guell"));
        oraseObiectiveSpania.put("Madrid", Arrays.asList("Castelul Royal"));
        oraseObiectiveSpania.put("Sevilla", Arrays.asList("Piata", "Biserica"));

        obiective.put("Franta", oraseObiectiveFranta);
        obiective.put("Italia", oraseObiectiveItalia);
        obiective.put("Spania", oraseObiectiveSpania);

        for (Map.Entry<String, Map<String, List<String>>> taraEntry : obiective.entrySet()) {
            String tara = taraEntry.getKey();
            //System.out.println("Țara: " + tara);

            Map<String, List<String>> orase = taraEntry.getValue();
            for (Map.Entry<String, List<String>> orasEntry : orase.entrySet()) {
                String oras = orasEntry.getKey();
                // System.out.println("  Oraș: " + oras);

                List<String> obiectiveOras = orasEntry.getValue();
                for (String obiectiv : obiectiveOras) {
                    // System.out.println("    - " + obiectiv);
                    System.out.println("Țara: " + tara + "  Oraș: " + oras + " Obiectiv:  " + obiectiv);

                }
            }
        }
    }
//definiti o carte de retete , in care vor fi mai multe retete care se vor diferentia prin numele lor, fiecare reteta are incrediente
// afisare reteta/cartea
}

