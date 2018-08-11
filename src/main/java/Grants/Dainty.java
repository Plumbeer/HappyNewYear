package Grants;

public class Dainty extends Grants {
    private int density;

    public Dainty(String nickname, double wt, double cost, int density) {
        super(nickname, wt, cost);
        this.density = density;
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        this.density = density;
    }

    @Override
    public String toString() {

        return "Лакомство, вот оно --> [" + super.toString() + ", плотность: " + density + " кг/м³" +"]";
    }
}
