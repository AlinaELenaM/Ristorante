import entities.Drinks;

public class Start {
    public static void main(String[] args) {
        System.out.println("---Welcome to our Restaurant!---");

        //DRINKS
        Drinks drinks = new Drinks();
        drinks.chooseMenuTitle("Drinks");
        drinks.setMenu("Water", 1.5);
        drinks.printMenu();


    }
}
