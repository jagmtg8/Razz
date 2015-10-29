package github2b2b.razz;

import java.util.Currency;

/**
 * Created by Katipo on 10/4/2015.
 */
public class Bread extends Ingredient{


    /**@author Shane Demskie 10/04
     * @param ingredientName
     * @param preIncluded
     * @param extraCost
     */
    public double breadPrice;

    Bread(String ingredientName, double breadPrice, boolean preIncluded, Currency extraCost){
        this.ingredientName = ingredientName;
        this.preIncluded = preIncluded;
        this.extraCost = extraCost;
        this.breadPrice = breadPrice;
    }

    /**
     *
     * @param ingredientName - A string which describes the ingredient
     */
    Bread(String ingredientName, double breadPrice){
        this.ingredientName = ingredientName;
        this.breadPrice = breadPrice;
    }


}
