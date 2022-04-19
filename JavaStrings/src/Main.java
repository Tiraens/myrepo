import java.io.DataInputStream;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String string = "Надо мною - тишина,\n" +
                "Небо полное дождя,\n" +
                "Дождь проходит сквозь меня,\n" +
                "Но боли больше нет.\n" +
                "Под холодный шепот звезд\n" +
                "Мы сожгли последний мост,\n" +
                "И все в бездну сорвалось.\n" +
                "Свободным стану я\n" +
                "От зла и от добра,\n" +
                "Моя душа была на лезвии ножа.\n" +
                "Я бы мог с тобою быть,\n" +
                "Я бы мог про все забыть,\n" +
                "Я бы мог тебя любить,\n" +
                "Но это лишь игра.";


       /* // TODO  Найти наибольшее количество предложений текста, в которых есть одинаковые слова.
        int count = 0;
        String arr[] = string.split("\\.");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (StringAction.checkForCommonWords(arr[i]) > 0) {
                count++;
            }
        }

        System.out.println(count);

        //TODO  Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них.
        Map wordsCountCouples = new TreeMap<Integer, String>();
        for (int i = 0; i < arr.length; i++) {
            wordsCountCouples.put(StringAction.wordsCount(arr[i]) - 1, arr[i]);
        }
        System.out.println(wordsCountCouples);

*/

        //TODO  Рассортировать слова текста по возрастанию доли гласных букв
        // (отношение количества гласных к общему количеству букв в слове).

        String string2 = string.replaceAll("\\p{P}", "");
        string2 = string2.toLowerCase(Locale.ROOT);
        String arr2[] = string2.split("\\s");
        Map<String, Double> unsortedMap = new HashMap<String, Double>();
        for (int i = 0; i < arr2.length; i++) {
            int wordLettersCount =0;
            for (int j = 0; j < arr2[i].length (); j++) {
                if ((arr2[i].charAt(j)=='а')|(arr2[i].charAt(j)=='о')|(arr2[i].charAt(j)=='е')
                        |(arr2[i].charAt(j)=='ё')|(arr2[i].charAt(j)=='у')|(arr2[i].charAt(j)=='и')|
                        (arr2[i].charAt(j)=='э')|(arr2[i].charAt(j)=='ю')|(arr2[i].charAt(j)=='я')|
                        (arr2[i].charAt(j)=='ы')) {
                    wordLettersCount ++;
                }

            }
          //  System.out.println (wordLettersCount +" " + arr2[i]);
            double wordLettersCount2 = wordLettersCount;
            double wordIndex = wordLettersCount2/(arr2[i].length()+1);
            unsortedMap.put(arr2[i], wordIndex);
        }
        //System.out.println(unsortedMap);

        Map<String, Double> sortedMap = unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));

        sortedMap.entrySet().forEach(System.out::println);


    }
}



