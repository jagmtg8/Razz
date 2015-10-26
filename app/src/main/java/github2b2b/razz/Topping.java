package github2b2b.razz;

import java.util.Currency;

/**
 * Created by Katipo on 10/4/2015.
 */
public class Topping extends Ingredient{

    Topping(String ingredientName, boolean preIncluded, Currency extraCost){
        this.ingredientName = ingredientName;
        this.preIncluded = preIncluded;
        this.extraCost = extraCost;


    }

    Topping(String ingredientName){
        this.ingredientName = ingredientName;
    }


}
