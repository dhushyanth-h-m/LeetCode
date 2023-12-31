import java.util.*;
class Solution21 {
    public int minDeletions(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        HashMap<Integer, String> valueMap = new HashMap<>();

        char[] characters = s.toCharArray();
        int charsToBeDelete = 0;

        for(char c: characters){
            hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : hashMap.entrySet()){
            if(valueMap.containsKey(entry.getValue())){
                valueMap.put(entry.getValue(), String.valueOf(entry.getKey()).concat(valueMap.get(entry.getValue())));
            }
            else
                valueMap.put(entry.getValue(), String.valueOf(entry.getKey()));
        }

        for(String a: valueMap.values()){
            if(a.length() == 2 && !valueMap.containsKey(hashMap.get(a.charAt(0)) -1)){
                // charsToBeDelete = hashMap.get(a.charAt(0)) - 1;
                charsToBeDelete += 1;
                // System.out.println(valueMap.containsKey(hashMap.get(a.charAt(0))));
            }
            else if(a.length() == 2 && valueMap.containsKey(hashMap.get(a.charAt(0)) -1)){
                // System.out.println(valueMap.containsKey(hashMap.get(a.charAt(0)) - 1));
                // charsToBeDelete = hashMap.get(a.charAt(0)) - 2;
                charsToBeDelete += 2;
            }
            else if(a.length() == 3 && !valueMap.containsKey(hashMap.get(a.charAt(0)) -1)){
                // System.out.println(valueMap.containsKey(hashMap.get(a.charAt(0)) - 1));
                // charsToBeDelete = hashMap.get(a.charAt(0)) - 2;
                charsToBeDelete += hashMap.get(a.charAt(0))+1;
            }
            else if(a.length() == 4 && !valueMap.containsKey(hashMap.get(a.charAt(0)) -1)){
                // System.out.println(valueMap.containsKey(hashMap.get(a.charAt(0)) - 1));
                // charsToBeDelete = hashMap.get(a.charAt(0)) - 2;
                charsToBeDelete += hashMap.get(a.charAt(0))+2;
            }
        }
        System.out.println(valueMap);
        return charsToBeDelete;
    }
}