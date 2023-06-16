public class Main {

    public void Hyundaisonata() {
        System.out.println("The Hyundai Sonata car is low in millage and good car for eco");
    }

    public void model(int year) {
        System.out.println("Manufactor: " + year);
    }

    public static void main(String[] args) {
        Main myCar = new Main();
        myCar.Hyundaisonata();
        myCar.model(2014);
    }
}
