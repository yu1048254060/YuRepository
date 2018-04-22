package com.bc;

import java.util.HashSet;
import java.util.Set;

public class LengthOfString {
    public static void main(String[] args) {
        System.out.println(getlength("aaaaa"));
    }

    private static int lengthof(String str) {
        int n=str.length();
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if(allUnique(str,i,j)){
                    ans=Math.max(ans,j-i);
                }
            }
        }
        return ans;
    }

    private static boolean allUnique(String str, int start, int end) {
        Set<Character> set=new HashSet<Character>();
        for(int i=start;i<end;i++){
            Character c=str.charAt(i);
            if(set.contains(c)){
                return false;
            }
            set.add(c);
        }
        return true;
    }

    public static int getlength(String str){
        Set<Character> set=new HashSet<Character>();
        int n=str.length();
        int ans=0,i=0,j=0;
        while(i<n&&j<n){
            if(!set.contains(str.charAt(j))){
                set.add(str.charAt(j++));
                ans=Math.max(ans,j-i);
            }else{
                set.remove(str.charAt(i++));
            }
        }
        return ans;
    }
}