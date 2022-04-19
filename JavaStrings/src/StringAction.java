import java.util.Locale;

public class StringAction {
    public static int checkForCommonWords(String string) {
        string = string.replaceAll("\\p{P}", "");
        string = string.toLowerCase(Locale.ROOT);
        String arr[] = string.split("\\s");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int wordsCount(String string) {
        string = string.replaceAll("\\p{P}", "");
        String arr[] = string.split("\\s");
        return arr.length;
    }


}
