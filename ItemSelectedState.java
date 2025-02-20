public class ItemSelectedState implements VendingMachineState {
    public void selectItem(VendingMachine currentSystem) {
        System.out.println("Item selected. Insert Coins.");
    }

    public void insertCoin(VendingMachine currentSystem, int amount) {
        currentSystem.addBalance(amount);
        System.out.println("Coin inserted: " + amount);
        System.out.println("Inserted: " + amount + ". Current balance: " + currentSystem.getBalance()  + " coins");
        currentSystem.setState(new DispensingState());

        if (currentSystem.getBalance() >= currentSystem.getItemPrice()) {
            System.out.println("Sufficient balance. Dispensing item...");
            currentSystem.setState(new DispensingState());
            currentSystem.dispenseItem(); 
        }
    }

    public void dispenseItem(VendingMachine currentSystem) {
        System.out.println("Cannot dispense. No coins inserted");
    }

    public void setOutofOrder(VendingMachine currentSystem) {
        System.out.println("Machine is out of order.");
        currentSystem.setState(new OutOfOrderState());
    }

}