package interfaces;

public class House implements interfaces.Habitable {
    private int numOfBedrooms;

    public House(int numOfBedrooms) {
        this.numOfBedrooms = numOfBedrooms;
    }

    @Override
    public boolean canFit(int inhabitants) {
        return inhabitants <= numOfBedrooms * 2;
    }
}