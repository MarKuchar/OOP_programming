package classes;

// blueprint (template)
public class Pokemon {
    // fields (attributes) - variables
    String name ;
    String type;
    int healthPoint;
    int attackPoint;

    // constructor: a special method to create an object(instance)
    // - default constructor - without any parameters
    // - default constructor is given by the compiler if you don't define any constructor
    Pokemon(String name, String type, int healthPoint, int attackPoint) {
        this.name = name;  // otherwise it does not know which name
        this.type = type;
        this.healthPoint = healthPoint;
        this.attackPoint = attackPoint;
    }

    // methods (behaviors) - methods (functions)
    void attack(Pokemon enemy) {
        if (enemy.dodge()) {
            System.out.println(enemy.name + " dodged my super power attack! ");
        } else {
            System.out.println(this.name + " attacking " + enemy.name + " with " + this.attackPoint);
            enemy.healthPoint -= this.attackPoint;
        }
    }
    boolean dodge() {
        // Math.random(): This method returns a double value from 0.0 <= < 1.0
        return Math.random() > 0.5;
    }

    void evolve() {
            System.out.println(this.name + " is evolving ...");
            // 'this' is optional since it's clear
            this.healthPoint += 20;
            attackPoint += 20;

        }
}


