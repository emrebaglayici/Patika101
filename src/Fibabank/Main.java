package Fibabank;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,19,26,-1};
//        returnMax(array);
        returnDuplicate("emreebagalayiciig");
    }
    public static void returnMax(int[] nums){
        int temp=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>temp){
                temp=nums[i];
            }
        }
        System.out.println(temp);
    }

    public static void returnDuplicate(String str){
        Set<Character> set1=new HashSet<>();
        Set<Character> set2=new HashSet<>();

        char[] chars=str.toCharArray();
        for (char c:chars){
            if (!set1.add(c)){
                set2.add(c);
            }
        }

        for (char a:set2){
            System.out.print(a+" ");
        }
    }
}
