package HomeWork.HW2;

public class Dog extends Animal{
    private String breed;
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("Woof!");
    }

    public void guard(String name){
        System.out.println(name + "охраняет дом");
    }
}
