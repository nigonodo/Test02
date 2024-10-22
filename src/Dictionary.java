import java.util.ArrayList;
import java.util.List;

public class Dictionary {

    private List<Word> words;

    public Dictionary(List<Word> words) {
        this.words = words;
    }

    public String translation(String value) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).value.equalsIgnoreCase(value)) {
                return words.get(i).translation;
            }
        }
        return "";
    }

    public String getWordByTranslation(String translation) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).translation.equalsIgnoreCase(translation)) {
                return words.get(i).value;
            }
        }
        return "";
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < words.size(); i++) {
            result += words.get(i) + System.lineSeparator();  // \n
        }
        return result;
    }

}
