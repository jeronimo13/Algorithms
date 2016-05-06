import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Map<String, Collection<String>> mapSortedToWord = getMapSortedToWord("sample.txt");
        printResults(mapSortedToWord);
    }

    private static Map<String, Collection<String>> getMapSortedToWord(String fileName) {
        Map<String, Collection<String>> mapSortedStringToWord = new HashMap<>();
        //reading the file
        InputStream in = Main.class.getClassLoader()
                .getResourceAsStream(fileName);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            String word;
            while ((word = br.readLine()) != null) {
                //sorting characters in word
                String key = sort(word);

                //populating map
                Collection<String> strings = mapSortedStringToWord.get(key);
                if (strings != null) {
                    strings.add(word);
                } else {
                    strings = new ArrayList<>();
                    strings.add(word);
                }
                //rewriting value or adding new
                mapSortedStringToWord.put(key, strings);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mapSortedStringToWord;
    }

    private static String sort(String word) {
        List<Character> sortedCharacters = new ArrayList<>();
        for (char c : word.toCharArray()) {
            sortedCharacters.add(c);
        }
        Collections.sort(sortedCharacters);
        StringBuilder result = new StringBuilder();
        sortedCharacters.forEach(result::append);
        return result.toString();
    }

    private static void printResults(Map<String, Collection<String>> mapSortedToWord) {
        for (Map.Entry<String, Collection<String>> integerCollectionEntry : mapSortedToWord.entrySet()) {
            Collection<String> value = integerCollectionEntry.getValue();
            if (integerCollectionEntry.getValue().size() > 1) {
                for (String s : value) {
                    System.out.printf(s + " ");
                }
                System.out.println();
            }
        }
    }
}
