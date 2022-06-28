package IntersectionofTwoArraysII350;

import java.util.ArrayList;
import java.util.TreeMap;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        TreeMap<Integer,Integer> recordMap =new TreeMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if (!recordMap.containsKey(nums1[i])){
                recordMap.put(nums1[i],1);
            }else {
                recordMap.put(nums1[i],recordMap.get(nums1[i])+1);
            }
        }

        ArrayList<Integer> recordArr=new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if(recordMap.containsKey(nums2[i]) && recordMap.get(nums2[i])>0){
                recordArr.add(nums2[i]);
                recordMap.put(nums2[i],recordMap.get(nums2[i])-1);
            }
        }

        int[] retInt =new int[recordArr.size()];
        int idx=0;
        for(int e : recordArr){
            retInt[idx++]=e;
        }

        return retInt;
    }
}
