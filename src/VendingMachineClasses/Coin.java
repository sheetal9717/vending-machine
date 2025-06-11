package VendingMachineClasses;

public enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);
//    behind the scene java creates :
//    public static final Coin PENNY = new Coin(1, "PENNY", 0);
//    public static final Coin NICKEL = new Coin(5, "NICKEL", 1);

    public int getValue() {
        return value;
    }

    final int value;


    Coin(int value) {
        this.value = value;
    }
}
