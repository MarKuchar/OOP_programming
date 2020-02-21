package lab2;

public class Province {
    private String province;
    private String capital;
    private long population;

    public static final int DEFAULT_POPULATION = 4_648_055;
    public static final String DEFAULT_PROVINCE = "British Columbia";
    public static final String DEFAULT_CAPITAL = "Victoria";

    public Province(String province, String capital, long population) {
        if (isValidPopulation((int) population) && isValidProvince(province) && isValidCapitalCity(capital)) {
            this.province = province;
            this.capital = capital;
            this.population = population;
        } else {
            this.province = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
            this.population = DEFAULT_POPULATION;
        }
    }
    public Province(){
        this(DEFAULT_PROVINCE, DEFAULT_CAPITAL, DEFAULT_POPULATION);
    }

    private static boolean isValidProvince(String province) {
        String[] provices = new String[]{"Alberta", "British Columbia", "Manitoba", "New Brunswick",
                "Newfoundland and Labrador", "Nova Scotia", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan"};
        for (String item: provices) {
            if (province.equals(item)) {
                return true;
            }
        }
        return false;
    }
    private static boolean isValidCapitalCity(String capital) {
        String[] capitals = new String[]{"Victoria", "St.John's", "Halifax", "Fredericton", "Charlottetown",
                "Quebec", "Toronto", "Winnipeg", "Regina", "Edmonton"};
        for (String item: capitals) {
            if (capital.equals(item)) {
                return true;
            }
        }
        return false;
    }
    private static boolean isValidPopulation(int population) {
        return (population > 30_000 && population < 15_000_000) ? true : false;
    }

    public String getProvince() {
        return province;
    }
    public String getCapital() {
        return capital;
    }
    public long getPopulation() {
        return population;
    }
    public void setName(String name) {
        this.province = name;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }
    public void setPopulation(long population) {
        this.population = population;
    }
    
    public String getDetails() {
        return "The capital of " + province + " (population. " + population + ") is " + capital;
    }
}
