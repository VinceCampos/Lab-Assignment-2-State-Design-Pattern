public class IdleState implements VendingMachineState {
    public void selectItem(VendingMachine currentSystem) {
        System.out.println("Item selected. Please insert coins");
        currentSystem.setState(new ItemSelectedState());
    }

    public void insertCoin(VendingMachine currentSystem, int amount) {
        System.out.println("Cannot accept coin. Please select an item first.");
    }

    public void dispenseItem(VendingMachine currentSystem) {
        System.out.println("No item is selected, cannot dispense");
    }

    public void setOutofOrder(VendingMachine currentSystem) {
        System.out.println("Machine is out of order.");
        currentSystem.setState(new OutOfOrderState());
    }

}