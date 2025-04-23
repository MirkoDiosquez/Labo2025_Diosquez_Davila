package duck.choice;

public class ShopApp {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        Clothing item1= new Clothing();
        Clothing item2= new Clothing();

        double tax= 0.2, total=0.0;
        c1.name = "Pinky";
        item1.description = "Blue Jacket";
        item1.price= 20.9;
        item1.size="M";
        item2.description = "Orange T-Shirt";
        item2.price= 10.5;
        item2.size="S";


        System.out.println("Coustumer n1: " + c1.name);
        System.out.println("Item 1: " + item1.description + " " + item1.price + " " + item1.size);
        System.out.println("Item 2: " + item2.description + " " + item2.price + " " + item2.size);

        total = (item1.price + (item2.price)*2)*(1+tax);
        System.out.println("Total: " + total);
    }


}
