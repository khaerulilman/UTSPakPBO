class Animal {
    private int numberOfLegs;
    private String animalType;
    private String foodGroup;

    // encapculations for animal information
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getFoodGroup() {
        return foodGroup;
    }

    public void setFoodGroup(String foodGroup) {
        this.foodGroup = foodGroup;
    }

    // animal activities list
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public void run() {
        System.out.println("Animal is running");
    }
}


// inherintance
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }

    // Overriding eat for Dog
    @Override
    public void eat() {
        System.out.println("Dog eat Meat");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Cat is meowing");
    }

    // Overriding eat for Cat
    @Override
    public void eat() {
        System.out.println("Cat eat Fish");
    }
}

// interface
interface FoodCost {
    double calculateCost();
}

class DogFoodCost implements FoodCost {
    double priceFood, numberOfDaysFood, numberOfDaysMilk, priceMilk;

    public DogFoodCost(double priceFood, double numberOfDaysFood, double priceMilk, double numberOfDaysMilk ){

        this.priceFood = priceFood;
        this.numberOfDaysFood = numberOfDaysFood;
        this.priceMilk = priceMilk;
        this.numberOfDaysMilk = numberOfDaysMilk;

    }
    @Override
    public double calculateCost() {
        return (30/numberOfDaysFood)*priceFood +(30/numberOfDaysMilk)*priceMilk;
    }
}

class CatFoodCost implements FoodCost {
    double priceFood, numberOfDays;

    public CatFoodCost(double priceFood, double numberOfDays){
        this.priceFood = priceFood;
        this.numberOfDays = numberOfDays;
    }
    @Override
    public double calculateCost() {
        return (30/numberOfDays)*priceFood;
    }
}

public class informationAnimal {
    public static void main(String[] args) {
        // animal dog
        Dog dog = new Dog();
        dog.setNumberOfLegs(4);
        dog.setAnimalType("Mammal");
        dog.setFoodGroup("Carnivore");

        System.out.println("(Dog Information)");
        System.out.println("Number of Legs: " + dog.getNumberOfLegs());
        System.out.println("Animal Type   : " + dog.getAnimalType());
        System.out.println("Food Group    : " + dog.getFoodGroup());
        System.out.println("");
        System.out.println("(Start Activity for Dog)");
        dog.eat();  
        dog.sleep(); 
        dog.bark(); 
        dog.run();
        System.out.println("");
        System.out.println("(Estimated feed costs 1 month for dog)");
        DogFoodCost dogFoodCost = new DogFoodCost(32000, 7,20000,4);
        System.out.println("Dog food cost: Rp " + dogFoodCost.calculateCost());

        System.out.println("===========================");
        System.out.println("");
        // animal cat
        Cat cat = new Cat();
        cat.setNumberOfLegs(4);
        cat.setAnimalType("Mammal");
        cat.setFoodGroup("Carnivore");

        System.out.println("(Cat Information)");
        System.out.println("Number of Legs: " + cat.getNumberOfLegs());
        System.out.println("Animal Type   : " + cat.getAnimalType());
        System.out.println("Food Group    : " + cat.getFoodGroup());
        System.out.println("");
        System.out.println("(Start Activity for Cat)");
        cat.eat();  
        cat.sleep();
        cat.meow(); 
        cat.run();
        System.out.println("");
        System.out.println("(Estimated feed costs 1 month for cat)");
        CatFoodCost catFoodCost = new CatFoodCost(18000, 4);
        System.out.println("Cat food cost: Rp " + catFoodCost.calculateCost());

        System.out.println("===========================");
        System.out.println("");
    }
}
