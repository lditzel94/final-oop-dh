package city.interfaces;

public abstract class Estate {
    private String street;
    private int number;


    public String getStreet() {
        return street;
    }

    public void setStreet( String street ) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber( int number ) {
        this.number = number;
    }

    public abstract double calcTaxes();
}
