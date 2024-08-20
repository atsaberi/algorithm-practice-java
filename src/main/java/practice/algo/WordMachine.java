package practice.algo;

import java.util.*;



class WordMachine {
    private static final int MAX_SIZE = (int) Math.pow(2,20);

    private static boolean isValueInBoundry(int value) {
        if (value >= 0 && value < MAX_SIZE) return true;
        else return false;
    }

    private static boolean isNotEmpty(Stack stack, int value) {
        if (stack.size() > value) return true;
        else return false;
    }

    private static Integer pop(Stack<Integer> stack) {
        if (isNotEmpty(stack, 0))  return stack.pop();
        else return -1;
    }
    private static Integer duplicate(Stack<Integer> stack) {
        if (isNotEmpty(stack, 0))  return stack.push(stack.peek());
        else return -1;
    }

    private static Integer parseCommand(String command) {
        try {
            int value = Integer.parseInt(command);
        } catch (NumberFormatException e) {
            return -1;
        }
        return Integer.parseInt(command);
    }

    private static Integer pushNumber(Stack<Integer> stack, int value) {
        if (isValueInBoundry(value))
            stack.push(value);
        else
            return -1;
        return null;
    }

    private static Integer add(Stack<Integer> stack) {
        if (isNotEmpty(stack, 1)) {
            int a = stack.pop();
            int b = stack.pop();
            if (isValueInBoundry(a + b)) stack.push(a + b);
            else return -1;
        } else return -1;
        return -1;
    }

    private static Integer minus(Stack<Integer> stack) {
        if (isNotEmpty(stack, 1)) {
            int a = stack.pop();
            int b = stack.pop();
            if (isValueInBoundry(a - b)) stack.push(a - b);
            else return -1;
        } else return -1;
        return -1;
    }

    public static int wordMachine(String S) {
        Stack<Integer> stack = new Stack<>();

        Arrays.stream(S.split(" ")).forEach(command -> {
            switch (command) {
                case "POP" -> pop(stack);
                case "DUP" -> duplicate(stack);
                case "+" -> add(stack);
                case "-" -> minus(stack);
                default -> {
                    int value = parseCommand(command);
                    pushNumber(stack,value);
                }
            }
        });
        return pop(stack);
    }
}
