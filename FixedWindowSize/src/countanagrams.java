import java.util.*;

class countanagrams {
    public static void findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int n=s.length();
        int t=p.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<t;i++){
            hm.put(p.charAt(i),hm.getOrDefault(p.charAt(i),0)+1);
        }
        int i=0;
        int j=0;
        int count=hm.size();
        while(j<n){
            char ch=s.charAt(j);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)-1);
                if(hm.get(ch)==0){
                    count--;
                }
            }
            if(j-i+1<t) j++;
            else if(j-i+1==t){
                if(count==0){
                    list.add(i);
                }
                char ch1=s.charAt(i);
                if(hm.containsKey(ch1)){
                    hm.put(ch1,hm.get(ch1)+1);
                    if(hm.get(ch1)==1){
                        count++;
                    }
                }
                i++;
                j++;
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        findAnagrams("cbaebabacd","abc");
    }



}
