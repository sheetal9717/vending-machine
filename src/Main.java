import VendingMachineClasses.*;
public class Main {
    public static void main(String[] args) {

        //create VM object
        //fill item to inventory
        //perform all state transition
        int itemCount = 10;
        VendingMachine vendingMachine = new VendingMachine( itemCount);

        Inventory.fillInventory(vendingMachine, itemCount);
        Inventory.displayInventory(vendingMachine);

        vendingMachine.getState().clickOnInsertButton(vendingMachine);

        System.out.println();
        vendingMachine.getState().insertCoin(vendingMachine, Coin.DIME); //method is in loop in state diagram
        vendingMachine.getState().insertCoin(vendingMachine, Coin.NICKEL);
        vendingMachine.getState().insertCoin(vendingMachine, Coin.PENNY);
        System.out.println();

        vendingMachine.getState().clickOnStartProductSelectionButton(vendingMachine);
        vendingMachine.getState().chooseProduct(vendingMachine, 105);

        System.out.println();
        Inventory.displayInventory(vendingMachine);


    }
}