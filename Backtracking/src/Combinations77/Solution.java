package Combinations77;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<List<Integer>> res;
    // n>=1, k>=1
    public List<List<Integer>> combine(int n, int k) {
        res=new ArrayList<>();
        List<Integer> remain=new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            remain.add(i);
        }
        dfs(remain,new ArrayList<Integer>(),k);
        return res;
    }
    
    private void dfs(List<Integer> remain, List<Integer> cur,int k){
        if (cur.size()==k){
            res.add(cur);
            return;
        }
        for (int i = 0; i < remain.size(); i++) {
            List<Integer> nextRem;
            if (i<=remain.size()-2){
                nextRem=new ArrayList<>(remain.subList(i+1,remain.size()));
            }else {
                nextRem=new ArrayList<>();
            }
            List<Integer> nextCur=new ArrayList<>(cur);
            nextCur.add(remain.get(i));
            dfs(nextRem,nextCur,k);
        }
        return;
    }
}
