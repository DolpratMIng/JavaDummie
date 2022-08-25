package TryItOut;

public class T4 {
    public static void main(String[] args) {

        // Brickenchicker dectuplets calculation fit on the elevator
        int weightOfAPerson = 10;
        int elevatorWeightLimit = 1400;
        int numberOfPeople = elevatorWeightLimit/weightOfAPerson;

        if(numberOfPeople >= 10){
            System.out.println("You can fit all ten of the");
            System.out.println("Brickenchicker dectuplets");
            System.out.println("on the elevator.");
        } else{
            System.out.println("You can't fit all tne of the");
            System.out.println("Brickenchicker dectuplets");
            System.out.println("on the elevator.");
        }
    }
}
