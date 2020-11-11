package com.axel.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();
        switch(color){
            case "light":
                brands.add("Jail Pale Ale");
                brands.add("Gout Stout");
                break;
            case "amber":
                brands.add("Jack Amber");
                brands.add("Red Moose");
                break;
            case "brown":
                brands.add("Newcastle Brown Ale");
                brands.add("Brickfield Brown");
                break;
            case "dark":
                brands.add("Düster");
                brands.add("Rosen Boom");
                break;
        }
        return brands;
    }
}
