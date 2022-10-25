import java.util.Scanner;

public class LineItem
{
    private Product product;
    private int quantity;
    private double lineTotal;
    Scanner in;

    public LineItem()
    {
        in = new Scanner(System.in);

        //get the productitem name and unit price

        //get the quantity for this line item
    }

    public LineItem(Product product, int quantity, double lineTotal)
    {
        this.product = product;
        this.quantity = quantity;
        this.lineTotal = lineTotal;
    }

    public void getLineItemData()
    {
        product = new Product();
        product.getProductData();
        getQuantityData();
        setLineTotal(product, this.quantity);
    }

    public double getLineTotal()
    {
        return lineTotal;
    }

    public void setLineTotal(Product product, int quantity)
    {
        this.product = product;
        this.quantity = quantity;

        this.lineTotal = product.getUnitPrice() * quantity;
    };

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void getQuantityData()
    {
        setQuantity(SafeInput.getInt(in, "Enter quantity of products:"));
    }
}
