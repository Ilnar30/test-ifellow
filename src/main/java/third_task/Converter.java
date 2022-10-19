package third_task;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Converter {
    private final static Scanner sc = new Scanner(System.in);
    Degree degree = new Degree();

    UserInterface userInterface = new UserInterface();

    void convert() {
        if (degree.value().equals(userInterface.choose())) {
            System.out.println("Градусы в Фаренгейтах:" + new Farenheit().getConvertedValue(userInterface.enterValue()));
        } else {
            System.out.println("Градусы в Кельвинах: " + new Kelvin().getConvertedValue(userInterface.enterValue()));
        }
    }
}
