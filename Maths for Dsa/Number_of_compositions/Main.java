//range sum of digit > than all of number within range 

class Solution {
    long findMax(long N) {
        long bestNum = N;
        int bestSum = digitSum(N);

        String s = Long.toString(N);
        StringBuilder candidate = new StringBuilder(s);

        // reduce first non-zero digit by 1
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                candidate.setCharAt(i, (char)(s.charAt(i) - 1));
                // fill rest with 9
                for (int j = i + 1; j < s.length(); j++) {
                    candidate.setCharAt(j, '9');
                }
                break;
            }
        }

        long candNum = Long.parseLong(candidate.toString());
        int candSum = digitSum(candNum);

        if (candSum > bestSum) bestNum = candNum;

        return bestNum;
    }

    private int digitSum(long x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
