package city.factories;

import city.interfaces.Estate;
import city.models.House;
import city.models.Neighborhood;
import city.types.EstateTypes;

public class EstateFactory {
    private static EstateFactory instance;

    private EstateFactory() {
    }

    public static EstateFactory getInstance() {
        if ( instance == null ) instance = new EstateFactory();
        return instance;
    }

    public Estate createEstate( EstateTypes estateType ) {
        switch ( estateType ) {
            case HOUSE:
                return new House();
            case NEIGHBORHOOD:
                return new Neighborhood();
            default:
                return null;
        }
    }

}
