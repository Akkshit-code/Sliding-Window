import java.util.*;

public class FirstNegativeNumberinEveryWindowSizeOfK {
    public static void countfirstnegative(int [] nums,int k){
        int n=nums.length;
        int i=0;
        int j=0;
        Queue<Integer> q=new LinkedList<>();
        List<Integer> list=new ArrayList<>();

        while (j<n){
            if(nums[j]<0){
                q.offer(nums[j]);
            }
            if(j-i+1<k) j++;
            else if(j-i+1==k){
                if(q.isEmpty()){
                    list.add(0);
                }
                else{
                    list.add(q.peek());
                    if(nums[i]==q.peek()){
                        q.poll();
                    }
                }
                i++;
                j++;
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        int [] nums={-1,-2,3,4,5,5,6,-9};
        countfirstnegative(nums,2);
    }
}