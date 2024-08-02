public class MaximumSubarraySumOfSizeK {
    public static int maximumsum(int []nums,int k){
        int i=0;
        int j=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        while(j<n){
            sum=sum+nums[j];
            if(j-i+1 < k) j++;
            else if(j-i+1==k){
                max=Math.max(sum,max);
                sum=sum-nums[i];
                i++;
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] nums={1,2,3,3,4,5,5};
        System.out.println(maximumsum(nums,3));
    }
}
