public class DispensingState implements VendingMachineState {
    public void selectItem(VendingMachine currentSystem) {
        System.out.println("Dispensing in progress.");
    }

    public void insertCoin(VendingMachine currentSystem, int amount) {
        System.out.println("Dispensing in progress. You cannot insert coins in this process.");
    }

    public void dispenseItem(VendingMachine currentSystem) {
            if (currentSystem.getInventory() > 0) {
                currentSystem.reduceInventory();
                currentSystem.setBalance(0);
                System.out.println("Item dispensed. Returning to idle state.");
                currentSystem.setState(new IdleState());
            } else {
                System.out.println("Out of stock! Returning to idle state.");
                currentSystem.setState(new OutOfOrderState());
            }
        }

    public void setOutofOrder(VendingMachine currentSystem) {
        System.out.println("Machine is out of order.");
        currentSystem.setState(new OutOfOrderState());
    }

}