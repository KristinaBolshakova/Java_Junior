/**
 * Напишите программу, которая использует Stream API для обработки списка чисел.
 * Программа должна вывести на экран среднее значение всех четных чисел в списке.
 */

package HomeWork.HW1;

import java.util.Arrays;
import java.util.List;

public class StreamAverage {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(7, 10, 13, 9, 21);

        double averageNum = num.stream()
                .filter(n -> n % 2 == 0)    // берем только четные числа
                .mapToInt(Integer :: intValue) // преобразуем Integer в int
                .average()  //среднее значение
                .orElse(0);  //если нет четных, то возвращаем 0

        System.out.println("Среднее значение всех четных чисел в списке = "+ averageNum);

    }
}
