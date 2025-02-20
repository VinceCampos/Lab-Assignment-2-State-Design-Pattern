public class OutOfOrderState implements VendingMachineState {
    public void selectItem(VendingMachine currentSystem) {
        System.out.println("Machine is out of order. No selections allowed");
    }

    public void insertCoin(VendingMachine currentSystem, int amount) {
        System.out.println("Machines is out of order. Cannot insert coins.");
    }

    public void dispenseItem(VendingMachine currentSystem) {
        System.out.println("Machine is out of order. Cannot dispense item.");
    }

    public void setOutofOrder(VendingMachine currentSystem) {
        System.out.println("Machine is already out of order.");
        currentSystem.setState(new OutOfOrderState());
    }

}