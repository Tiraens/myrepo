import Flowers.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Bouquet {

    //TODO Цветочница. Определить иерархию цветов.
    // Создать несколько объектов-цветов. Собрать букет (используя аксессуары) с определением его стоимости.
    // Провести сортировку цветов в букете на основе уровня свежести.
    // Найти цветок в букете, соответствующий заданному диапазону длин стеблей.


    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("src/prices.properties");
        Properties priceProperties = new Properties();
        priceProperties.load(fileInputStream);

        ArrayList<BouquetItem> bouquet = new ArrayList<BouquetItem>();

        bouquet.add(new Flower(FlowerName.CROCUS, Integer.parseInt(priceProperties.getProperty("crocus")),
                35, 3, Color.BLUE));
        bouquet.add(new Flower(FlowerName.ROSE, Integer.parseInt(priceProperties.getProperty("rose")),
                30, 1, Color.RED));
        bouquet.add(new Flower(FlowerName.CHAMOMILE, Integer.parseInt(priceProperties.getProperty("chamomile")),
                35, 2, Color.WHITE));
        bouquet.add(new Flower(FlowerName.VIOLA, Integer.parseInt(priceProperties.getProperty("viola")),
                40, 1, Color.LAVENDER));
        bouquet.add(new Acessories(AcessoriesType.BOW, Integer.parseInt(priceProperties.getProperty("bow"))));
        bouquet.add(new Acessories(AcessoriesType.RIBBON, Integer.parseInt(priceProperties.getProperty("ribbon"))));
        bouquet.add(new Acessories(AcessoriesType.BOW, Integer.parseInt(priceProperties.getProperty("bow"))));


        // Стоимость букета
        int bouquetPrice = 0;
        for (int i = 0; i < bouquet.size(); i++) {
            bouquetPrice += bouquet.get(i).getPrice();
        }
        System.out.println(bouquetPrice);
        System.out.println();

        // Сортировка
        System.out.println(bouquet);

        bouquet.sort(new FlowerFreshValueComparator());

        System.out.println(bouquet);
        System.out.println();


        //Поиск подиапазону длин стеблей
        final int MAX_STEM_LENGTH = 35;
        final int MIN_STEM_LENGTH = 25;
        for (int i = 0; i < bouquet.size(); i++) {
            if (bouquet.get(i) instanceof Flower) {
                Flower newBouquet = (Flower) bouquet.get(i);
                if ((MIN_STEM_LENGTH <= newBouquet.getStemLength()) & (newBouquet.getStemLength() <= MAX_STEM_LENGTH)) {
                    System.out.println(bouquet.get(i));
                }
            } else continue;
        }


    }
}
