public class MP3 extends Gadget {
    private double memory;

    public MP3(String model, double price, int weight, String size, double memory) {
        super(model, price, weight, size);
        this.memory = memory;
    }

    // Getter and setter for memory
    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    // Method to download music
    public void downloadMusic(double downloadSize) {
        System.out.println("Downloading music of size " + downloadSize + " MB.");
    }
}
