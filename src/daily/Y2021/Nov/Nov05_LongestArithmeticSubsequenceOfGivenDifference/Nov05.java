package daily.Y2021.Nov.Nov05_LongestArithmeticSubsequenceOfGivenDifference;

import util.PrintUtil;

public class Nov05 {
    private static final int[] s1 = { 1, 2, 3, 4 };
    private static final int[] s2 = { 1, 3, 5, 7 };
    private static final int[] s3 = { 1, 5, 7, 8, 5, 3, 4, 2, 1 };
    private static final int[] s4 = {
            7, -2, 8, 10, 6, 18, 9, -8, -5,
            18, 13, -6, -17, -1, -6, -9, 9, 9
    };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.longestSubsequence(s1, 1));
        PrintUtil.println(solution.longestSubsequence(s2, 1));
        PrintUtil.println(solution.longestSubsequence(s3, -2));
        PrintUtil.println(solution.longestSubsequence(s4, 1));
    }
}
