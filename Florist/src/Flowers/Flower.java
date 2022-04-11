package Flowers;

public class Flower extends BouquetItem {

    private FlowerName name;
    private int stemLength;
    private Color color;
    private int freshValue;


    public int getFreshValue() {
        return freshValue;
    }

    public void setFreshValue(int freshValue) {
        this.freshValue = freshValue;
    }


    public FlowerName getName() {
        return name;
    }

    public void setName(FlowerName name) {
        this.name = name;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public Flower(FlowerName name, int price, int stemLength, int freshValue, Color color) {
        super(price);
        this.freshValue = freshValue;
        this.name = name;
        this.stemLength = stemLength;
        this.freshValue = freshValue;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "price=" + price +
                ", freshValue=" + freshValue +
                ", name=" + name +
                ", stemLength=" + stemLength +
                ", color=" + color +
                '}';
    }
}