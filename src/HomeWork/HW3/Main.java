package HomeWork.HW3;

/**
 * начение GPA не было сохранено и восстановлено, так как это поле помечено ключевым словом transient.
 * Когда объект класса Student сериализуется, значения полей name и age сохраняются в файл,
 * но значение поля GPA не сохраняется.
 * При десериализации значения полей name и age успешно восстанавливаются из файла,
 * но значение поля GPA будет иметь значение по умолчанию для его типа (0.0 для double).
 * Это происходит потому, что поле GPA было помечено как transient, что указывает, что оно не должно быть сериализовано.
 */

public class Main {
    public static void main(String[] args) {
        // Создание объекта класса Student
        Student student = new Student("Иванов", 20, 4.5);

        // Сериализация объекта в файл
        student.serializeToFile("student.ser");

        // Десериализация объекта из файла
        Student deserializedStudent = Student.deserializeFromFile("student.ser");

        // Вывод информации о студенте
        if (deserializedStudent != null) {
            deserializedStudent.printInfo();
        }
    }
}