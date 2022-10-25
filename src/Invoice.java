import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Invoice
{
    private Address customerAddress;
    private LineItem lineitem;
    private ArrayList<LineItem> lineItemsList;
    private double amountDue = 0;

    Scanner in = new Scanner(System.in);

    public Invoice()
    {
        lineItemsList = new ArrayList<LineItem>();

        customerAddress = new Address();
        customerAddress.getAddress();
    }
    public void getInvoiceData()
    {
        boolean done = false;
        //getLineItem data
        do
        {
            LineItem item = new LineItem();

            item.getLineItemData();
            lineItemsList.add(item);

            done = SafeInput.getYNConfirm(in, "Would you like to add another product?");
        }
        while(!done);
    }
    public void getAddressData()
    {
        customerAddress.getAddress();
    }

    private double getTotalAmtDue()
    {
        for(LineItem items : lineItemsList)
        {
            this.amountDue += items.getLineTotal();
        }
        return amountDue;
    }

    public void displayInvoice()
    {
        System.out.println("Invoice");
        System.out.println("\n");
        System.out.println(customerAddress.getTitle());
        System.out.println(customerAddress.getStreet());
        System.out.println(customerAddress.getCity() + ", " + customerAddress.getState() + ", " + customerAddress.getZip());
        System.out.println("#########################################################");
        System.out.printf("%-30s %-30s %-30s %-30s", "Item", "Price", "Qty", "Total");

        for (LineItem item : lineItemsList)
        {
            System.out.println("\n");
            System.out.printf("%-30s %-30.2f %-30s %-30.2f", item.getProduct().getName(), item.getProduct().getUnitPrice(), item.getQuantity(), item.getLineTotal());
        }

        System.out.println("\n");
        System.out.println("#########################################################");
        System.out.printf("%-30s %-30.2f", "Amount Due:", getTotalAmtDue());
    }
}
