import java.util.TreeMap;

public class ExercitiuTreeMap {
    public static TreeMap<String,Integer>countWords(String[]words){
        TreeMap<String,Integer> map=new TreeMap<String,Integer>();
        for(String s:words){
            s=s.toLowerCase();
            if(!map.containsKey(s))
                map.put(s, 0);
            map.put(s,map.get(s)+1);
        }
        return map;
    }
    public static void main(String[] args) {
        String[] words={"apple","apple","pear","banana","apple","cocos","cocos","COCOs"};
        System.out.println(countWords(words));//output: {apple=3, banana=1, cocos=3, pear=1}
    }
}
