package first_task;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class RandomValue {
    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = 10 + (int) (Math.random() * 100);
            System.out.println(randomNumbers[i] + "");
        }
        IntStream intStream = Arrays.stream(randomNumbers);
        OptionalInt optionalInt = intStream.max();
        int maxNumber = optionalInt.getAsInt();
        System.out.println("Максимальное значение:" + maxNumber);
        IntStream intStream1 = Arrays.stream(randomNumbers);
        OptionalInt optionalInt1 = intStream1.min();
        int minNumber = optionalInt1.getAsInt();
        System.out.println("Минимальное значение:" + minNumber);
        IntStream intStream2 = Arrays.stream(randomNumbers);
        OptionalDouble optionalDouble = intStream2.average();
        double avgNumber = optionalDouble.getAsDouble();
        System.out.println("Среднее значение:" + avgNumber);
    }
}