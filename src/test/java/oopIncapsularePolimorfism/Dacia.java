package oopIncapsularePolimorfism;


import java.util.List;

public class Dacia extends Masina {
   public List<String> dotariExterioare;

    public Dacia(String marca, String model, String culoare, int caiPutere, int pret, List<String> dotariExterioare) {
        super(marca, model, culoare, caiPutere, pret);
        this.dotariExterioare = dotariExterioare;
    }
    public void prezentareComandaDacia (){
        prezentareComandaMasina();
        System.out.println("Dotari exterioare Dacia ");
        for (int i=0; i<dotariExterioare.size(); i++){
            System.out.println(i + ". " + dotariExterioare.get(i));
        }
    }

    public void pornesteMotor(){
        System.out.println("masina dacia porneste motorul electric");
    }

    public void procesarePlata(){
        System.out.println("Plata pentru masina Dacia se proceseaza cu suma de" +getPret());
    }

    public void procesarePlata(boolean buyBack){
        System.out.println("Plata pentru masina Dacia se proceseaza tinand cont de optiunea de buyBack");
    }

    public void procesarePlata(int procent){
        System.out.println("Plata pentru masina Dacia vine cu o reducere de " + procent+"%");
    }


    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }
}
