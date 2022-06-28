package TopKFrequentElements347;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
    private class PairCompartor implements Comparator<Pair<Integer,Integer>> {

        @Override
        public int compare(Pair<Integer,Integer> pair1, Pair<Integer,Integer> pair2) {
            //优先按照key,也就是频率来比较
            if (pair1.getKey()!=pair2.getKey()){
                return pair1.getKey()-pair2.getKey();
            }
            return pair1.getValue()-pair2.getValue();
        }
    }

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map= new HashMap<>();
        //按照<nums[i],频率>的形式存放
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }

        //按照<频率,nums[i]>的形式存放, 按照频率进行比较,传入一个实现Comparator接口的类
        PriorityQueue<Pair<Integer,Integer>> pq=new PriorityQueue<>(new PairCompartor());
        for (int num: map.keySet()){
            int numFreq=map.get(num);
            pq.add(new Pair(numFreq,num));
            if (pq.size()>k){
                pq.poll();
            }
        }


        ArrayList<Integer> resArr= new ArrayList<>();

        while (!pq.isEmpty()){
            resArr.add(pq.peek().getValue());
            pq.poll();
        }

        int[] res=new int[resArr.size()];
        for(int i=0;i < resArr.size();i++){
            res[i]=resArr.get(i);
        }

        return res;

    }
}
