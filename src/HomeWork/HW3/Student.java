package HomeWork.HW3;

import java.io.*;

public class Student implements Serializable {
    private String name;
    private int age;
    private transient double GPA;

    public Student(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    public void serializeToFile(String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            System.out.println("Объект успешно сериализован и сохранен в файле " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student deserializeFromFile(String fileName) {
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student student = (Student) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Объект успешно десериализован из файла " + fileName);
            return student;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Средний балл: " + GPA);
    }
}