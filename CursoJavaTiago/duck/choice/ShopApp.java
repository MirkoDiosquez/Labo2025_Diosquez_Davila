package duke.choice.duck.choice;

public class ShopApp {
    public static void main(String[] args) {
        double total = 0.0;
        // double tax = 0.2;
        int measurement = 8;
        System.out.println("Welcome to the duck shop!");
        Customer c1 = new Customer("Pinky", 10);
       // c1.setName("Pinky");
        //c1.setSize("S")
        Clothing item1 = new Clothing(20.9,"Blue Jacket", "M");
        Clothing item2 = new Clothing(10.5,"Orange T-Shirt", "S");

       Clothing[] items = {item1, item2, new Clothing(5, "Green Scarf", "S"), new Clothing(10.5, "Blue T-Shirt", "S")};

        c1.addItems(items);
        //c1.setSize(measurement);
        System.out.println("Customer : " + c1.getName() + " " + c1.getSize() +  ", "+ c1.getTotalClothingCost());
        for(Clothing item : c1.getItems()){
            System.out.println(item.getDescription());
        }


    }
}
