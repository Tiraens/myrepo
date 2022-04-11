import Flowers.BouquetItem;
import Flowers.Flower;

import java.util.Comparator;

public class FlowerFreshValueComparator implements Comparator<BouquetItem> {


    @Override
    public int compare(BouquetItem o1, BouquetItem o2) {
        if ((o1 instanceof Flower) & (o2 instanceof Flower)) {
            Flower newO1 = (Flower) o1;
            Flower newO2 = (Flower) o2;
            int result = newO1.getFreshValue() - newO2.getFreshValue();
            int value = 0;
            if (result > 0) {
                value = 1;
            } else if (result < 0) {
                value = -1;
            }

            return value;
        } else return 0;
    }
}

