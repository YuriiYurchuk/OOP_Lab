import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StringProcessor {
    private String inputText;
    private String searchText;
    private List<Integer> occurrences;

    public StringProcessor(String inputText, String searchText) {
        this.inputText = inputText;
        this.searchText = searchText;
        this.occurrences = new ArrayList<>();
    }

    public void processText() {
        int index = inputText.indexOf(searchText);
        while (index != -1) {
            occurrences.add(index);
            index = inputText.indexOf(searchText, index + 1);
        }
    }

    public String getInputText() {
        return inputText;
    }

    public List<Integer> getOccurrences() {
        return occurrences;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст:");
        String inputText = scanner.nextLine();
        System.out.println("Введіть слово для пошуку:");
        String searchText = scanner.nextLine();
        StringProcessor processor = new StringProcessor(inputText, searchText);
        processor.processText();
        List<Integer> occurrences = processor.getOccurrences();
        if (occurrences.isEmpty()) {
            System.out.println("Слово не знайдено у тексті.");
        } else {
            System.out.println("Позиції входжень слова \"" + searchText + "\":");
            for (int position : occurrences) {
                System.out.println(position);
            }
            System.out.println("Загальна кількість входжень: " + occurrences.size());
        }
    }
}