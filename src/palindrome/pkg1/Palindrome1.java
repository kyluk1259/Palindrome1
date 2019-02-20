/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome.pkg1;

import javax.swing.*;

/**
 *
 * @author kyluk1259
 */
public class Palindrome1 {

    public static void main(String[] args) {
        String word, backwardsWord;
        int pos;

        //get the word from the user
        word = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a words is a palindrome.\n\n"
                + "Enter a word:");

        //Reverse the word
        backwardsWord = "";
        for (pos = word.length() - 1; pos >= 0; pos--) {
            backwardsWord += word.charAt(pos);
        }

        //Compare the words
        if (word.equalsIgnoreCase(backwardsWord)) {
            JOptionPane.showMessageDialog(null, word + " in reverse is " + backwardsWord
                    + ".\nIt IS a palindrome.");
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, word + " in reverse is " + backwardsWord
                    + ".\nIt IS NOT a palindrome.");
            System.exit(0);
        }
    }
}
