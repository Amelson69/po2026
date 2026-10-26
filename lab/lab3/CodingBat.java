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

    public static void main(String[] args) {
        CodingBat test1 = new CodingBat(); // tworzymy obiekt
        System.out.println(test1.array123(new int[]{1, 2, 3}));
        Zad2 test2 = new Zad2(); // tworzymy obiekt
        System.out.println(test2.array667(new int[]{6, 6, 6}));
    }
}

