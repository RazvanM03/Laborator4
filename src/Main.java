import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Scanner fisier = new Scanner(new File)
        while (fisier.hasNext()) {
            String word = fisier.next();
            if (map.containKey(word)) {
                int count = map.get(word) + 1;
                map.put(word, count)
            } else {
                map.put(word, 1);
            }
        }
        fisier.close();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}