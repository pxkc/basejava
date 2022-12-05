public class Phone {
    String brand;
    public void send(String who) {
        System.out.println("给" + who + "打电话");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
