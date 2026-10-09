import java.util.*;
public class DualPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int genBase = (x1 == 2) ? x1 : x2;
        int checkBase = (x1 == 2) ? x2 : x1;
        List<Long> dualPalindromes = new ArrayList<>();
        long limit = (long) Math.pow(2, 60);
        boolean stop = false;
        // Max bits for 2^60 is 60. Max length for base 3 is 40.
        int maxLen = (genBase == 2) ? 60 : 40; 
        for (int len = 1; len <= maxLen && !stop; len++) {
            long start = (long) Math.pow(genBase, (len - 1) / 2);
            long end = (long) Math.pow(genBase, (len + 1) / 2);
            for (long i = start; i < end; i++) {
                long num;
                if (genBase == 2) {
                    num = makeBinaryPalindrome(i, len % 2 == 1);
                } else {
                    num = makePalindrome(i, genBase, len % 2 == 1);
                }

                if (num >= limit) {
                    stop = true;
                    break;
                }

                if (isPalindromeInBase(num, checkBase)) {
                    dualPalindromes.add(num);
                }
            }
        }
        Collections.sort(dualPalindromes);
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (long val : dualPalindromes) {
            if (count >= 1000) break;
            result.append(val).append(" ");
            count++;
        }
        System.out.print(result.toString().trim());
    }
    public static long makeBinaryPalindrome(long half, boolean oddLength) {
        long num = half;
        long temp = oddLength ? (half >> 1) : half;
        while (temp > 0) {
            num = (num << 1) | (temp & 1);
            temp >>= 1;
        }
        return num;
    }
    public static long makePalindrome(long half, int base, boolean oddLength) {
        long num = half;
        if (oddLength) half /= base;
        while (half > 0) {
            num = num * base + (half % base);
            half /= base;
        }
        return num;
    }

    // Check if the number is a palindrome in the target base
    public static boolean isPalindromeInBase(long num, int base) {
        long temp = num;
        long reversed = 0;
        while (temp > 0) {
            reversed = reversed * base + (temp % base);
            temp /= base;
        }
        return num == reversed;
    }
}
