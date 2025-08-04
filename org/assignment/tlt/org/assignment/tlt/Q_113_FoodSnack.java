package org.assignment.tlt;

class Food {
    String name;
    int totalCalories;
    int totalServings;

    public Food(String name, int totalCalories, int totalServings) {
        this.name = name;
        this.totalCalories = totalCalories;
        this.totalServings = totalServings;
    }

    public double caloriesPerServing() {
        return (double) totalCalories / totalServings;
    }

    public void displayInfo() {
        System.out.println("Food: " + name);
        System.out.println("Calories per Serving: " + caloriesPerServing());
    }
}

class Snack extends Food {
    int servingSize; 
    String type; 

    public Snack(String name, int totalCalories, int totalServings, int servingSize, String type) {
        super(name, totalCalories, totalServings);
        this.servingSize = servingSize;
        this.type = type;
    }

    @Override
    public double caloriesPerServing() {
        double baseCalories = super.caloriesPerServing();
        if (type.equalsIgnoreCase("healthy")) {
            baseCalories *= 0.9; 
        }
        return baseCalories;
    }

    @Override
    public void displayInfo() {
        System.out.println("Snack: " + name);
        System.out.println("Type: " + type);
        System.out.println("Serving Size: " + servingSize + "g");
        System.out.println("Calories per Serving: " + caloriesPerServing());
    }
}

public class Q_113_FoodSnack {
    public static void main(String[] args) {
        Snack snack = new Snack("Granola Bar", 200, 2, 40, "healthy");
        snack.displayInfo();
    }
}
