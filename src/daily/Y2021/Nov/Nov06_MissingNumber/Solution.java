package daily.Y2021.Nov.Nov06_MissingNumber;

class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0;
        for (int num : nums){
            ans ^= num;
        }
        for (int i = 0; i <= nums.length; i++){
            ans ^= i;
        }
        return ans;
    }
}