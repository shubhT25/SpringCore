import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "Hello, world! Welcome to the world of programming. Hello world.";
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z ]","");
        String[] t = s.split(" ");
        HashMap<String, Integer> hm = new HashMap<>();
        for(String i: t){
            if(hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            } else {
                hm.put(i, 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
//        HashMap<String, Integer> res = new LinkedHashMap<String, Integer>();
        for(Map.Entry<String, Integer> me: list) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }
    }
}