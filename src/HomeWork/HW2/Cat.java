package HomeWork.HW2;

public class Cat extends Animal{
    private String color;
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void makeSound() {
        System.out.println("Meow!");
    }

    public void hunting(String name){
        System.out.println(name + "охотится на мышей");
    }
}
