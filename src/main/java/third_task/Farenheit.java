package third_task;

import java.util.Scanner;

public class Farenheit implements Convertation {
    @Override
    public double getConvertedValue(double userValue) {
        return (userValue * 9 / 5) + 32;
    }
}