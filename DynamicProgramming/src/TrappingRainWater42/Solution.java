package TrappingRainWater42;

class Solution {
    // height.length >=1
    public int trap(int[] height) {
        if (height.length<=2){
            return 0;
        }
        int sum=0;
        int[] maxLeft =new int[height.length]; // height[0, i-1] 的最大值
        int[] maxRight =new int[height.length];//  height[i+1...]的最大值
        maxLeft[1]=height[0];
        maxRight[height.length-2]=height[height.length-1];

        for (int i = 1; i <= height.length-2 ; i++) {
            maxLeft[i]=Math.max(maxLeft[i-1],height[i-1]);
        }

        for (int i = height.length-2; i >=1 ; i--) {
            maxRight[i]=Math.max(maxRight[i+1],height[i+1]);
        }

        for (int i = 1; i <= height.length-2 ; i++) {
            int minHeight= Math.min(maxLeft[i],maxRight[i]);
            if (height[i]<minHeight){
                sum=sum+ (minHeight-height[i]);
            }
        }
        return sum;
    }
}
