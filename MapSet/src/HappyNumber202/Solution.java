package HappyNumber202;

import java.util.HashMap;
import java.util.Map;


class Solution {
    public boolean isHappy(int n) {
        Map<Integer,Integer> record=new HashMap<>();
        while (true){
            if (record.containsKey(n)){
                return false;
            }else {
                int sum= getPowerTwoSum(n);
                if (sum==1){
                    return true;
                }
                record.put(n,sum);
                n=sum;
            }
        }
    }

    private  int getPowerTwoSum(int n){
        int sum=0;
        while (n!=0){
            int x=n%10;
            sum+=x*x;
            n=n/10;
        }
        return sum;
    }
}
