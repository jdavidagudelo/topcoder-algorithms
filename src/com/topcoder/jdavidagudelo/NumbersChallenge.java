package com.topcoder.jdavidagudelo;
import java.util.*;
/**
 * Created by ubidotsjd on 24/03/16.
 */
public class NumbersChallenge {
    public int MinNumber(int[] S){
        Set<Integer> sums = new HashSet<>();
        for(int i = 0;i < S.length; i++){
            Set<Integer> current = new HashSet<>();
            for(int sum : sums){
                current.add(sum+S[i]);
            }
            sums.addAll(current);
            sums.add(S[i]);
        }
        for(int i = 1; i <= 2000000; i++){
            if(!sums.contains(i)){
                return i;
            }
        }
        return 2000000;
    }
    public static void main(String args[]){
        long t;
        NumbersChallenge n = new NumbersChallenge();
        t = System.currentTimeMillis();
        System.out.println(n.MinNumber(new int[]{5, 1, 2}));
        System.out.println(System.currentTimeMillis()-t);
        t = System.currentTimeMillis();
        System.out.println(n.MinNumber(new int[]{2, 1, 4}));
        System.out.println(System.currentTimeMillis()-t);
        t = System.currentTimeMillis();
        System.out.println(n.MinNumber(new int[]{2, 1, 2, 7}));
        System.out.println(System.currentTimeMillis()-t);
        t = System.currentTimeMillis();
        System.out.println(n.MinNumber(new int[]{94512, 2, 87654, 81316, 6, 5, 6, 37151, 6, 139, 1, 36, 307, 1, 377, 101, 8, 37, 58, 1}));
        System.out.println(System.currentTimeMillis()-t);
        t = System.currentTimeMillis();
        System.out.println(n.MinNumber(new int[]{883, 66392, 3531, 28257, 1, 14131, 57, 1, 25, 88474, 4, 1, 110, 6, 1769, 220, 442, 7064, 7, 13}));
        System.out.println(System.currentTimeMillis()-t);
    }
}
