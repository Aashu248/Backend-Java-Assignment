package Programs;

public class Bill {
    int[] itemId;
    int[] quantity;

    Bill(int[] itemId, int[] quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public void calculateTotal(Item[] items) {
        double total = 0;
        System.out.println("=========================BILL==========================");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Item", "Price", "Qty", "Amount");
        for (int i = 0; i < itemId.length; i++) {
            for (Item item : items) {
                if (item.id == itemId[i]) {
                    double amt = item.unitPrice * quantity[i];
                    total = total + amt;
                    System.out.printf("%-15s %-10.2f %-10d %-10.2f\n", item.name, item.unitPrice, quantity[i], amt);
                    break;
                }
            }
        }
        System.out.println("==========================================");
        System.out.printf("Total bill value: %.2f\n", total);
    }
}
