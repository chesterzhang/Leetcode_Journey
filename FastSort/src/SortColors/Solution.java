package SortColors;

class Solution {
    public void sortColors(int[] nums) {

        int m=-1;
        int n=nums.length;

        for (int i = 0; i <=n-1; ) {
            if (nums[i]==0){
                swap(nums,i,m+1);
                m++;
                i++;
            }else if (nums[i]==1){
                i++;
            }else{//nums[i]==2
                swap(nums,i,n-1);
                n--;
            }
        }


    }

    void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
