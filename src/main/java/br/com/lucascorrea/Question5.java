package br.com.lucascorrea;

import org.jetbrains.annotations.NotNull;

import java.util.Stack;

public class Question5 {
    public static void answer(Stack<Integer> stack) {
        if (stack == null || stack.isEmpty()) {
            System.out.println("Pilha vazia");
            return;
        }

        System.out.println("Pilha original:");
        System.out.printf("%s -> (%d)%n", stack, stack.peek());

        Stack<Integer> orderedStack = sort(stack);

        System.out.println("\nPilha ordenada:");
        System.out.printf("%s -> (%d)%n", orderedStack, orderedStack.peek());
    }

    private static @NotNull Stack<Integer> sort(@NotNull Stack<Integer> stack) {
        Stack<Integer> sortedStack = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!sortedStack.isEmpty() && sortedStack.peek() > temp) {
                stack.push(sortedStack.pop());
            }

            sortedStack.push(temp);
        }

        return sortedStack;
    }
}
