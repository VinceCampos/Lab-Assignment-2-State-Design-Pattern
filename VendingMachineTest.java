public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine system = new VendingMachine(5);
        system.selectItem();
        system.insertCoin(50);
        system.dispenseItem();;
        system.setOutOfOrder();
        system.dispenseItem();
        system.insertCoin(50);
        system.selectItem();
        system.setOutOfOrder();
    }
}