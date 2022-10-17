package entities;

public class Appetizers extends GenericMenu {

    @Override
    public void chooseMenuTitle(String menuType) {
        System.out.println("--------------------------------\nAppetizers available: ");
    }

    public void setMenu(String name,double price) {
        super.setMenu(name, " ", price);
    }

    @Override
    public void printMenu(){
        System.out.println("Dish name: " + this.name +
                " - Price: " + this.price);
    }
}