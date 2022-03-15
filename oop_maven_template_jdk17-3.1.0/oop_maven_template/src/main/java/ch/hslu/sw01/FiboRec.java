package ch.hslu.sw01;

public class FiboRec {
    private int[] fibonacci = new int[100];

    public int fiboRec1(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n == 0 || n == 1) {
            return n;
        }

        int previousNumber = fiboRec1(n - 1);
        int previousNumber2 = fiboRec1(n - 2);

        return previousNumber + previousNumber2;
    }

    public int fiboRec2(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (fibonacci[n] != 0) {
            return fibonacci[n];
        }

        if (n == 0 || n == 1) {
            return n;
        }

        int previousNumber = fiboRec1(n - 1);
        int previousNumber2 = fiboRec1(n - 2);
        int result = previousNumber + previousNumber2;
        fibonacci[n] = result;

        return result;
    }

    public int fiboIter(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n == 0 || n == 1) {
            return n;
        }

        int previousNumber = 1;
        int previousNumber2 = 0;
        int current = 0;

        for (int i = 0; i < n - 1; i++) {
            current = previousNumber + previousNumber2;
            previousNumber2 = previousNumber;
            previousNumber = current;
        }

        return current;
    }
}
