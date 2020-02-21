package lab2;

public class Canada {
    private Province[] province;

    Canada() {
        this.province = new Province[10];
        province[0] = new Province("Ontario", "Toronto", 13_448_494);
        province[1] = new Province("Quebec", "Quebec", 8164361);
        province[2] = new Province("British Columbia", "Victoria", 4648055);
        province[3] = new Province("Alberta", "Edmonton", 4067175);
        province[4] = new Province("Manitoba", "Winnipeg", 1278365);
        province[5] = new Province("Saskatchewan", "Regina", 1098352);
        province[6] = new Province("Nova Scotia", "Halifax", 971396);
        province[7] = new Province("New Brunswick", "Fredericton", 747101);
        province[8] = new Province("Newfoundland and Labrador", "St.John's", 519716);
        province[9] = new Province("Prince Edward Island", "Charlottetown", 142907);
    }

    public void displayAllProvinces(){
        for (Province province: province) {
            System.out.println(province.getDetails());
        }
    }
    public int getNumberOffProvincesBetween(int min, int max) {
        int sum = 0;
        for (Province province : province) {
            if (province.getPopulation() >= (min * 1_000_000) && province.getPopulation() <= (max * 1_000_000)) {
                sum += 1;
            }
        }
        return sum;
    }
}
