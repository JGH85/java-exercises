package org.launchcode.java.demos.java4python.studios;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Joseph on 2/27/2017.
 */
public class CharCount {



    public static void main(String[] args){
        String demo = "Lorem ipsum dolor sit amet, " +
                "consectetur adipiscing elit. Nunc accumsan " +
                "sem ut ligula scelerisque sollicitudin. Ut at " +
                "sagittis augue. Praesent quis rhoncus justo. Aliquam " +
                "erat volutpat. Donec sit amet suscipit metus, " +
                "non lobortis massa. Vestibulum augue ex, dapibus " +
                "ac suscipit vel, volutpat eget massa. Donec nec " +
                "velit non ligula efficitur luctus.z";

        //convert to lowercase, optional
        demo = demo.toLowerCase();
        demo = demo.trim();
        char[] charactersInString;
        charactersInString = demo.toCharArray();
        HashMap<Character, Integer> letterCount;
        letterCount = new HashMap<>();

        for (int i=0;i<=charactersInString.length-1; i++) {
            Character c = charactersInString[i];
            //get rid of all non-letters
            if (!Character.isLetter(c))continue;
            //if not included, add; otherwise augment
            if (!letterCount.containsKey(c)) {
                letterCount.put(c, 1);
            } else {
                Integer newcount = letterCount.get(c);
                newcount ++;
                letterCount.put(c, newcount);
            }

        }
        for (Map.Entry<Character, Integer> count : letterCount.entrySet()) {
            System.out.println(count.getKey() + " (" + count.getValue() + ")");

        }


    }
}
