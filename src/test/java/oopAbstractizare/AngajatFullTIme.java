package oopAbstractizare;

public class AngajatFullTIme extends Angajat implements AngajatInterface{

    private String firma;

    public AngajatFullTIme(String nume, String prenume, int varsta, String firma) {
        super(nume, prenume, varsta);
        this.firma = firma;
    }

    @Override
    public void mergeLaBirou() {
        System.out.println("Angajatul full time trebuie sa mearga la birou");
    }

    @Override
    public void primesteSalariul() {
        System.out.println("angajatul full time trebuie sa primeasca salariul");
    }

    @Override
    public void muncesteUnNumarFixDeOre() {
        System.out.println("angajatul full time lucreaza 40h pe sapt");
    }

    @Override
    public void mergeInConcediu() {
        System.out.println("angajatul full time merge in concediu");
    }
}
