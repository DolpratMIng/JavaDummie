package tryItOut;

import com.company.DummiesFrame;

public class Tch7_3 {
    public static void main(String[] args) {
        DummiesFrame frame = new DummiesFrame("Food product info");
        frame.addRow("Type of food");
        frame.addRow("weight");
        frame.addRow("cost");
        frame.addRow("number of servings");
        frame.addRow("number of calories per serving");
        frame.setButtonText("Display");
        frame.go();
    }

    public static String calculate(String type, int weight, double cost, int servings, int calories){
        FoodProduct pro1 = new FoodProduct();
        pro1.type = type;
        pro1.weight = weight;
        pro1.cost = cost;
        pro1.numberPerServing = servings;
        pro1.numberPerServing = calories;

        double costPer100Gram = cost/(weight/100);
        double costPerServing = cost/servings;
        double totalNumberCalories = servings * calories;
        return "Cost Per 100 gram: " + costPer100Gram + ";" +
                "Cost per serving: " + costPerServing + ";" + "Totalcalories: " + totalNumberCalories + ";";
    }
}
