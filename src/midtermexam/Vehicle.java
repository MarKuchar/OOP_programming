package midtermexam;

import com.sun.codemodel.internal.JCatchBlock;

import java.util.Objects;

/**
 *
 * @author martin.kuchar
 * */
public abstract class Vehicle implements Steerable {
    private int weightPounds;

    public Vehicle(int weightPounds) {
        try {
            if (weightPounds >= 0) {
                this.weightPounds = weightPounds;
            }
        } catch (Exception exepction) {
            System.out.println("Weight cannot be a negative number");
        }
    }
    public int getWeightPounds() {
        return weightPounds;
    }

    public void setWeightPounds(int weightPounds) {
        this.weightPounds = weightPounds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return this.weightPounds == vehicle.weightPounds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weightPounds);
    }

    @Override
    public String toString() {
        return "Vehicle with{" +
                "weightPounds=" + weightPounds +
                '}';
    }

    public abstract void accelerate();
    public abstract void steerLeft();
    public abstract void steerRight();

}
