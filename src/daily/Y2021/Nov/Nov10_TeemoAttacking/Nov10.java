package daily.Y2021.Nov.Nov10_TeemoAttacking;

import util.PrintUtil;

public class Nov10 {
    private static final int[] s1 = { 1, 4 };
    private static final int[] s2 = { 1, 2 };

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.println(solution.findPoisonedDuration(s1, 2));
        PrintUtil.println(solution.findPoisonedDuration(s2, 2));
    }
}
