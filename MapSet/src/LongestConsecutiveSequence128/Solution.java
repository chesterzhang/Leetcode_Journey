package LongestConsecutiveSequence128;

import java.util.HashSet;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length<=1){
            return  nums.length;
        }

        HashSet<Integer> set= new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }

        int maxLength=1;

        for(int num : set){
            if (set.contains(num-1)){// 说明当前数字不算序列的起点
                continue;
            }
            int tempLen=1;
            int nextNum=num+1;
            while (set.contains(nextNum)){
                tempLen+=1;
                maxLength=Math.max(maxLength,tempLen);
                nextNum+=1;
            }
        }
        return maxLength;
    }
}


