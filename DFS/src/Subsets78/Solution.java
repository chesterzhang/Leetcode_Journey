package Subsets78;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> res ;
    public List<List<Integer>> subsets(int[] nums) {
        res=new ArrayList<>();
        if (nums.length==0){
            return res;
        }
        dfs(nums,0,new ArrayList<Integer>());
        return res;
    }

    private void dfs(int[] nums, int startIdx, ArrayList<Integer> curSet){
        if (startIdx>nums.length){
            return;
        }
        res.add(curSet);
        for (int i = startIdx; i <nums.length ; i++) {
            ArrayList<Integer> nextSet=(ArrayList<Integer>) curSet.clone();
            nextSet.add(nums[i]);
            dfs(nums,i+1,nextSet);
        }
    }
}
