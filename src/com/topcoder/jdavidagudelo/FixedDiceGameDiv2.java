package com.topcoder.jdavidagudelo;

/**
 * Created by ubidotsjd on 24/03/16.
 */
public class FixedDiceGameDiv2 {
    public double getExpectation(int a, int b){
        int count = 0;
        int total = 0;
        for(int i = 2; i <= a; i++){
            int m = Math.min(i-1, b);
            total += m*i;
            count += m;
        }
        return (double)total/(double)count;
    }
    public static void main(String args[]){
        FixedDiceGameDiv2 f = new FixedDiceGameDiv2();
        System.out.println(f.getExpectation(2, 2));
        System.out.println(f.getExpectation(4, 2));
        System.out.println(f.getExpectation(3, 3));
        System.out.println(f.getExpectation(11, 13));
    }
}
