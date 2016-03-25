package com.topcoder.jdavidagudelo;
import java.util.*;
/**
 * Created by ubidotsjd on 24/03/16.
 */
public class FourStrings {
    public String join(String a, String b){
        if(a.contains(b)){
            return a;
        }
        if(b.contains(a)){
            return b;
        }
        return a + b.substring(getCommon(a, b).length());
    }
    public int dfs(String dfs, String[] s, int set, int n){
        if(Integer.bitCount(set) == n){
            return dfs.length();
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if((set & (1 << i)) == 0){
                min =  Math.min(min, Math.min(dfs(join(dfs, s[i]), s, (set|(1<<i)), n),
                        dfs(join(s[i], dfs), s, (set|(1<<i)), n)));
            }
        }
        return min;
    }
    public String getCommon(String a, String b){
        char cb[] = b.toCharArray();
        String prefix = "";
        String result = "";
        for(int i = 0; i < b.length(); i++){
            prefix += String.valueOf(cb[i]);
            if(a.endsWith(prefix)){
               result = prefix;
            }
        }
        return result;
    }
    public int shortestLength(String a, String b, String c, String d){
        int min = Integer.MAX_VALUE;
        String s[] = new String[]{a, b,c, d};
        for(int i =0;i < s.length; i++){
          min = Math.min(min, dfs(s[i], s, 1 << i, 4));
        }
        return min;
    }
    public static void main(String args[]){
        FourStrings f = new FourStrings();
        System.out.println(f.shortestLength("abc","ab","bc","b"));
        System.out.println(f.shortestLength("a","bc","def","ghij"));
        System.out.println(f.shortestLength("top","coder","opco","pcode"));
        System.out.println(f.shortestLength("thereare","arelots","lotsof","ofcases"));
        System.out.println(f.shortestLength("aba","b","b","b"));
        System.out.println(f.shortestLength("x","x","x","x"));
    }
}
