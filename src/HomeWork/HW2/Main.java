package HomeWork.HW2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Rex", 5, "gsd"),
                new Cat("Murka", 3, "white")
        };

        for(Animal animal : animals){
            System.out.println("Animals: " + animal.getName() + ", Age: " + animal.getAge());

            Class<?> animalClass = animal.getClass();

            Method makeSoundMethod = null;

            try {
                makeSoundMethod = animalClass.getMethod("makeSound");
                makeSoundMethod.invoke(animal);
            } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
