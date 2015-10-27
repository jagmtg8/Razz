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
    Bread(String ingredientName, boolean preIncluded, Currency extraCost){
        this.ingredientName = ingredientName;
        this.preIncluded = preIncluded;
        this.extraCost = extraCost;
    }

    /**
     *
     * @param ingredientName - A string which describes the ingredient
     */
    Bread(String ingredientName){
        this.ingredientName = ingredientName;
    }



}
