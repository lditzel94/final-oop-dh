package city.models;

import city.interfaces.Estate;

public class House extends Estate {
    private double baseTax;
    private final String DEFAULT_STREET = "Av. San Martín";
    private final double TAX_MULTIPLIER = 0.1;


    public double getBaseTax() {
        return baseTax;
    }

    public void setBaseTax( double baseTax ) {
        this.baseTax = baseTax;
    }

    @Override
    public double calcTaxes() {
        String street = getStreet();
        if ( street.equals( DEFAULT_STREET ) )
            return baseTax * ( 1 - TAX_MULTIPLIER );

        return baseTax;
    }

    @Override
    public String toString() {
        return "Neighborhood{" +
                "street=" + super.getStreet() +
                "number=" + super.getNumber() +
                "tax=" + calcTaxes() +
                '}';
    }

}
