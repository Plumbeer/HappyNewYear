package Grants;

public class Delicacy extends Grants {
    private String tightness;

    public Delicacy(String nickname, double wt, double cost, String tightness) {
        super(nickname, wt, cost);
        this.tightness = tightness;
    }

    public String getTightness() {
        return tightness;
    }

    public void setTightness(String tightness) {
        this.tightness = tightness;
    }

    @Override
    public String toString() {

        return "Деликатес, вот этот --> [" + super.toString() + ", упаковка: " + tightness + "]";
    }
}
