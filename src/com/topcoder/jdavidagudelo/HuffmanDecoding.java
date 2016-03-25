package com.topcoder.jdavidagudelo;
import java.util.*;
/**
 * Created by ubidotsjd on 24/03/16.
 */
public class HuffmanDecoding {
    public String decode(String archive, String[] dictionary){
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < dictionary.length; i++){
            String value = String.valueOf((char)('A'+i));
            map.put(dictionary[i], value);
        }
        String currentKey = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < archive.length(); i++){
            currentKey += String.valueOf(archive.charAt(i));
            if(map.get(currentKey) != null){
                sb.append(map.get(currentKey));
                currentKey = "";
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        HuffmanDecoding hd = new HuffmanDecoding();
        System.out.println(hd.decode("101101", new String[]{"00","10","01","11"}));
        System.out.println(hd.decode("10111010", new String[]{"0","111","10"}));
        System.out.println(hd.decode("0001001100100111001", new String[] {"1","0"}));
        System.out.println(hd.decode("111011011000100110",
                new String[]{"010","00","0110","0111","11","100","101"}));
        System.out.println(hd.decode("001101100101100110111101011001011001010",
                new String[]{"110","011","10","0011","00011","111","00010","0010","010","0000"}));
    }
}
