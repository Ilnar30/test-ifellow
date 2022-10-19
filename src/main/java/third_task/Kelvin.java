package third_task;

import third_task.Convertation;

import java.util.Scanner;

public class Kelvin implements Convertation{
    @Override
    public double getConvertedValue(double userValue) {
        return userValue + 273.15;
    }
}

