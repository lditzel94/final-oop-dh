package city.models;

import city.interfaces.Composable;
import city.interfaces.Estate;

import java.util.ArrayList;
import java.util.List;

public class Town implements Composable {

    private static Town instance;

    private Town() {
    }

    public static Town getInstance() {
        if ( instance == null ) instance = new Town();
        return instance;
    }

    private String name;
    private List<Estate> estates = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    @Override
    public void addEstates( List<Estate> estate ) {
        estates.addAll( estate );
    }

    @Override
    public void addEstate( Estate estate ) {
        estates.add( estate );
    }

    public void displayEstates() {
        estates.stream().forEach( System.out::println );
    }


}
