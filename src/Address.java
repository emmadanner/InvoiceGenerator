import java.util.Scanner;

public class Address
{
    private String title;
    private String street;
    private String city;
    private String state;
    private String zip;

    Scanner in;

    public Address()
    {
        in = new Scanner(System.in);
    }

    public Address(String title, String street, String city, String state, String zip)
    {
        this.title = title;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void getAddress()
    {
        setTitle(SafeInput.getNonZeroLenString(in, "Enter Address Title: "));
        setStreet(SafeInput.getNonZeroLenString(in, "Enter Street name: "));
        setCity(SafeInput.getNonZeroLenString(in, "Enter City name: "));
        setState(SafeInput.getNonZeroLenString(in,"Enter State: "));
        setZip(SafeInput.getRegExString(in, "Enter Zip: ",  "\\d{5}"));
    }

    @Override
    public String toString()
    {
        return "Address{" +
                "title='" + title + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", in=" + in +
                '}';
    }
}
