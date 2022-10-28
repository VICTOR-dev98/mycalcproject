package project.calculator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MainApp {

    public static void main(String[] args) {
        final String inputExp = ReadInput.read();

        Queue<String> operations;
        Queue<String> numbers;

        String numbersArr[] = inputExp.split("[-+*/]");
        String operArr[] = inputExp.split("[0-9]+");

        numbers = new LinkedList<String>(Arrays.asList(numbersArr));
        operations = new LinkedList<String>(Arrays.asList(operArr));

        Double res = Double.parseDouble(numbers.poll());

        while (!numbers.isEmpty()) {
            String opr = operations.poll();

            Operate operate;
            switch (opr) {
                case "+":
                    operate = new Add();
                    break;
                default:
                    continue;
            }

        }
    }
}
