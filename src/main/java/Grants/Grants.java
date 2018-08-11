package Grants;

public abstract class Grants {
    private String nickname;
    private double wt;
    private double cost;

    public Grants(String nickname, double wt, double cost) {
        this.nickname = nickname;
        this.wt = wt;
        this.cost = cost;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getWt() {
        return wt;
    }

    public void setWt(double wt) {
        this.wt = wt;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Logo = " + nickname + ", вес = " + wt + ", цена = " + cost;
    }
}
