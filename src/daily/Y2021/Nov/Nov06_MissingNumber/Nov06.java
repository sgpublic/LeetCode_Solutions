package daily.Y2021.Nov.Nov06_MissingNumber;

import util.PrintUtil;

public class Nov06 {
    private static final int[] s1 = { 3, 0, 1 };
    private static final int[] s2 = { 0, 1 };
    private static final int[] s3 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
    private static final int[] s4 = { 0 };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.missingNumber(s1));
        PrintUtil.println(solution.missingNumber(s2));
        PrintUtil.println(solution.missingNumber(s3));
        PrintUtil.println(solution.missingNumber(s4));
    }
}
