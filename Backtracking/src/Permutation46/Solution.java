package Permutation46;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    private List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res=new ArrayList<>();
        if (nums.length==0){
            return res;
        }
        List<Integer> remainingNums=new ArrayList<>();
        for (int n:nums) {
            remainingNums.add(n);
        }
        dfs(remainingNums,new ArrayList<Integer>());
        return res;

    }

    private  void dfs(List<Integer> remainingNums, List<Integer> curRes){
        if (remainingNums.size()==0){
            res.add(curRes);
            return;
        }
        for (int i = 0; i < remainingNums.size(); i++) {
            List<Integer> nextRemNums= new ArrayList<>(remainingNums);
            nextRemNums.remove(i);
            List<Integer> nextCurRes=new ArrayList<>(curRes);
            nextCurRes.add(remainingNums.get(i));
            dfs(nextRemNums,nextCurRes);
        }
        return;
    }
}
