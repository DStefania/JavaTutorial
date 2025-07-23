package oopAbstractizare;

public class AngajatFullTIme extends Angajat implements AngajatInterface{

    private String firma;

    public AngajatFullTIme(String nume, String prenume, int varsta, String firma) {
        super(nume, prenume, varsta);
        this.firma = firma;
    }

    @Override
    public void mergeLaBirou() {

    }

    @Override
    public void primesteSalariul() {

    }

    @Override
    public void muncesteUnNumarFixDeOre() {

    }

    @Override
    public void mergeInConcediu() {

    }
}
