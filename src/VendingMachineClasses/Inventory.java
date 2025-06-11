package VendingMachineClasses;

public class Inventory {
    ItemShelf itemShelves[];

    Inventory(int itemCount){
        itemShelves = new ItemShelf[itemCount];
        initialiseInventory(itemCount);
    }

    private void initialiseInventory(int itemCount) {//internal method to empty/initialise inventory
        //assign a space to item shelf and update as sold state as true, will change it to false when item is added to that space
        int spaceCode = 101;
        for(int i=0; i< getItemShelves().length; i++){
            ItemShelf itemShelf = new ItemShelf();
            itemShelf.setCode(spaceCode++);
            itemShelf.setSoldOut(true);
            itemShelves[i] = itemShelf;
        }
    }

    public ItemShelf[] getItemShelves() {
        return itemShelves;
    }

    public void setItemShelves(ItemShelf[] itemShelves) {
        this.itemShelves = itemShelves;
    }

    public void addItem(Item item, int code){
        for(int i=0; i< getItemShelves().length; i++) {
            if (itemShelves[i].getCode() == code) {
                itemShelves[i].setSoldOut(false);
                itemShelves[i].setItem(item);
                System.out.println("Added item");
                break;
            }
        }
    }
    public void getItem(int code){
        for(int i=0; i< getItemShelves().length; i++) {
            if (itemShelves[i].getCode() == code) {
                System.out.println("item : "+ itemShelves[i].getItem().getItemType() + " "+ itemShelves[i].getItem().getPrice());
                break;
            }
        }
    }

    public static void fillInventory(VendingMachine vendingMachine, int itemCount) {
        //add item to inventory
        ItemShelf itemShelf[] = vendingMachine.getInventory().getItemShelves();

        for(int j=0; j<itemCount; j++){
            Item item = new Item();
            if(j<3){
                item.setItemType(ItemType.PEPSI);
                item.setPrice(10);
            }
            else if(j<6){
                item.setItemType(ItemType.SODA);
                item.setPrice(15);
            }
            else{
                item.setItemType(ItemType.CHIPS);
                item.setPrice(20);
            }
            itemShelf[j].setItem(item);
            itemShelf[j].setSoldOut(false);
        }
    }

    public static void displayInventory(VendingMachine vendingMachine){
        ItemShelf slots[] = vendingMachine.getInventory().getItemShelves();

        for (int i = 0; i < slots.length; i++) {

            System.out.println("CodeNumber: " + slots[i].getCode() +
                    " Item: " + slots[i].getItem().getItemType() +
                    " Price: " + slots[i].getItem().getPrice() +
                    " isAvailable: " + !slots[i].isSoldOut());
        }
    }

    public void updateSoldItem(int code){
        for(int i=0; i< getItemShelves().length; i++) {
            if (itemShelves[i].getCode() == code) {
                itemShelves[i].setSoldOut(true);
                System.out.println("UpdateSoldItem");
                break;
            }
        }
    }

}
