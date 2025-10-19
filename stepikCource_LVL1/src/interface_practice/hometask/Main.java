package interface_practice.hometask;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.makeAnOrder(new Staff(),  "food_1");
    }
}
