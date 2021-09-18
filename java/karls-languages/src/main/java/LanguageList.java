import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LanguageList {

    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty();
    }

    public void addLanguage(String language) {
        Objects.requireNonNull(language);
        languages.add(language);
    }

    public void removeLanguage(String language) {
        Objects.requireNonNull(language);
        languages.remove(language);
    }

    public String firstLanguage() {

        if (languages.isEmpty()) {
            throw new IllegalArgumentException("No languages set.");
        }

        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        Objects.requireNonNull(language);
        return languages.contains(language);
    }

    public boolean isExciting() {
        return languages.contains("Java") || languages.contains("Kotlin");
    }
}
