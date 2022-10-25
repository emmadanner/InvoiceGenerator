public class Main
{
    public static void main(String[] args)
    {
        Invoice invoice;

        invoice = new Invoice();
        //get the data for the invoice
        invoice.getAddressData();
        //get address data
        invoice.getInvoiceData();
        //get the line item data
        invoice.displayInvoice();

    }
}