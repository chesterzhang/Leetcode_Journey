package LetterCombinationsofaPhoneNumber17;

import java.util.ArrayList;
import java.util.List;

class Solution {

    private String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs",
            "tuv", "wxyz"};

    private List<String> res = new ArrayList<>();


    public List<String> letterCombinations(String digits) {
        if (digits.equals("")) {
            return new ArrayList<>();
        }
        dfs(digits, "", 0);
        return res;
    }

    private void dfs(String digits, String curRes, int depth) {
        if (depth>=digits.length()){
            res.add(curRes);
            return;
        }
        int curDigit=Integer.parseInt(digits.substring(depth,depth+1));
        for (int i = 0; i < map[curDigit].length() ; i++) {
            String nextRes=curRes+ map[curDigit].substring(i,i+1);
            dfs(digits,nextRes,depth+1);
        }
        return;

    }

}
