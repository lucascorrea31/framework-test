package br.com.lucascorrea;

public class Question1 {
    public static void answer(int n) {
        int m = 0;
        if (n > 0) m = count(n);

        System.out.printf("Para subir %d degraus, a criança pode subir de %d maneiras diferentes.%n", n, m);
    }

    private static int count(int n) {
        if (n < 3) return n;
        else if (n == 3) return 4;

        int[] ways = new int[n + 1];
        ways[0] = 0;
        ways[1] = 1;
        ways[2] = 2;
        ways[3] = 4;

        for (int i = 4; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2] + ways[i - 3];
        }

        return ways[n];
    }
}
