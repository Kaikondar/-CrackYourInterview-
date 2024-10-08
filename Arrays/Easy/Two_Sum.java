import java.util.HashMap;
import java.util.Map;

class Two_Sum{
      class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x=target-nums[i];
            if(map.containsKey(x)){
                return new int[]{i,map.get(x)};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
}