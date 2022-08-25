package TryItOut;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class ClothingFrame extends JFrame { // extends superclass of JFrame - GUI

    public ClothingFrame() { // constructor
        // declare class name
        MensClothingItem item;

        // create objects
        item = new MensClothingItem(MensClothingKind.SHIRT, "Design #7");
        addItemInfo(item); // add the objects that created to the gui
        item = new MensClothingItem(MensClothingKind.PANTS, "Design #5");
        addItemInfo(item);
        item = new MensClothingItem(MensClothingKind.JACKET, "Design #3");
        addItemInfo(item);
        item = new MensClothingItem(MensClothingKind.OVERCOAT, "Design #8");
        addItemInfo(item);
        item = new MensClothingItem(MensClothingKind.NECKTIE, "Design #9");
        addItemInfo(item);
        item = new MensClothingItem(MensClothingKind.SHOES, "Design #4");
        addItemInfo(item);

        setTitle("Men's Clothing"); // set title for gui
        setLayout(new GridLayout(6, 2, 20, 3)); // arranges thing in evenly spaced rows and columns
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack(); //set the frame's size
        setVisible(true);
    }
    void addItemInfo(MensClothingItem item) { // method
        add(new JLabel("  " + item.getKind())); // an object with some text in it
        add(new JLabel(item.getName())); // an object with some text in it
    }
}
