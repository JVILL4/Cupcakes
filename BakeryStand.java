public class BakeryStand {
    int standID;
    int soldCupCakes;
    static int totalCupCakes;
 
    /**
    * @param standID
    * @param soldCupCakes
    */
    public BakeryStand(int standID, int soldCupCakes) {
        this.standID = standID;
        this.soldCupCakes = soldCupCakes;
        totalCupCakes = totalCupCakes + soldCupCakes;
    }
    public void JustSold() {
        soldCupCakes++;
        totalCupCakes++;
    }
    public int numberOfCupCakes() {
        return soldCupCakes;
    }
    public static int totalNumberOfCupCakesSold() {
        return totalCupCakes;
    }
 
    @Override
    public String toString() {
        return "Bakery Stand # " + standID + " has sold " + soldCupCakes + ", All stands together sold " + totalCupCakes
                + " cupcakes.";
    }
 
    public static void main(String[] args) {
        BakeryStand bakeryStand1 = new BakeryStand(1, 3); // create BakeryStand objects
        bakeryStand1.JustSold(); // call JustSold
        BakeryStand bakeryStand2 = new BakeryStand(2, 6);
        System.out.println(bakeryStand1);
        System.out.println(bakeryStand2);
        // print details using toString method
    }
 
 }