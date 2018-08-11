package Grants;

public class Candy extends Grants {
    private  String style;

    public Candy(String nickname, double wt, double cost, String style) {
        super(nickname, wt, cost);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {

        return "Конфета, вот она --> [" + super.toString() + ", вид: " + style +"]";
    }
}
