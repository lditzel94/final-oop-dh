package city.interfaces;

import java.util.List;

public interface Composable {
    void addEstate( Estate estate );

    void addEstates( List<Estate> estate );
}
