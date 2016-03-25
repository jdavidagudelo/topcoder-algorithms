package com.topcoder.jdavidagudelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ubidotsjd on 24/03/16.
 */
public class Permutations {

    private Integer[] x;
    private List<Integer[]> permutations = new ArrayList<>();
    public void permute(int index){
        if(index == x.length -1){
            permutations.add(Arrays.copyOf(x, x.length));
        }
        for(int i = index; i < x.length; i++){
            swap(index, i);
            permute(index+1);
            swap(index, i);
        }
    }
    public void swap(int i, int j){
        int aux = x[i];
        x[i] = x[j];
        x[j] = aux;
    }
}
