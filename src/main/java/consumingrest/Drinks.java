package consumingrest;

import java.util.Arrays;

public class Drinks {
    Drink[] drinks;

    public Drinks() {
    }

    public Drink[] getDrinks() {
        return drinks;
    }

    public void setDrinks(Drink[] drinks) {
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "drinks=" + Arrays.toString(drinks) +
                '}';
    }
}
