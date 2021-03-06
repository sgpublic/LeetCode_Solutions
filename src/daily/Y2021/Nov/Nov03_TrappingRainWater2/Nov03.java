package daily.Y2021.Nov.Nov03_TrappingRainWater2;

public class Nov03 {
    private static final int[][] s1 = {
            { 3, 3, 3, 3, 3 },
            { 3, 2, 2, 2, 3 },
            { 3, 2, 1, 2, 3 },
            { 3, 2, 2, 2, 3 },
            { 3, 3, 3, 3, 3 }
    };
    private static final int[][] s2 = {
            { 1, 4, 3, 1, 3, 2 },
            { 3, 2, 1, 3, 2, 4 },
            { 2, 3, 3, 2, 3, 1 }
    };

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.trapRainWater(s1));
        System.out.println(s.trapRainWater(s2));
    }
}
