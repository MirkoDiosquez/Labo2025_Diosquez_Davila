package duke.choice.duck.choice;

public class Clothing {
    private String description;
    private double price;
    private String size="M";
    private final double MIN_PRICE = 10.0;
    private final double MIN_TAX = .2;

    public Clothing(double price, String description, String size) {
        this.price = price;
        this.description = description;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price + (price * MIN_TAX);
    }
    public void setPrice(double price) {
        this.price = (price > MIN_PRICE) ? price:MIN_PRICE;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
}
