package lab1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author Martin Kuchar
 */
public class Model {
    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;

    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    /**
     * Constructor
     *
     * Default constructor.
     */
    public Model() {
    }

    /**
     * Constructor
     *
     * @param firstName
     * @param lastName
     * @param height
     * @param weight
     * @param canTravel
     * @param smokes
     */
    public Model(String firstName, String lastName, int height, double weight, boolean canTravel, boolean smokes) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setCanTravel(canTravel);
        setSmokes(smokes);
    }

    /**
     * Constructor
     *
     * @param firstName
     * @param lastName
     * @param height
     * @param weight
     */
    public Model(String firstName, String lastName, int height, double weight) {
        this(firstName, lastName, height, weight, true, false);
    }


    /**
     * Setter for firstName
     *
     * First name must be 3 to 20 characters long or else they won't be stored.
     * Only store the parameter if it meets the respective criteria listed above.
     * @param firstName
     */
    public void setFirstName(String firstName) {
        if (firstName.length() > 3 && firstName.length() < 20) {
            this.firstName = firstName;
        } else {
            this.firstName = null;
        }
    }

    /**
     * Setter for lastName
     *
     * Last name must be 3 to 20 characters long or else they won't be stored.
     * Only store the parameter if it meets the respective criteria listed above.
     * @param lastName
     */
    public void setLastName(String lastName) {
        if (lastName.length() > 3 && lastName.length() < 20) {
            this.lastName = lastName;
        } else {
            this.lastName = null;
        }
    }

    /**
     * Setter for height
     *
     * Height must be 24 to 84 inches.
     * Only store the parameter if it meets the respective criteria listed above.
     * @param inches
     */
    public void setHeight(int inches) {
        if (inches > 24 && inches < 84) {
            this.height = inches;
        } else {
            this.height = 0;
        }
    }

    /**
     * Setter for height in feet and inches
     *
     * @param feet
     * @param inches
     */
    public void setHeight(int feet, int inches) {
        int num = feet * INCHES_PER_FOOT;
        height = num + inches;
        if (height > 24 && height < 84) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    /**
     * Setter for weight
     *
     * Weight must be 80 to 280 pounds.
     * Only store the parameter if it meets the respective criteria listed above.
     * @param pounds
     */
    public void setWeight(double pounds) {
        if (pounds > 80 && pounds < 240) {
            this.weight = pounds;
        } else {
            this.weight = 0;
        }
    }

    /**
     * Setter for weight in kilograms
     *
     * @param kilograms
     */
    public void setWeight(long kilograms) {
        double weight = kilograms  * POUNDS_PER_KG;
        weight = Math.round(weight);
        if (weight > 80 && weight < 240) {
            this.weight = weight;
        } else {
            this.weight = 0;
        }
    }

    /**
     * Setter 'setCanTravel'
     *
     * @param canTravel
     * @return
     */
    public boolean setCanTravel(boolean canTravel) {
        return this.canTravel = canTravel;
    }

    /**
     * Setter 'setSmokes'
     *
     * @param smokes
     * @return
     */
    public boolean setSmokes(boolean smokes) {
        return this.smokes = smokes;
    }


    /**
     * Getter for firstName
     *
     * @return first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Getter for lastName
     *
     * @return last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Getter for height
     *
     * @return height.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Getter for weight
     *
     * @return weight.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Getter 'isCanTravel'
     *
     * @return True or False.
     */
    public boolean isCanTravel() {
        return canTravel;
    }

    /**
     * Getter 'isSmokes'
     *
     * @return True or False.
     */
    public boolean isSmokes() {
        return smokes;
    }

    /**
     * Getter 'getHeightInFeetAndInches'
     *
     * @return height in feet and inches.
     */
    public String getHeightInFeetAndInches() {
        int num = height / INCHES_PER_FOOT;
        int num2 = height % INCHES_PER_FOOT;
        if (num2 == 0 && num == 0) {
            return "0";
        } else if (num2 == 1 && num == 0) {
            return num2 + " inch ";
        } else if (num2 > 1 && num == 0) {
            return num2 + " inches";
        } else if (num2 == 0 && num == 1) {
            return num + " foot";
        } else if (num2 == 1 && num == 1) {
            return num + " foot " + num2 + " inch";
        } else if (num2 > 1 && num == 1) {
            return num + " foot " + num2 + " inches";
        } else if (num2 == 0 && num > 1) {
            return num + " feet";
        } else if (num2 == 1 && num > 1) {
            return num + " feet " + num2 + " inch";
        } else if (num2 > 1 && num > 1) {
            return num + " feet " + num2 + " inches";
        }
    System.out.println("No height");
        return null;
    }

    /**
     * Getter for weight in kg
     * @return
     */
    public long getWeightKg() {
        return Math.round(weight / POUNDS_PER_KG);
    }


    public void printDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeight() + " inches");
        System.out.println("Weight: " + Math.round(getWeight()) + " pounds");
        if (canTravel) {
            System.out.println("Does travel");
        } else {
            System.out.println("Does not travel");
        }
        if (smokes) {
            System.out.println("Does smoke");
        } else {
            System.out.println("Does not smoke");
        }
    }

    public int calculatePayDollarsPerHour() {
        if (TALL_INCHES < height && THIN_POUNDS > weight && canTravel && !smokes) {
            return BASE_RATE_DOLLARS_PER_HOUR + TALL_THIN_BONUS_DOLLARS_PER_HOUR + TRAVEL_BONUS_DOLLARS_PER_HOUR;
        } else if (TALL_INCHES < height && THIN_POUNDS > weight && canTravel && smokes) {
            return BASE_RATE_DOLLARS_PER_HOUR + TALL_THIN_BONUS_DOLLARS_PER_HOUR +
                    TRAVEL_BONUS_DOLLARS_PER_HOUR - SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        } else if (TALL_INCHES < height && THIN_POUNDS > weight && !canTravel && !smokes) {
            return BASE_RATE_DOLLARS_PER_HOUR + TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        } else if (TALL_INCHES < height && THIN_POUNDS > weight && !canTravel && smokes) {
            return BASE_RATE_DOLLARS_PER_HOUR + TALL_THIN_BONUS_DOLLARS_PER_HOUR - SMOKER_DEDUCTION_DOLLARS_PER_HOUR;


        } else if ((TALL_INCHES > height || THIN_POUNDS < weight) && canTravel && !smokes) {
            return BASE_RATE_DOLLARS_PER_HOUR + TRAVEL_BONUS_DOLLARS_PER_HOUR;
        } else if ((TALL_INCHES > height || THIN_POUNDS < weight) && canTravel && smokes) {
            return BASE_RATE_DOLLARS_PER_HOUR + TRAVEL_BONUS_DOLLARS_PER_HOUR - SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        } else if ((TALL_INCHES > height || THIN_POUNDS < weight) && !canTravel && !smokes) {
            return BASE_RATE_DOLLARS_PER_HOUR;
        } else if ((TALL_INCHES > height || THIN_POUNDS < weight) && !canTravel && smokes) {
            return BASE_RATE_DOLLARS_PER_HOUR - SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }
        return 0;
    }

    public void displayModelDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInFeetAndInches());
        System.out.println("Weight: " + Math.round(getWeight()) + " pounds");
        if (canTravel) {
            System.out.println("Travels: yep");
        } else {
            System.out.println("Travels: nope");
        }
        if (smokes) {
            System.out.println("Smokes: yep");
        } else {
            System.out.println("Smokes: nope");
        }
        System.out.println("Hourly rate: $" + calculatePayDollarsPerHour());
    }
}

