package TryItOut;
// import API class
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

// suppresswarnings annotation to tells Java not to remind that you've omitted something called a serialVersionUID field
@SuppressWarnings("serial")
// class extends from the class JFrame
public class ClothingFrame2 extends JFrame {

    // constructor to display
    public ClothingFrame2() {
        // declare the class and name
        MensClothingItemPlus item;

        // add these thing to the frame to display the name of the designer
        add(new JLabel(MensClothingItemPlus.designer));
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));

        //variable as an empty box
        double totalCost = 0;

        // create objects
        item = new MensClothingItemPlus
                (MensClothingKind.SHIRT, "Design #7", Color.GRAY, 50.00);
        addItemInfo(item);
        totalCost += item.getCost();

        item = new MensClothingItemPlus
                (MensClothingKind.PANTS, "Design #5", Color.BLACK, 70.00);
        addItemInfo(item);
        totalCost += item.getCost();

        item = new MensClothingItemPlus
                (MensClothingKind.JACKET, "Design #3", Color.BLACK, 70.00);
        addItemInfo(item);
        totalCost += item.getCost();

        item = new MensClothingItemPlus
                (MensClothingKind.OVERCOAT, "Design #8", Color.GRAY, 100.00);
        addItemInfo(item);
        totalCost += item.getCost();

        item = new MensClothingItemPlus
                (MensClothingKind.NECKTIE, "Design #9", Color.BLUE, 30.00);
        addItemInfo(item);
        totalCost += item.getCost();

        item = new MensClothingItemPlus
                (MensClothingKind.SHOES, "Design #4", Color.DARK_GRAY, 80.00);
        addItemInfo(item);
        totalCost += item.getCost();

        // Add these thing to the frame to display total cost
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(Double.toString(totalCost)));

        // To create the GUI frame
        setTitle("Men's Clothing"); // to display the title
        setLayout(new GridLayout(8, 4, 20, 3)); // to set the size of the column and row
        setDefaultCloseOperation(EXIT_ON_CLOSE); // to create the close option
        pack(); // to set the frame's size
        setVisible(true); // to make the frame visible
    }

    void addItemInfo(MensClothingItemPlus item) { // method to add all the object's field into the frame
        add(new JLabel("  " + item.getKind()));
        add(new JLabel(item.getName()));
        add(new JLabel(item.getColor().toString()));
        add(new JLabel(Double.toString(item.getCost())));
    }
}
