package duke.choice.duck.choice;

public class Customer {
    private String name;
    private String size;
    private Clothing[] items;

    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }

    public void addItems(Clothing[] someItems){
        items = someItems;
    }
    public Clothing[] getItems() {
        return items;
    }
    public double getTotalClothingCost(){
        double total = 0.0;
        for (Clothing item: items){
            //System.out.println("Item: " + clothe.getDescription() + " , " + clothe.getSize() + " , " + clothe.getPrice());
            total += item.getPrice();
        }

        return total;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setSize(int measurement){
        switch (measurement) {
            case 1: case 2: case 3:
                size = "S";
                break;
            case 4: case 5: case 6:
                size = "M";
                break;
            case 7: case 8: case 9:
                size = "L";
                break;
            default:
                size = "XL";
                break;
        }
    }
}
