package VendingMachineState;

import VendingMachineClasses.Coin;
import VendingMachineClasses.VendingMachine;

public class DispenseStateImpl implements State{
    public DispenseStateImpl(VendingMachine vendingMachine, int code) {
        System.out.println("===Vending machine in Dispense State===");
        dispenseProduct(vendingMachine, code);
    }

    @Override
    public void clickOnInsertButton(VendingMachine vendingMachine) {

    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) {

    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) {

    }

    @Override
    public void cancelOrRefund(VendingMachine vendingMachine, int amount) {

    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine, int code) {
        System.out.println("Product is dispensed");
        updateInventory(vendingMachine, code);
        vendingMachine.setState(new IdleStateImpl());
    }

    @Override
    public void getChange(VendingMachine vendingMachine, int amount) {

    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, int code) {
        vendingMachine.getInventory().updateSoldItem(code);

    }
}
