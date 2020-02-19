package lab1;

public class Driver {
    public static void main(String[] args) {
        Model model = new Model("Tiger", "Woods", 73, 190, true, false);
        Model model1 = new Model("Susan", "Smith", 70, 120);
        model.setHeight(5,11);
        model.setWeight(60.0);
        model.setHeight(80);
        model.setSmokes(true);
        model.setHeight(6, 2);
        model.printDetails();
        model1.printDetails();
        System.out.println(model.getHeightInFeetAndInches());
        System.out.println(model.isSmokes());
        System.out.println(model.getFirstName());
        System.out.println(model.getLastName());
        System.out.println(model.getHeight());
        System.out.println(model.getWeight());
        System.out.println(model.isCanTravel());
        System.out.println(model.getWeightKg());
        System.out.println(model1.getHeightInFeetAndInches());
        model.displayModelDetails();
    }
}
