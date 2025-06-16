package teme;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RetetaMultimi {

    @Test
    public void testMethod() {
        Reteta();
    }

    public void Reteta() {
        Map<String, List<String>> incrediente = new LinkedHashMap<>();
        incrediente.put("Gris cu Lapte", Arrays.asList("500 ml lapte", " 100g gris", "esenta de vanilie", "30g zahar"));
        incrediente.put("Paste cu creveti", Arrays.asList("250 g paste","500g creveti","500g spanac", "250 g rosii cherry","250 ml smantana de gatit","3 catei de usturoi","sare","piper"));
        incrediente.put("Briose cu banane si zmeura", Arrays.asList("4 oua", "150g faina", "2 banane coapte", "150 g zmeura","1/2 plic praf de copt", "1l ulei de cocos"));
        for (String key : incrediente.keySet()) {
            System.out.println("Reteta prezentata este: " + key);
            System.out.println("Incredientele pentru reteta sunt: " + incrediente.get(key));
        }
    }
}
