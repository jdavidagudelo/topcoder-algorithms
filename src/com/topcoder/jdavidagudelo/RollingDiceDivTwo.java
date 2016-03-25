package com.topcoder.jdavidagudelo;
import java.util.*;
/**
 * Created by ubidotsjd on 24/03/16.
 */
public class RollingDiceDivTwo {
    public int minimumFaces(String[] rolls){
        int[][] table = new int[rolls.length][rolls[0].length()];
        for(int i =0;i < rolls.length; i++){
            Character[] c = new Character[rolls[i].length()];
            int k = 0;
            for(char ch : rolls[i].toCharArray())
            {
                c[k] = ch;
                k++;
            }
            Arrays.sort(c, (o1, o2) -> Character.compare(o2, o1));
            for(int j = 0; j < c.length; j++){
                table[i][j]  = Integer.parseInt(String.valueOf(c[j]));
            }
        }
        int sum = 0;
        for(int i=0; i < rolls[0].length(); i++){
            int max = 0;
            for(int j = 0; j < rolls.length; j++){
                max =Math.max(max, table[j][i]);
            }
            sum += max;
        }
        return sum;
    }
    public static void main(String args[]){
        RollingDiceDivTwo r = new RollingDiceDivTwo();
        System.out.println(r.minimumFaces(new String[]{"137", "364", "115", "724"}));
        System.out.println(r.minimumFaces(new String[]{"1112", "1111", "1211", "1111"}));
        System.out.println(r.minimumFaces(new String[]{"24412", "56316", "66666", "45625"}));
        System.out.println(r.minimumFaces(new String[]{"931", "821", "156", "512", "129", "358", "555"}));
        System.out.println(r.minimumFaces(new String[]{"3", "7", "4", "2", "4"}));
        System.out.println(r.minimumFaces(new String[]{"281868247265686571829977999522", "611464285871136563343229916655", "716739845311113736768779647392", "779122814312329463718383927626",
                        "571573431548647653632439431183", "547362375338962625957869719518", "539263489892486347713288936885", "417131347396232733384379841536"}));
    }
}
