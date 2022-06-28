package AssignCookies455;

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int res=0;
        int i=0;
        int j=0;

        while (i<s.length && j<g.length){
            if (s[i]>=g[j]){
                res++;
                i++;
                j++;
            }else {
                i++;
            }
        }

        return res;

    }
}
