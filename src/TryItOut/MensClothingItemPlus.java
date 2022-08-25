package TryItOut;
import java.awt.Color;

public class MensClothingItemPlus extends MensClothingItem {
    // field
    // name of designer
    public static String designer = "Dummies House of Fashion";
    private Color color;
    private double cost;
    // constructor
    public MensClothingItemPlus(MensClothingKind kind, String name,
                                Color color, double cost) {
        super(kind, name);
        this.color = color;
        this.cost = cost;
    }

    // set and get
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


}
