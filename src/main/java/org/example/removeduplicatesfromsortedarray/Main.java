package org.example.removeduplicatesfromsortedarray;

public class Main {
    public static void main(String[] args) {
        int[] ints = {1, 1, 2};
        int result = new Solution().removeDuplicates(ints);
        for (int anInt : ints) {
            System.out.println(anInt + " ");
        }
    }
}
