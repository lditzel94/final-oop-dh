package city.models;

import city.interfaces.Composable;
import city.interfaces.Estate;

import java.util.ArrayList;
import java.util.List;

public class Neighborhood extends Estate implements Composable {
    private int multiplier;
    private List<Estate> estates = new ArrayList<>();


    public double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier( int multiplier ) {
        this.multiplier = multiplier;
    }

    public List<Estate> getEstates() {
        return estates;
    }

    @Override
    public void addEstate( Estate estate ) {
        estates.add( estate );
    }

    @Override
    public void addEstates( List<Estate> estate ) {
        estates.addAll( estate );
    }

    @Override
    public double calcTaxes() {
        Double subtotal = estates.stream().reduce( 0D, Neighborhood::sumTaxes, Double::sum );
        return subtotal * multiplier;
    }


    @Override
    public String toString() {
        return "Neighborhood{" +
                "multiplier=" + multiplier +
                "street=" + super.getStreet() +
                "tax=" + calcTaxes() +
                '}';
    }

    private static Double sumTaxes( Double subtotal, Estate estate ) {
        return subtotal + estate.calcTaxes();
    }
}
