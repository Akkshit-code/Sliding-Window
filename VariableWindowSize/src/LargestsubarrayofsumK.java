public class LargestsubarrayofsumK {
    public static int largestsubarraysum(int [] nums,int k){
        int n=nums.length;
        int i=0;
        int j=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        while (j<n){
            sum+=nums[j];
            if(sum<k) j++;
            else if(sum==k){
                max=Math.max(max,j-i+1);
                j++;
            }
            else if(sum>k){
                while (sum>k){
                    sum=sum-nums[i];
                    i++;
                }
                if (sum == k) {
                    max = Math.max(max, j - i + 1);
                }
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] nums={3,4,5,6,6,7,7};
        System.out.println(largestsubarraysum(nums,26));
    }

}
