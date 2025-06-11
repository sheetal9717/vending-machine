package VendingMachineState;
import VendingMachineClasses.Coin;
import VendingMachineClasses.VendingMachine;

public interface State {
    void clickOnInsertButton(VendingMachine vendingMachine);
    void insertCoin(VendingMachine vendingMachine, Coin coin);
    void clickOnStartProductSelectionButton( VendingMachine vendingMachine);
    void chooseProduct(VendingMachine vendingMachine, int code);
    void cancelOrRefund(VendingMachine vendingMachine, int amount);
    void dispenseProduct(VendingMachine vendingMachine, int code);
    void getChange(VendingMachine vendingMachine, int amount);
    void updateInventory(VendingMachine vendingMachine, int code);
}
