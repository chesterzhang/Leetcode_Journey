package NumberOfBoomerangs447;

import java.util.HashMap;

class Solution {
    public int numberOfBoomerangs(int[][] points) {
        //points=[[0,1],[1,2]], [0,1],[1,2]就是两个点
        int res=0;

        for (int i = 0; i < points.length; i++) {
            HashMap<Integer,Integer> map=new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i==j)
                    continue;
                int distSquare=square(points[i],points[j]);
                if (map.containsKey(distSquare)){
                    map.put(distSquare,map.get(distSquare)+1);
                }else {
                    map.put(distSquare,1);
                }
            }

            for(int distSquare: map.keySet())
                res += map.get(distSquare)*(map.get(distSquare)-1);
        }
        return res;
    }

    private int square(int[] point1, int[] point2) {
        return (point1[0] - point2[0]) * (point1[0] - point2[0]) +
                (point1[1] - point2[1]) * (point1[1] - point2[1]);
    }
}
