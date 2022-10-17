package entities;

public class SecondiPiatti extends GenericMenu {
       @Override
        public void chooseMenuTitle(String menuType) {
            System.out.println("--------------------------------\nSecondiPiatti available: ");
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
}
