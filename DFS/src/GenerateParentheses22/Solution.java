package GenerateParentheses22;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<String> res;
    public List<String> generateParenthesis(int n) {
        res=new ArrayList<>();
        if (n<=0){
            return res;
        }
        dfs(n,n,n,"");
        return  res;
    }

    private void dfs(int n, int left, int right,String curString){
        if (left<0 || right<0){
            return;
        }
        if (left>right){
            return;
        }
        dfs(n,left-1,right,curString+"(");
        dfs(n,left,right-1,curString+")");
        if (left==0 && right==0){
            res.add(curString);
        }

    }
}
