public class Mobile extends Gadget {
    private int credit;

    public Mobile(String model, double price, int weight, String size, int credit) {
        super(model, price, weight, size);
        this.credit = credit;
    }

    // Getter and setter for credit
    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    // Method to make a call
    public void makeCall(String phoneNumber, int duration) {
        System.out.println("Calling " + phoneNumber + " for " + duration + " minutes.");
    }
}
