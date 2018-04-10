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
        int[] a = {1,2,1};
        int[] b = {1,0};
        int[] c = {1,8,3,4,6,1,7,3,2};
        int[] d = {1,4,3,2,2,3};
        int[] e = {1,2,3,1,0};
        
        
        System.out.println(answer(a));
        System.out.println(answer(b));
        System.out.println(answer(c));
        System.out.println(answer(d));
        System.out.println(answer(e));
    }
    
    public static int answer(int[] numbers) {
        // Counter to keep track of number of pirates in the loop
        int numberOfPirates = 1; 
        
        // List of barstools (indices) you stop at (by number)
        List<Integer> nextIndices = new ArrayList<>(); 
        
        // List of tattooed ID numbers of pirates you talk to 
        List<Integer> idNumbers = new ArrayList<>(); 
        
        // Barstool (index) number of the pirate you will talk to next - starts at 0
        int m=0; 
        
        // Track whether you've started the loop
        boolean isRepeat = false; 
        
        do {
            // Add barstool (index) # of the next pirate you will talk to 
            nextIndices.add(m); 
            // Go to that barstool and add ID # of that pirate to the list
            idNumbers.add(numbers[m]); 
            for (int i = 0; i <nextIndices.size(); i++) {
                // If the ID # of the current pirate matches a number in the list of barstools you've been to, you have been to this pirate before and have started a loop.
                if (numbers[m] == nextIndices.get(i)) { 
                    // Change the repeat tracker to true and break out of the for loop
                    isRepeat = true; 
                    break; 
                }
            }
            // Move to the next barstool based on the ID # of the pirate you're currently talking to
            m = numbers[m]; 
           
        } while (! isRepeat); 

        
//      Beginning of the loop is the last ID # that got added to the idNumbers list
        int beginningOfLoop = idNumbers.get(idNumbers.size()-1);
        
//      Go backwards through the idNumbers list, adding the number of pirates until an ID # matches the last number that got added to the list
        for(int i = idNumbers.size()-2;i>=0;i--) {
            if (beginningOfLoop != idNumbers.get(i)) {
                numberOfPirates+=1;
            } else {
                return numberOfPirates;
            }
        }
        return numberOfPirates;
            
        }

}
