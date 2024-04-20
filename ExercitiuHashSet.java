import java.util.HashSet;

public class ExercitiuHashSet{
    public static boolean containsAllVowels(String str){
        str=str.toLowerCase();
        HashSet<Character> set=new HashSet<Character>();
        for(char c:"aeiou".toCharArray())
            set.add(c);
        for(char c:str.toCharArray())
            if(set.contains(c))
                set.remove(c);
        if(set.isEmpty())
            return true;
        return false;
    }
    public static void main(String args[]){
        System.out.println(containsAllVowels("abcdefghijklmnopqrstuvwxyz"));//returns true
        System.out.println(containsAllVowels("abcdefgh"));//returns false
        System.out.println(containsAllVowels("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));//returns true
    }
}