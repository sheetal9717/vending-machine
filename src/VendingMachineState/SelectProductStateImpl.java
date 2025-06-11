package VendingMachineState;

import VendingMachineClasses.*;

import java.util.Iterator;

public class SelectProductStateImpl implements State {
    public SelectProductStateImpl() {
        System.out.println("===Vending machine in SelectProduct State===");
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
        //1.get item using code from inventory
        //2.calculate coinList value
        //3.if item isn't available, cancel/refund
        //4.if coin value is sufficient, return remaining using getChange
        //5.if coin value isn't sufficient, cancel/refund

        System.out.println("chooseProduct");

        Inventory inventory = vendingMachine.getInventory();
        ItemShelf itemShelf[] = inventory.getItemShelves();
        Item item = null;

        for(int i=0; i< itemShelf.length; i++){
            if(itemShelf[i].getCode() == code){//product has valid code i.e product exist
                if(!itemShelf[i].isSoldOut()){ //product is available
                    item = itemShelf[i].getItem();
                    System.out.println("");
                    System.out.println("Choosen product is : " + item.getItemType() + " "+ item.getPrice());
                    System.out.println("");
                    break;
                }
            }
        }

        int coinValue = 0;
        Iterator it = vendingMachine.getCoinList().iterator();
        while(it.hasNext()){
            Coin coin = (Coin)it.next();
            coinValue += coin.getValue();
        }

        if(item == null){
            System.out.println("Item is not available");
            cancelOrRefund(vendingMachine, coinValue);
        }
        else if(coinValue >= item.getPrice()){ //product can dispensed
            if( coinValue > item.getPrice()){
                getChange(vendingMachine, coinValue - item.getPrice());
            }
            vendingMachine.setState(new DispenseStateImpl( vendingMachine, code));
        }
        else{
            //product can't dispensed due insufficient balance
            cancelOrRefund(vendingMachine, coinValue);
        }

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
        System.out.println("Collect Remaining amount : " + amount);
    }


    @Override
    public void updateInventory(VendingMachine vendingMachine, int code) {

    }
}
