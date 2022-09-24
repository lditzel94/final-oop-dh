import city.factories.EstateFactory;
import city.models.House;
import city.models.Neighborhood;
import city.models.Town;

import java.util.Arrays;

import static city.types.EstateTypes.HOUSE;
import static city.types.EstateTypes.NEIGHBORHOOD;

public class Main {
    public static void main( String[] args ) {

        EstateFactory factory = EstateFactory.getInstance();
        Town town = Town.getInstance();
        House firstHouse = ( House ) factory.createEstate( HOUSE );
        House secondHouse = ( House ) factory.createEstate( HOUSE );
        Neighborhood neighborhood = ( Neighborhood ) factory.createEstate( NEIGHBORHOOD );


        firstHouse.setStreet( "Av. San Martín" );
        firstHouse.setNumber( 130 );
        firstHouse.setBaseTax( 500 );

        secondHouse.setStreet( "Mitre" );
        secondHouse.setNumber( 233 );
        secondHouse.setBaseTax( 700 );

        neighborhood.setStreet( "Gutierres" );
        neighborhood.setNumber( 330 );
        neighborhood.setMultiplier( 2 );
        neighborhood.addEstate( firstHouse );
        neighborhood.addEstate( secondHouse );

        town.addEstates( Arrays.asList( firstHouse, secondHouse, neighborhood ) );
        town.displayEstates();

    }
}