package second_task;

public class DuplicateWord {
    public static void main(String[] args) {
        String word = "Hello";
        char[] chars = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (chars[i] == chars[j]) {
                    System.out.println("Повторяющийся символ:" + chars[j]);
                    break;
                }

            }
        }

    }
}
