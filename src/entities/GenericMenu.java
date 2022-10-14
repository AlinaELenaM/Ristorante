package entities;

public abstract class GenericMenu {

     public String name;
     public String ingredients;
     public double price;

     public abstract void printMenu();

     public abstract void chooseMenuTitle(String menuType);

     public void setMenu (String name, String ingredients, double price){
          this.name = name;
          this.ingredients = ingredients;
          this.price = price;
     }
}
