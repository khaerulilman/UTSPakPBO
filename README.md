# UTSPrakPBO
Penjelasan Code diatas :

code diatas merupakan implementasi dari konsep konsep 
1. Encapsulation
2. Inheritance
3. Polimorphism overriding
4. Interface

program disini mencetak informarsi seperti 
- numberOfLegs  
- animalType 
- foodGroup
Ketiga variabel tersebut kita buatkan setter dan getter sebagai konsep dari encapsulationnya.

Kemudian untuk konsep inherintance diterapkan pada class Dog dan class Cat yang mewariskan class Animal, sehingga class Dog dan Animal dapat menggunakan method eat() , sleep() dan run().

Kemudian untuk konsep polymorphism pada bagian ini mengimplementasikan contoh kode program Overriding. Contohnya pada method eat() ditemukan pada class induk (Animal) dan class child(Dog and Cat).
```
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
```

Kemudian disini menerapkan konsep interface, disini interface yang dibuat diberi nama FoodCost. Implementasi class interfacenya yaitu class DogFoodCost dan CatFoodCost.
