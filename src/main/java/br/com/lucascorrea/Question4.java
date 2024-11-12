package br.com.lucascorrea;

public class Question4 {
    public static void answer(String palindrome) {
        if (isPalindrome(palindrome)) System.out.printf("\"%s\" é um palindromo%n", palindrome);
        else System.out.printf("\"%s\" NÃO é um palindromo%n", palindrome);
    }

    private static boolean isPalindrome(String str) {
        if (str == null) return false;
        if (str.isEmpty() || str.length() == 1) return true;

        NodeDoublyLinkedList head = null;
        NodeDoublyLinkedList tail = null;

        char[] arr = str.toLowerCase().toCharArray();
        for (char c : arr) {
            NodeDoublyLinkedList newNode = new NodeDoublyLinkedList(c);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        while (head != tail && head.prev != tail) {
            if (head.data != tail.data) {
                return false;
            }
            head = head.next;
            tail = tail.prev;
        }
        return true;
    }
}
