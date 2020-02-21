package lab2;

public class Driver {
    public static void main(String[] args) {
        Canada canada = new Canada();
        canada.displayAllProvinces();
        System.out.println(canada.getNumberOffProvincesBetween(1, 15));
    }
}
