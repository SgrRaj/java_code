import java.util.*;

public class AllUniqueSubstring {
    public static void main(String[] args) {
        String s= "abaccbd";
         printAllUniqueSubstring(s);
  
    }

    public static void printAllUniqueSubstring(String s){
      Map<Character,Integer> m = new HashMap<>();
      Set<String>  uniqueSubstrings = new HashSet<>();
      int left=0 ,right=0;
      while(right<s.length()){
        char c = s.charAt(right);
      if(m.getOrDefault(c,-1)+1>left){
        left = m.getOrDefault(c,-1)+1;
        
      }

      uniqueSubstrings.add(s.substring(left,right+1));
      m.put(c,right);
      right++;
    }

    System.out.println("All unique substrings are: "+ uniqueSubstrings.size());
    for(String substring :  uniqueSubstrings){
        System.out.println(substring);
    }
}
}