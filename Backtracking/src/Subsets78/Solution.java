package Subsets78;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums){
        res=new ArrayList<>();
        List<Integer> remain=new ArrayList<>();
        for(int n: nums){
            remain.add(n);
        }
        dfs(remain, new ArrayList<Integer>());
        return res;
    }

    private void dfs(List<Integer> remain, List<Integer> cur){
        if (remain.size()==0){
            res.add(cur);
            return;
        }
        res.add(cur);
        for (int i = 0; i < remain.size(); i++) {
            List<Integer> nextRemain;
            if (i<=remain.size()-2){
                nextRemain= new ArrayList<>(remain.subList(i+1,remain.size()));
            } else {
                nextRemain= new ArrayList<>();
            }
            List<Integer> nextCur = new ArrayList<>(cur);
            nextCur.add(remain.get(i));
            dfs(nextRemain,nextCur);
        }
        return;
    }
}
