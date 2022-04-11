package Flowers;

public class Acessories extends BouquetItem {
    AcessoriesType type;

    public AcessoriesType getType() {
        return type;
    }

    public void setType(AcessoriesType type) {
        this.type = type;
    }

    public Acessories(AcessoriesType type, int price) {
        super(price);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Acessories{" +
                "type=" + type +
                ", price=" + price +
                '}';
    }
}