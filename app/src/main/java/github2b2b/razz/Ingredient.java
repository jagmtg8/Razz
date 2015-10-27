package github2b2b.razz;

import java.util.Currency;

/**
 * Created by Katipo on 10/4/2015.
 */
public class Ingredient {
    /**
     * @param ingredientName - String which holds the name of the ingredient
     * @param preIncluded - Does the item cost additional or is it included
     * @param extraCost - Currency value. Determines how much extra it is.
     */
    protected String   ingredientName;
    protected boolean  preIncluded;      //we may or may not use this, depending on how we implement premade sandwiches.
    protected Currency extraCost;       //If we use the above boolean, we can use this.

    protected String getIngredientName() {
        return ingredientName;
    }

    protected void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    protected boolean isPreIncluded() {
        return preIncluded;
    }

    protected void setPreIncluded(boolean preIncluded) {
        this.preIncluded = preIncluded;
    }

    protected Currency getExtraCost() {
        return extraCost;
    }

    protected void setExtraCost(Currency extraCost) {
        this.extraCost = extraCost;
    }

}
