package ECommerce;

import java.util.Scanner;

public class ECommerceBillingEngine {
    static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        Item[] items= {
                new Item(24, "Pen", 20),
                new Item(8, "Book", 50)
        };
        System.out.println("List of Available Items");
        for(Item item:items)    {
            System.out.println(item.id+"    "+item.name+"    "+item.unitPrice);
        }
        System.out.println("\nEnter number of different items purchased:");
        num=sc.nextInt();
        int []id=new int[num];
        int[] qty=new int[num];

        for(int i=0;i<num;i++)  {
            System.out.println("\nEnter item ID:");
            id[i]=sc.nextInt();

            System.out.println("\nEnter quantity");
            qty[i]=sc.nextInt();
        }
        Bill b=new Bill(id,qty);
        b.calculateTotal(items);
        sc.close();
    }
}