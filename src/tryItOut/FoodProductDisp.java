package tryItOut;

public class FoodProductDisp {
    public static void main(String[] args) {
        // Create objects
        FoodProduct pro1 = new FoodProduct();

        // set values for variable
        pro1.type = "apple";
        pro1.weight = 500;
        pro1.cost = 1.83;
        pro1.numberServing = 4;
        pro1.numberPerServing = 70;

        // Display variable
        pro1.display();
    }
}
