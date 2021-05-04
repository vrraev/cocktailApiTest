package consumingrest;

public class Drink {

    private String idDrink;
    private String strDrink;
    private String strAlcoholic;
    private String strInstructions;

    public Drink() {
    }

    public String getIdDrink() {
        return idDrink;
    }

    public void setIdDrink(String idDrink) {
        this.idDrink = idDrink;
    }

    public String getStrDrink() {
        return strDrink;
    }

    public void setStrDrink(String strDrink) {
        this.strDrink = strDrink;
    }

    public String getStrAlcoholic() {
        return strAlcoholic;
    }

    public void setStrAlcoholic(String strAlcoholic) {
        this.strAlcoholic = strAlcoholic;
    }

    public String getStrInstructions() {
        return strInstructions;
    }

    public void setStrInstructions(String strInstructions) {
        this.strInstructions = strInstructions;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "idDrink='" + idDrink + '\'' +
                ", strDrink='" + strDrink + '\'' +
                ", strAlcoholic='" + strAlcoholic + '\'' +
                ", strInstructions='" + strInstructions + '\'' +
                '}';
    }
}
