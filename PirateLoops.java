/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foobar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author annamaxam
 */
public class PirateLoops {
    public static void main(String[] args) {
        int[] a = {1,4,3,2,2,3};
        int[] b = {1,2,3,1,0};
        int[] c = {1,8,3,4,6,1,7,3,2};
        
        System.out.println(answer(c));
        System.out.println(answer(b));
        System.out.println(answer(a));
    }
    
    
    
    public static int answer(int[] numbers) {
        int numberOfPirates = 1;
        List<Integer> nextIndices = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        int m=0;
        boolean isRepeat = false;
        
        do {
            list.add(numbers[m]);
            nextIndices.add(m);
            for (int i = 0; i <nextIndices.size(); i++) {
                if (numbers[m] == nextIndices.get(i)) {
                    isRepeat = true;
                }
            }
            m = numbers[m];
           
        } while (! isRepeat);
        
        System.out.println(list);
        int beginningOfLoop = list.get(list.size()-1);
        for(int i = list.size()-2;i>=0;i--) {
            if (beginningOfLoop != list.get(i)) {
                numberOfPirates+=1;
            } else {
                return numberOfPirates;
            }
        }
        return numberOfPirates;
            
        }

}
