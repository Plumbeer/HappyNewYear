package Grants;

public class Chocolate extends Grants {

    private int temper;

    public Chocolate(String nickname, double wt, double cost, int temper) {
        super(nickname, wt, cost);
        this.temper=temper;
    }

    public int getTemper() {
        return temper;
    }

    public void setTemper(int temper) {
        this.temper = temper;
    }

    @Override
    public String toString() {

        return "Шоколад, вот этот --> [" + super.toString() + ", температура хранения: " + temper + "°C" +"]";
    }
}
