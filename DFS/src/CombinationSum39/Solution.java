package CombinationSum39;


import java.util.ArrayList;

import java.util.List;

public class Solution {
    private List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res=new ArrayList<>();
        if (candidates.length==0){
            return res;
        }
        dfs(candidates,target,0,0,new ArrayList<Integer>());
        return res;
    }

    private void dfs(int[] candidates, int target,int starIdx,int curSum, ArrayList<Integer> curCombination){
        if (curSum>target){
            return;
        }
        if (curSum==target){
            res.add(curCombination);
            return;
        }

        for (int i = starIdx; i < candidates.length; i++) {
            ArrayList<Integer> nextCombination = (ArrayList<Integer>)curCombination.clone();
            nextCombination.add(candidates[i]);
            dfs(candidates,target,i,curSum+candidates[i],nextCombination);
        }
    }
}
