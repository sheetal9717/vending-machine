package VendingMachineState;

import VendingMachineClasses.Coin;
import VendingMachineClasses.VendingMachine;

public class HasMoneyStateImpl implements State{
    public HasMoneyStateImpl() {
        System.out.println("===Vending machine in  HasMoney State===");
    }

    @Override
    public void clickOnInsertButton(VendingMachine vendingMachine) {

    }

    @Override
    public void insertCoin(VendingMachine vendingMachine,  Coin coin) {
        System.out.println("Inserted coin is : "+ coin.name() +" with value : "+ coin.getValue());
        vendingMachine.getCoinList().add(coin);
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) {
        System.out.println(" clickOnStartProductSelectionButton ");
        System.out.println("");
        vendingMachine.setState( new SelectProductStateImpl() );
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) {

    }

    @Override
    public void cancelOrRefund(VendingMachine vendingMachine, int amount) {
        System.out.println("Refund amount " + amount);
        System.out.println("");
        vendingMachine.setState(new IdleStateImpl());
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
