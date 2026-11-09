package lab.lab3;

import java.util.*;

public class CodingBat {
    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    public int array667(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                ans++;
            }
        }
        return ans;
    }

    public String stringBits(String str) {
        String ans = "";
        for (int i=0; i<str.length();i=i+2){
            ans = ans + str.charAt(i);
        }
        return ans;
    }
    public Map<String, String> mapAB4(Map<String, String> map) {
        // Check if both keys "a" and "b" exist in the map
        if (map.containsKey("a") && map.containsKey("b")) {
            String aWart = map.get("a");
            String bWart = map.get("b");

            int lenA = aWart.length();
            int lenB = bWart.length();
            if (lenA > lenB) {
                map.put("c", aWart);
            } else if (lenB > lenA) {
                map.put("c", bWart);
            } else {
                // Equal lengths: change both values to empty strings
                map.put("a", "");
                map.put("b", "");
            }

        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String str:  strings) {
            String first = str.substring(0,1);
            String last = str.substring(str.length()-1);
            map.put(first,last);
        }
        return map;
    }



    public static void main(String[] args) {
        CodingBat test1 = new CodingBat(); // tworzymy obiekt
        System.out.println(test1.array123(new int[]{1, 2, 3}));
        System.out.println(test1.array667(new int[]{6, 6, 6}));
        System.out.println(test1.stringBits("Hello"));
    }



}

