package tryItOut;

public class FoodProduct {
    // Field - variable that belong to classes
    String type;
    int weight;
    double cost;
    int numberServing;
    int numberPerServing;

    // display method
    public void display(){
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight + " gram");
        System.out.println("Cost: $" + cost);
        System.out.println("Number of servings: " + numberServing);
        System.out.println("Number of calories per serving: " + numberPerServing);
        System.out.println();
    }

    // method to calculate cost per gram
    public double costPer100Grams(){
        return cost/(weight/100);
    }

    //method to calculate cost per serving
    public double costPerServing(){
        return cost/numberServing;
    }

    //method to calculate calories
    public int totalCalories(){
        return numberPerServing * numberServing;
    }

    // set and get
    public void setType(String t){
        if(!t.equals("")){
            type = t;
        }
    }

    public String getType(){
        return type;
    }

    public void setWeight(int w){
        if(w>=0){
            weight = w;
        }
    }

    public int getWeight(){
        return weight;
    }

    public void setCost(double c){
        if(c>=0){
            cost = c;
        }
    }

    public double getCost(){
        return cost;
    }

    public void setNumberServing(int ns){
        if(ns>=0){
            numberServing = ns;
        }
    }

    public int getNumberServing(){
        return numberServing;
    }

    public void setNumberPerServing(int nps){
        if(nps>=0){
            numberPerServing = nps;
        }
    }

    public int getNumberPerServing(){
        return numberPerServing;
    }
}
