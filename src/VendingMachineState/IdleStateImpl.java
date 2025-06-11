package VendingMachineState;

import VendingMachineClasses.Coin;
import VendingMachineClasses.VendingMachine;

public class IdleStateImpl implements State{
    public IdleStateImpl() {

    }

    @Override
    public void clickOnInsertButton(VendingMachine vendingMachine) {
        System.out.println("clickOnInsertButton");
        System.out.println("");
        vendingMachine.setState(new HasMoneyStateImpl());
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

    }

    @Override
    public void getChange(VendingMachine vendingMachine, int amount) {

    }


    @Override
    public void updateInventory(VendingMachine vendingMachine, int code) {

    }
}
