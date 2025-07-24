package oopAbstractizare;

public class AngajatPartTime extends Angajat implements AngajatInterface{

    private String contractor;

    public AngajatPartTime(String nume, String prenume, int varsta, String contractor) {
        super(nume, prenume, varsta);
        this.contractor = contractor;
    }

    @Override
    public void mergeLaBirou() {
        System.out.println("Angajatul part time nu trebuie sa vina asa des la birou");
    }

    @Override
    public void primesteSalariul() {
        System.out.println("Angajatul part time nu primeste un salariu full time");
    }

    @Override
    public void muncesteUnNumarFixDeOre() {
        System.out.println("Angajatul part time nu trebuie sa muncesaca 20 de ore");
    }

    @Override
    public void mergeInConcediu() {
        System.out.println("Angajatul part time nu tare zile libere");
    }
}
