package DrinksVendingMachine;

public class Drinks {
    Choosing choosing;
    int liters;
    Drinks(Choosing choosing, int liters){
        this.choosing = choosing;
        this.liters = liters;
    }
    public int getLiters() { return liters; }
}
enum Choosing{
    COCA_COLA,
    PEPSI,
    SPRITE,
    FANTA,
    MIRINDA,
    LIPTON
};
