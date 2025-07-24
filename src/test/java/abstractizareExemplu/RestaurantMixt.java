package abstractizareExemplu;

public class RestaurantMixt extends Restaurant implements RestaurantNonVeganInterface,RestaurantVeganInterface {
    public RestaurantMixt(String nume, String adresa) {
        super(nume, adresa);
    }

    @Override
    public void meniu() {

    }

    @Override
    public void servireBurger() {

    }

    @Override
    public void servireHumus() {

    }
}
