package VendingMachineClasses;

import VendingMachineState.IdleStateImpl;
import VendingMachineState.State;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    Inventory inventory;
    List<Coin> coinList;
    State state;

    public VendingMachine(int itemCount) {
        this.state = new IdleStateImpl();//initial state
        this.coinList = new ArrayList<>();
        this.inventory = new Inventory( itemCount ); //capacity of vending machine
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
