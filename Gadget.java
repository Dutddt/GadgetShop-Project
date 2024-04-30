public class Gadget {
    private String model;
    private double price;
    private int weight;
    private String size;

    public Gadget(String model, double price, int weight, String size) {
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.size = size;
    }

    // Getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // Method to display details
    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Weight: " + weight + "g");
        System.out.println("Size: " + size);
    }
}