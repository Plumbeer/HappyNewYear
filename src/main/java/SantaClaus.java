import Grants.Grants;
import Grants.Chocolate;
import Grants.Candy;
import Grants.Delicacy;
import Grants.Dainty;

public class SantaClaus {
    public static void main (String[] args){
        Chocolate Choco_1 = new Chocolate("Snickers", 0.230, 52.42, 5);
        Chocolate Choco_2 = new Chocolate("Mars", 0.220, 48.33, 3);
        Chocolate Choco_3 = new Chocolate("Nuts", 0.250, 45.31, 6);
        Candy Chupa_1 = new Candy("Chupas", 0.070, 7.38, "леденцы");
        Candy Chupa_2 = new Candy("Chupick", 0.150, 12.25, "леденцы");
        Delicacy Bize_1 = new Delicacy("Безе", 0.300, 32.44, "целофан");
        Dainty Marmel_1 = new Dainty("Haribo", 0.304, 68.27, 103);

        Grants[] box = {Choco_1, Choco_2, Choco_3, Chupa_1, Chupa_2, Bize_1, Marmel_1};

        double allWt = 0;
        for (Grants sumWt: box) {
            allWt += sumWt.getWt();
        }
        System.out.println("Общий вес подарка: " + allWt + " кг");

        double allCost = 0;
        for (Grants sumCost: box) {
            allCost += sumCost.getCost();
        }
        System.out.println("Общая стоимость подарка: " + allCost + " руб.");


        for (Grants someGrants: box) {
            System.out.println(someGrants.toString());
        }

    }
}
