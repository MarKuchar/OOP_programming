package midtermexam;

/**
 *
 * @author martin.kuchar
 * */
public class Boat extends Vehicle {

    public Boat(int weightPounds) {
        super(weightPounds);
    }

    @Override
    public void accelerate() {
        System.out.println("jet water");
    }

    @Override
    public void steerLeft() {
        System.out.println("turn tiller left");
    }

    @Override
    public void steerRight() {
        System.out.println("turn tiller right");
    }

    @Override
    public String toString() {
        return "Boat{" +
                "weight in pounds = " + getWeightPounds() +
                '}';
    }
}
