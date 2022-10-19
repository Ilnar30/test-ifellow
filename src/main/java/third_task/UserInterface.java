package third_task;

import javax.swing.*;

public class UserInterface {
    public double enterValue() {
        double n = Double.parseDouble(JOptionPane.showInputDialog("Введите градусы Цельсия"));
        System.out.println(n);
        return n;
    }
    public String choose() {
        String[] name = {"Кельвины", "Фаренгейты"};
        String d = (String) JOptionPane.showInputDialog(null, "Выберите способ преобразования", "Окно", JOptionPane.OK_OPTION, null, name, name[1]);
        System.out.println(d);
        return d;
    }
}
