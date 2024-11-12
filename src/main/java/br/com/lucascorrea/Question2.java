package br.com.lucascorrea;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

public class Question2 {
    public static void answer(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array inválido");
            return;
        }

        NodeTree root = createMinimalBST(array, 0, array.length - 1);
        System.out.printf("Array: %s%n", Arrays.toString(array));
        System.out.printf("Árvore binária de altura mínima: %n%s%n%n", root);
    }

    private static @Nullable NodeTree createMinimalBST(int @NotNull [] array, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;

        NodeTree node = new NodeTree(array[mid]);
        node.left = createMinimalBST(array, start, mid - 1);
        node.right = createMinimalBST(array, mid + 1, end);

        return node;
    }
}
