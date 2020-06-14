import java.util.ArrayList;
import java.util.List;

public class Allergies {

    private final int allergyScore;
    private final ArrayList<Allergen> allergens;

    public Allergies(int allergyScore) {

        this.allergyScore = allergyScore;
        allergens = new ArrayList<Allergen>();
        findAllergens();
    }

    private void findAllergens() {

        for (var a : Allergen.values()) {

            if (isAllergicTo(a)) {
                allergens.add(a);
            }
        }
    }

    public List<Allergen> getList() {
        return allergens;
    }

    public boolean isAllergicTo(Allergen allergen) {

        return (allergyScore & allergen.getScore()) == allergen.getScore();
    }

}
