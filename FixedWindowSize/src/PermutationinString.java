import java.util.*;
public class PermutationinString {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n1;i++){
            hm.put(s1.charAt(i),hm.getOrDefault(s1.charAt(i),0)+1);
        }
        int i=0;
        int j=0;
        int count=n1;
        while(j<n2){
            char ch=s2.charAt(j);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)-1);
                if(hm.get(ch)>=0) count--;
            }
            if(j-i+1<n1) j++;
            else if(j-i+1==n1){
                if(count==0) return true;
                char leftChar = s2.charAt(i);
                if (hm.containsKey(leftChar)) {
                    hm.put(leftChar, hm.get(leftChar) + 1);
                    if (hm.get(leftChar) > 0) count++;
                }

                i++;
                j++;
            }

        }
        return false;
    }

}
